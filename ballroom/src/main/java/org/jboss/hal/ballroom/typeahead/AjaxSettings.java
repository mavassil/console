/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.hal.ballroom.typeahead;

import elemental.xml.XMLHttpRequest;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static org.jboss.hal.resources.Names.OBJECT;

/**
 * Mapping for the settings used in the {@linkplain org.jboss.hal.ballroom.typeahead.RemoteOptions.Preparator#prepare
 * prepare} callback from typeahead.js. Actually this maps to the jQuery ajax settings.
 *
 * @author Harald Pehl
 * @see <a href="https://github.com/twitter/typeahead.js/blob/master/doc/bloodhound.md#remote">https://github.com/twitter/typeahead.js/blob/master/doc/bloodhound.md#remote</a>
 * @see <a href="https://api.jquery.com/jquery.ajax/#jQuery-ajax-settings">https://api.jquery.com/jquery.ajax/#jQuery-ajax-settings</a>
 */
@JsType(isNative = true, namespace = GLOBAL, name = OBJECT)
public class AjaxSettings {

    @JsType(isNative = true, namespace = GLOBAL, name = OBJECT)
    public static class Accepts {
        public String text;
    }


    @JsType(isNative = true, namespace = GLOBAL, name = OBJECT)
    public static class XHRFields {
        public boolean withCredentials;
    }


    @JsFunction
    @FunctionalInterface
    public interface BeforeSend {
        void beforeSend(XMLHttpRequest xhr, AjaxSettings settings);
    }


    public Accepts accepts;
    public BeforeSend beforeSend;
    public String contentType;
    public String data;
    public String dataType;
    public String method;
    public XHRFields xhrFields;
}
