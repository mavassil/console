/*
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.hal.client.runtime.server;

import java.util.List;
import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import org.jboss.hal.core.runtime.group.ServerGroup;
import org.jboss.hal.core.runtime.host.Host;
import org.jboss.hal.core.finder.Finder;
import org.jboss.hal.core.finder.FinderPath;
import org.jboss.hal.core.mbui.MbuiPresenter;
import org.jboss.hal.core.mbui.MbuiView;
import org.jboss.hal.core.mvp.HasVerticalNavigation;
import org.jboss.hal.core.runtime.server.Server;
import org.jboss.hal.dmr.dispatch.Dispatcher;
import org.jboss.hal.dmr.model.Composite;
import org.jboss.hal.dmr.model.CompositeResult;
import org.jboss.hal.dmr.model.NamedNode;
import org.jboss.hal.dmr.model.Operation;
import org.jboss.hal.dmr.model.ResourceAddress;
import org.jboss.hal.meta.AddressTemplate;
import org.jboss.hal.meta.StatementContext;
import org.jboss.hal.meta.token.NameTokens;
import org.jboss.hal.resources.Names;
import org.jboss.hal.spi.Requires;

import static org.jboss.hal.dmr.ModelDescriptionConstants.*;
import static org.jboss.hal.dmr.ModelNodeHelper.asNamedNodes;

/**
 * @author Harald Pehl
 */
public class ServerPresenter extends MbuiPresenter<ServerPresenter.MyView, ServerPresenter.MyProxy> {

    static final String SERVER_ADDRESS = "/{selected.host}/{selected.server}";
    static final String INTERFACE_ADDRESS = SERVER_ADDRESS + "/interface=*";
    static final String JVM_ADDRESS = SERVER_ADDRESS + "/jvm=*";
    static final String PATH_ADDRESS = SERVER_ADDRESS + "/path=*";
    static final String SYSTEM_PROPERTY_ADDRESS = SERVER_ADDRESS + "/system-property=*";


    // @formatter:off
    @ProxyCodeSplit
    @NameToken(NameTokens.SERVER_CONFIGURATION)
    @Requires(value = {SERVER_ADDRESS, INTERFACE_ADDRESS, JVM_ADDRESS, PATH_ADDRESS, SYSTEM_PROPERTY_ADDRESS},
            recursive = false)
    public interface MyProxy extends ProxyPlace<ServerPresenter> {}

    public interface MyView extends MbuiView<ServerPresenter>, HasVerticalNavigation {
        void updateServer(Server server);
        void updateInterfaces(List<NamedNode> interfaces);
        void updateJvms(List<NamedNode> interfaces);
        void updatePaths(List<NamedNode> interfaces);
        void updateSystemProperties(List<NamedNode> interfaces);
    }
    // @formatter:on


    private final StatementContext statementContext;
    private final Dispatcher dispatcher;

    @Inject
    public ServerPresenter(final EventBus eventBus,
            final ServerPresenter.MyView view,
            final ServerPresenter.MyProxy proxy,
            final Finder finder,
            final StatementContext statementContext,
            final Dispatcher dispatcher) {
        super(eventBus, view, proxy, finder);
        this.statementContext = statementContext;
        this.dispatcher = dispatcher;
    }

    @Override
    protected void onBind() {
        super.onBind();
        getView().setPresenter(this);
    }

    @Override
    protected FinderPath finderPath() {
        if (ServerColumn.browseByHosts(finder.getContext())) {
            return new FinderPath()
                    .append(HOST, Host.id(statementContext.selectedHost()),
                            Names.HOST, statementContext.selectedHost())
                    .append(SERVER, Server.id(statementContext.selectedServer()),
                            Names.SERVER, statementContext.selectedServer());
        } else {
            return new FinderPath()
                    .append(SERVER_GROUP, ServerGroup.id(statementContext.selectedServerGroup()),
                            Names.SERVER_GROUP, statementContext.selectedServerGroup())
                    .append(SERVER, Server.id(statementContext.selectedServer()),
                            Names.SERVER, statementContext.selectedServer());
        }
    }

    @Override
    protected void reload() {
        ResourceAddress serverAddress = AddressTemplate.of(SERVER_ADDRESS).resolve(statementContext);
        Operation serverOp = new Operation.Builder(READ_RESOURCE_OPERATION, serverAddress)
                .param(INCLUDE_RUNTIME, true)
                .build();
        Operation interfacesOp = new Operation.Builder(READ_CHILDREN_RESOURCES_OPERATION, serverAddress)
                .param(CHILD_TYPE, INTERFACE)
                .param(INCLUDE_RUNTIME, true)
                .build();
        Operation jvmsOp = new Operation.Builder(READ_CHILDREN_RESOURCES_OPERATION, serverAddress)
                .param(CHILD_TYPE, JVM)
                .param(INCLUDE_RUNTIME, true)
                .build();
        Operation pathsOp = new Operation.Builder(READ_CHILDREN_RESOURCES_OPERATION, serverAddress)
                .param(CHILD_TYPE, PATH)
                .param(INCLUDE_RUNTIME, true)
                .build();
        Operation systemPropertiesOp = new Operation.Builder(READ_CHILDREN_RESOURCES_OPERATION, serverAddress)
                .param(CHILD_TYPE, SYSTEM_PROPERTY)
                .param(INCLUDE_RUNTIME, true)
                .build();

        dispatcher.execute(
                new Composite(serverOp, interfacesOp, jvmsOp, pathsOp, systemPropertiesOp),
                (CompositeResult result) -> {
                    getView().updateServer(new Server(statementContext.selectedHost(), result.step(0).get(RESULT)));
                    getView().updateInterfaces(asNamedNodes(result.step(1).get(RESULT).asPropertyList()));
                    getView().updateJvms(asNamedNodes(result.step(2).get(RESULT).asPropertyList()));
                    getView().updatePaths(asNamedNodes(result.step(3).get(RESULT).asPropertyList()));
                    getView().updateSystemProperties(asNamedNodes(result.step(4).get(RESULT).asPropertyList()));
                });
    }
}