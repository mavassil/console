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

/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */

package org.jboss.hal.dmr;

/**
 * String constants frequently used in model descriptions and DMR operations.
 *
 * @author Brian Stansberry
 * @author Harald Pehl
 */
@SuppressWarnings({"DuplicateStringLiteralInspection", "SpellCheckingInspection"})
public interface ModelDescriptionConstants {

    // KEEP THESE IN ALPHABETICAL ORDER!
    String ACCEPTOR = "acceptor";
    String ACCESS_CONSTRAINTS = "access-constraints";
    String ACCESS_CONTROL = "access-control";
    String ACCESS_LOG = "access-log";
    String ACCESS_TYPE = "access-type";
    String ACL_MODULE = "acl-module";
    String ADD = "add";
    String ADD_PREFIX_ROLE_MAPPER = "add-prefix-role-mapper";
    String ADD_SUFFIX_ROLE_MAPPER = "add-suffix-role-mapper";
    String ADDRESS = "address";
    String ADDRESS_SETTING = "address-setting";
    String ADMIN_OBJECTS = "admin-objects";
    String AGGREGATE_HTTP_SERVER_MECHANISM_FACTORY = "aggregate-http-server-mechanism-factory";
    String AGGREGATE_PRINCIPAL_DECODER = "aggregate-principal-decoder";
    String AGGREGATE_PRINCIPAL_TRANSFORMER = "aggregate-principal-transformer";
    String AGGREGATE_PROVIDERS = "aggregate-providers";
    String AGGREGATE_REALM = "aggregate-realm";
    String AGGREGATE_ROLE_MAPPER = "aggregate-role-mapper";
    String AGGREGATE_SASL_SERVER_FACTORY = "aggregate-sasl-server-factory";
    String AGGREGATE_SECURITY_EVENT_LISTENER = "aggregate-security-event-listener";
    String AJP_LISTENER = "ajp-listener";
    String ALLOW_RESOURCE_SERVICE_RESTART = "allow-resource-service-restart";
    String ALLOWED = "allowed";
    String ALLOWED_ORIGINS = "allowed-origins";
    String ALTERNATIVES = "alternatives";
    String ANY = "any";
    String ARCHIVE = "archive";
    String ASYNC_OPERATIONS = "async-operations";
    String ATTRIBUTE_GROUP = "attribute-group";
    String ATTRIBUTE_MAPPING = "attribute-mapping";
    String ATTRIBUTES = "attributes";
    String ATTRIBUTES_ONLY = "attributes-only";
    String AUTHENTICATION_CONFIGURATION = "authentication-configuration";
    String AUTHENTICATION_CONTEXT = "authentication-context";
    String AUTHOR = "author";
    String AUTO_START = "auto-start";
    String BACKUP = "backup";
    String BACKUP_FOR = "backup-for";
    String BACKUPS = "backups";
    String BASE_ROLE = "base-role";
    String BATCH_JBERET = "batch-jberet";
    String BATCH_SIZE = "batch-size";
    String BEHIND = "behind";
    String BINARY = "binary";
    String BINARY_JDBC = "binary-jdbc";
    String BLOCKING = "blocking";
    String BOOT_TIME = "boot-time";
    String BRIDGE = "bridge";
    String BROADCAST_GROUP = "broadcast-group";
    String BROWSE_CONTENT = "browse-content";
    String BUFFER_CACHE = "buffer-cache";
    String BUFFER_POOL = "buffer-pool";
    String BUNDLED = "bundled";
    String CACHE_CONTAINER = "cache-container";
    String CACHE_TYPE = "cache-type";
    String CACHING_REALM = "caching-realm";
    String CAPABILITY_REFERENCE = "capability-reference";
    String CHAINED_PRINCIPAL_TRANSFORMER = "chained-principal-transformer";
    String CHANNEL = "channel";
    String CHILD_TYPE = "child-type";
    String CHILDREN = "children";
    String CLASS_NAME = "class-name";
    String CLIENT_CONFIG = "client-config";
    String CLIENT_MAPPINGS = "client-mappings";
    String CLIENT_SSL_CONTEXT = "client-ssl-context";
    String CLONE = "clone";
    String CLUSTER_CONNECTION = "cluster-connection";
    String COMBINED_DESCRIPTIONS = "combined-descriptions";
    String COMPONENT = "component";
    String COMPOSITE = "composite";
    String CONCATENATING_PRINCIPAL_DECODER = "concatenating-principal-decoder";
    String CONFIG_PROPERTIES = "config-properties";
    String CONFIGURABLE_HTTP_SERVER_MECHANISM_FACTORY = "configurable-http-server-mechanism-factory";
    String CONFIGURABLE_SASL_SERVER_FACTORY = "configurable-sasl-server-factory";
    String CONFIGURATION = "configuration";
    String CONNECTION_DEFINITIONS = "connection-definitions";
    String CONNECTION_FACTORY = "connection-factory";
    String CONNECTION_URL = "connection-url";
    String CONNECTOR = "connector";
    String CONNECTOR_NAME = "connector-name";
    String CONNECTOR_SERVICE = "connector-service";
    String CONNECTORS = "connectors";
    String CONSTANT_PERMISSION_MAPPER = "constant-permission-mapper";
    String CONSTANT_PRINCIPAL_DECODER = "constant-principal-decoder";
    String CONSTANT_PRINCIPAL_TRANSFORMER = "constant-principal-transformer";
    String CONSTANT_REALM_MAPPER = "constant-realm-mapper";
    String CONSTANT_ROLE_MAPPER = "constant-role-mapper";
    String CONTENT = "content";
    String CONTEXT_ROOT = "context-root";
    String CONTEXT_SERVICE = "context-service";
    String CORE_SERVICE = "core-service";
    String CRAWLER_SESSION_MANAGEMENT = "crawler-session-management";
    String CREDENTIAL_REFERENCE = "credential-reference";
    String CREDENTIAL_STORE = "credential-store";
    String CUSTOM = "custom";
    String CUSTOM_CREDENTIAL_SECURITY_FACTORY = "custom-credential-security-factory";
    String CUSTOM_MODIFIABLE_REALM = "custom-modifiable-realm";
    String CUSTOM_PERMISSION_MAPPER = "custom-permission-mapper";
    String CUSTOM_PRINCIPAL_DECODER = "custom-principal-decoder";
    String CUSTOM_PRINCIPAL_TRANSFORMER = "custom-principal-transformer";
    String CUSTOM_REALM = "custom-realm";
    String CUSTOM_REALM_MAPPER = "custom-realm-mapper";
    String CUSTOM_ROLE_DECODER = "custom-role-decoder";
    String CUSTOM_ROLE_MAPPER = "custom-role-mapper";
    String DATA_COLUMN = "data-column";
    String DATA_SOURCE = "data-source";
    String DATASOURCES = "datasources";
    String DEFAULT = "default";
    String DEFAULT_BINDINGS = "default-bindings";
    String DEFAULT_CACHE = "default-cache";
    String DEFAULT_HOST = "default-host";
    String DEFAULT_INTERFACE = "default-interface";
    String DEPENDENT_ADDRESS = "dependent-address";
    String DEPLOY = "deploy";
    String DEPLOYMENT = "deployment";
    String DEPLOYMENT_NAME = "deployment-name";
    String DEPLOYMENT_SCANNER = "deployment-scanner";
    String DEPRECATED = "deprecated";
    String DESCRIPTION = "description";
    String DESTINATION_ADDRESS = "destination-address";
    String DESTINATION_PORT = "destination-port";
    String DIR_CONTEXT = "dir-context";
    String DISABLED = "disabled";
    String DISABLED_TIME = "disabled-time";
    String DISCOVERY_GROUP = "discovery-group";
    String DIVERT = "divert";
    String DRIVER_CLASS = "driver-class";
    String DRIVER_CLASS_NAME = "driver-class-name";
    String DRIVER_DATASOURCE_CLASS_NAME = "driver-datasource-class-name";
    String DRIVER_MAJOR_VERSION = "driver-major-version";
    String DRIVER_MINOR_VERSION = "driver-minor-version";
    String DRIVER_MODULE_NAME = "driver-module-name";
    String DRIVER_NAME = "driver-name";
    String DRIVER_VERSION = "driver-version";
    String DRIVER_XA_DATASOURCE_CLASS_NAME = "driver-xa-datasource-class-name";
    String EE = "ee";
    String EJB3 = "ejb3";
    String ELYTRON = "elytron";
    String ENABLED = "enabled";
    String ENABLED_TIME = "enabled-time";
    String ENABLING = "enabling";
    String ENDPOINT_CONFIG = "endpoint-config";
    String EVICTION = "eviction";
    String EXCEPTIONS = "exceptions";
    String EXCLUDE = "exclude";
    String EXECUTE = "execute";
    String EXPIRATION = "expiration";
    String EXPLODE = "explode";
    String EXPLODED = "exploded";
    String EXPRESSION = "expression";
    String EXPRESSIONS_ALLOWED = "expressions-allowed";
    String EXTENSION_POINT = "extension-point";
    String FAILED = "failed";
    String FAILED_OPERATION = "failed-operation";
    String FAILED_SERVICES = "failed-services";
    String FAILURE_DESCRIPTION = "failure-description";
    String FETCH_SIZE = "fetch-size";
    String FILE = "file";
    String FILE_AUDIT_LOG = "file-audit-log";
    String FILESYSTEM_REALM = "filesystem-realm";
    String FILTER_REF = "filter-ref";
    String FILTERING_KEY_STORE = "filtering-key-store";
    String FILTERS = "filters";
    String FIXED_PORT = "fixed-port";
    String FLUSH_ALL_CONNECTION_IN_POOL = "flush-all-connection-in-pool";
    String FLUSH_GRACEFULLY_CONNECTION_IN_POOL = "flush-gracefully-connection-in-pool";
    String FLUSH_IDLE_CONNECTION_IN_POOL = "flush-idle-connection-in-pool";
    String FLUSH_INVALID_CONNECTION_IN_POOL = "flush-invalid-connection-in-pool";
    String FORK = "fork";
    String FROM = "from";
    String FULL_REPLACE_DEPLOYMENT = "full-replace-deployment";
    String GLOBAL_MODULES = "global-modules";
    String GROUP = "group";
    String GROUPING_HANDLER = "grouping-handler";
    String HA_POLICY = "ha-policy";
    String HAL_INDEX = "hal-index";
    String HAL_LABEL = "hal-label";
    String HANDLER = "handler";
    String HANDLERS = "handlers";
    String HASH = "hash";
    String HEADER_NAME = "header-name";
    String HOMEPAGE = "homepage";
    String HOST = "host";
    String HOST_SCOPED_ROLE = "host-scoped-role";
    String HOST_STATE = "host-state";
    String HOSTS = "hosts";
    String HTTP = "http";
    String HTTP_ACCEPTOR = "http-acceptor";
    String HTTP_AUTHENTICATION_FACTORY = "http-authentication-factory";
    String HTTP_AUTNETICATION_FACTORY = "http-authentication-factory";
    String HTTP_CONNECTOR = "http-connector";
    String HTTP_INVOKER = "http-invoker";
    String HTTP_LISTENER = "http-listener";
    String HTTP_UPGRADE = "http-upgrade";
    String HTTPS = "https";
    String HTTPS_LISTENER = "https-listener";
    String ID_COLUMN = "id-column";
    String IDENTITY_REALM = "identity-realm";
    String IDENTITY_MAPPING = "identity-mapping";
    String IIOP_OPENJDK = "iiop-openjdk";
    String IMAP = "imap";
    String IN_VM_ACCEPTOR = "in-vm-acceptor";
    String IN_VM_CONNECTOR = "in-vm-connector";
    String INCLUDE = "include";
    String INCLUDE_ALIASES = "include-aliases";
    String INCLUDE_ALL = "include-all";
    String INCLUDE_DEFAULTS = "include-defaults";
    String INCLUDE_RUNTIME = "include-runtime";
    String INCLUDE_SINGLETONS = "include-singletons";
    String INCLUDES = "includes";
    String INDEX = "index";
    String INET_ADDRESS = "inet-address";
    String INFINISPAN = "infinispan";
    String INTERFACE = "interface";
    String IO = "io";
    String ITEM = "item";
    String JCA = "jca";
    String JDBC = "jdbc";
    String JDBC_DRIVER = "jdbc-driver";
    String JDBC_REALM = "jdbc-realm";
    String JGROUPS = "jgroups";
    String JMS_BRIDGE = "jms-bridge";
    String JMS_QUEUE = "jms-queue";
    String JMS_TOPIC = "jms-topic";
    String JMX = "jmx";
    String JNDI_NAME = "jndi-name";
    String JPA = "jpa";
    String JSP = "jsp";
    String JVM = "jvm";
    String KERBEROS_SECURITY_FACTORY = "kerberos-security-factory";
    String KEY_MANAGER = "key-manager";
    String KEY_STORE = "key-store";
    String KEY_STORE_REALM = "key-store-realm";
    String KILL = "kill";
    String LAUNCH_TYPE = "launch-type";
    String LDAP_KEY_STORE = "ldap-key-store";
    String LDAP_REALM = "ldap-realm";
    String LEVEL = "level";
    String LICENSE = "license";
    String LINES = "lines";
    String LIST_ADD_OPERATION = "list-add";
    String LIST_REMOVE_OPERATION = "list-remove";
    String LISTENER = "listener";
    String LIVE_ONLY = "live-only";
    String LOCAL_DESTINATION_OUTBOUND_SOCKET_BINDING = "local-destination-outbound-socket-binding";
    String LOCATION = "location";
    String LOCKING = "locking";
    String LOGGING = "logging";
    String LOGGING_PROFILE = "logging-profile";
    String LOGICAL_PERMISSION_MAPPER = "logical-permission-mapper";
    String LOGICAL_ROLE_MAPPER = "logical-role-mapper";
    String LOGIN_MODULE = "login-module";
    String MAIL = "mail";
    String MAIL_SESSION = "mail-session";
    String MANAGED = "managed";
    String MANAGED_EXECUTOR_SERVICE = "managed-executor-service";
    String MANAGED_SCHEDULED_EXECUTOR_SERVICE = "managed-scheduled-executor-service";
    String MANAGED_THREAD_FACTORY = "managed-thread-factory";
    String MANAGEMENT = "management";
    String MANAGEMENT_HTTP = "management-http";
    String MANAGEMENT_HTTPS = "management-https";
    String MANAGEMENT_MAJOR_VERSION = "management-major-version";
    String MANAGEMENT_MICRO_VERSION = "management-micro-version";
    String MANAGEMENT_MINOR_VERSION = "management-minor-version";
    String MAPPED_REGEX_REALM_MAPPER = "mapped-regex-realm-mapper";
    String MAPPING_MODULE = "mapping-module";
    String MASTER = "master";
    String MAX = "max";
    String MAX_THREADS = "max-threads";
    String MECHANISM_CONFIGURATIONS = "mechanism-configurations";
    String MECHANISM_NAME = "mechanism-name";
    String MECHANISM_PROVIDER_FILTERING_SASL_SERVER_FACTORY = "mechanism-provider-filtering-sasl-server-factory";
    String MECHANISM_REALM_CONFIGURATIONS = "mechanism-realm-configurations";
    String MESSAGING_ACTIVEMQ = "messaging-activemq";
    String METRIC = "metric";
    String MIME_MAPPING = "mime-mapping";
    String MIN = "min";
    String MISSING_TRANSITIVE_DEPENDENCY_PROBLEMS = "missing-transitive-dependency-problems";
    String MIXED_JDBC = "mixed-jdbc";
    String MODCLUSTER = "modcluster";
    String MODE = "mode";
    String MODEL_DESCRIPTION = "model-description";
    String MODULE = "module";
    String MULTICAST_ADDRESS = "multicast-address";
    String MULTICAST_PORT = "multicast-port";
    String NAME = "name";
    String NEW_IDENTITY_ATTRIBUTES = "new-identity-attributes";
    String NEW_ITEM_ATTRIBUTES = "new-item-attributes";
    String NEW_ITEM_PATH = "new-item-path";
    String NEW_ITEM_RDN = "new-item-rdn";
    String NEW_ITEM_TEMPLATE = "new-item-template";
    String NILLABLE = "nillable";
    String NONE = "none";
    String NOT = "not";
    String OP = "operation";
    String OPERATION = "operation";
    String OPERATION_HEADERS = "operation-headers";
    String OPERATIONS = "operations";
    String OUTBOUND_SOCKET_BINDING_REF = "outbound-socket-binding-ref";
    String OUTCOME = "outcome";
    String OTP_CREDENTIAL_MAPPER = "otp-credential-mapper";

    String PARTITION_HANDLING = "partition-handling";
    String PASSWORD = "password";
    String PATH = "path";
    String PATTERN = "pattern";
    String PATTERN_FILTER = "pattern-filter";
    String PERIODIC_ROTATING_FILE_AUDIT_LOG = "periodic-rotating-file-audit-log";
    String PERMISSIONS = "permissions";
    String PERSISTENCE = "persistence";
    String PERSISTENT_SESSIONS = "persistent-sessions";
    String POLICY = "policy";
    String POLICY_MODULE = "policy-module";
    String POOLED_CONNECTION_FACTORY = "pooled-connection-factory";
    String POP3 = "pop3";
    String PORT = "port";
    String PORT_OFFSET = "port-offset";
    String POSSIBLE_CAUSES = "possible-causes";
    String POST_HANDLER_CHAIN = "post-handler-chain";
    String PRE_HANDLER_CHAIN = "pre-handler-chain";
    String PREDEFINED_FILTER = "predefined-filter";
    String PREFIX = "prefix";
    String PRINCIPAL_QUERY = "principal-query";
    String PRIORITY = "priority";
    String PROCESS_STATE = "process-state";
    String PRODUCT_NAME = "product-name";
    String PRODUCT_VERSION = "product-version";
    String PROFILE = "profile";
    String PROFILE_NAME = "profile-name";
    String PROPERTIES_REALM = "properties-realm";
    String PROPERTY = "property";
    String PROTOCOL = "protocol";
    String PROVIDER = "provider";
    String PROVIDER_NAME = "provider-name";
    String PROVIDER_HTTP_SERVER_MECHANISM_FACTORY = "provider-http-server-mechanism-factory";
    String PROVIDER_LOADER = "provider-loader";
    String PROVIDER_MODULE = "provider-module";
    String PROVIDER_SASL_SERVER_FACTORY = "provider-sasl-server-factory";
    String PROXIES = "proxies";
    String QUERY = "query";
    String QUEUE = "queue";
    String QUEUE_LENGTH = "queue-length";
    String QUEUE_NAME = "queue-name";
    String READ = "read";
    String READ_ATTRIBUTE_OPERATION = "read-attribute";
    String READ_BOOT_ERRORS = "read-boot-errors";
    String READ_CHILDREN_NAMES_OPERATION = "read-children-names";
    String READ_CHILDREN_RESOURCES_OPERATION = "read-children-resources";
    String READ_CHILDREN_TYPES_OPERATION = "read-children-types";
    String READ_CONTENT = "read-content";
    String READ_LOG_FILE = "read-log-file";
    String READ_ONLY = "read-only";
    String READ_RESOURCE_DESCRIPTION_OPERATION = "read-resource-description";
    String READ_RESOURCE_OPERATION = "read-resource";
    String READ_WRITE = "read-write";
    String REALM = "realm";
    String REALM_NAME = "realm-name";
    String REASON = "reason";
    String RECURSIVE = "recursive";
    String RECURSIVE_DEPTH = "recursive-depth";
    String REGEX_PRINCIPAL_TRANSFORMER = "regex-principal-transformer";
    String REGEX_VALIDATING_PRINCIPAL_TRANSFORMER = "regex-validating-principal-transformer";
    String RELATIVE_TO = "relative-to";
    String RELAY = "relay";
    String RELEASE_CODENAME = "release-codename";
    String RELEASE_VERSION = "release-version";
    String RELOAD = "reload";
    String RELOAD_HOST = "reload-host";
    String RELOAD_REQUIRED = "reload-required";
    String RELOAD_SERVERS = "reload-servers";
    String REMOTE = "remote";
    String REMOTE_ACCEPTOR = "remote-acceptor";
    String REMOTE_COMMAND = "remote-command";
    String REMOTE_CONNECTOR = "remote-connector";
    String REMOTE_DESTINATION_OUTBOUND_SOCKET_BINDING = "remote-destination-outbound-socket-binding";
    String REMOTING = "remoting";
    String REMOVE = "remove";
    String REPLICATION_COLOCATED = "replication-colocated";
    String REPLICATION_MASTER = "replication-master";
    String REPLICATION_SLAVE = "replication-slave";
    String REPLY_PROPERTIES = "reply-properties";
    String REQUEST_CONTROLLER = "request-controller";
    String REQUEST_PROPERTIES = "request-properties";
    String REQUIRED = "required";
    String REQUIRES = "requires";
    String RESOLVE_EXPRESSION = "resolve-expression";
    String RESOLVE_EXPRESSION_ON_DOMAIN = "resolve-expression-on-domain";
    String RESOURCE_ADAPTER = "resource-adapter";
    String RESOURCE_ADAPTERS = "resource-adapters";
    String RESPONSE = "response";
    String RESPONSE_HEADERS = "response-headers";
    String RESTART = "restart";
    String RESTART_REQUIRED = "restart-required";
    String RESTART_SERVERS = "restart-servers";
    String RESULT = "result";
    String RESUME = "resume";
    String RESUME_SERVERS = "resume-servers";
    String ROLE = "role";
    String ROLE_MAPPING = "role-mapping";
    String ROLES = "roles";
    String RUNNING_MODE = "running-mode";
    String RUNTIME = "runtime";
    String RUNTIME_NAME = "runtime-name";
    String SASL_AUTHENTICATION_FACTORY = "sasl-authentication-factory";
    String SASL_PROTOCOL = "sasl-protocol";
    String SCRIPT = "script";
    String SEARCH_PATH = "search-path";
    String SECURE_SOCKET_BINDING = "secure-socket-binding";
    String SECURITY = "security";
    String SECURITY_DOMAIN = "security-domain";
    String SECURITY_REALM = "security-realm";
    String SECURITY_SETTING = "security-setting";
    String SELECT = "select";
    String SELECTOR = "selector";
    String SENSITIVE = "sensitive";
    String SERVER = "server";
    String SERVER_CONFIG = "server-config";
    String SERVER_GROUP = "server-group";
    String SERVER_GROUP_SCOPED_ROLE = "server-group-scoped-role";
    String SERVER_GROUPS = "server-groups";
    String SERVER_SSL_CONTEXT = "server-ssl-context";
    String SERVER_STATE = "server-state";
    String SERVER_TYPE = "server-type";
    String SERVICE = "service";
    String SERVICE_LOADER_HTTP_SERVER_MECHANISM_FACTORY = "service-loader-http-server-mechanism-factory";
    String SERVICE_LOADER_SASL_SERVER_FACTORY = "service-loader-sasl-server-factory";
    String SERVICES_MISSING_DEPENDENCIES = "services-missing-dependencies";
    String SERVICES_MISSING_TRANSITIVE_DEPENDENCIES = "services-missing-transitive-dependencies";
    String SERVLET_CONTAINER = "servlet-container";
    String SESSION_COOKIE = "session-cookie";
    String SHARED_STORE_COLOCATED = "shared-store-colocated";
    String SHARED_STORE_MASTER = "shared-store-master";
    String SHARED_STORE_SLAVE = "shared-store-slave";
    String SHUTDOWN = "shutdown";
    String SIMPLE_PERMISSION_MAPPER = "simple-permission-mapper";
    String SIMPLE_REGEX_REALM_MAPPER = "simple-regex-realm-mapper";
    String SIMPLE_ROLE_DECODER = "simple-role-decoder";
    String SINCE = "since";
    String SINGLE_SIGN_ON = "single-sign-on";
    String SIZE_ROTATING_FILE_AUDIT_LOG = "size-rotating-file-audit-log";
    String SLAVE = "slave";
    String SMTP = "smtp";
    String SOCKET_BINDING = "socket-binding";
    String SOCKET_BINDING_DEFAULT_INTERFACE = "socket-binding-default-interface";
    String SOCKET_BINDING_GROUP = "socket-binding-group";
    String SOCKET_BINDING_PORT_OFFSET = "socket-binding-port-offset";
    String SOCKET_BINDING_REF = "socket-binding-ref";
    String SOURCE_NETWORK = "source-network";
    String SQL = "sql";
    String SSL_CONTEXT = "ssl-context";
    String STACK = "stack";
    String STANDALONE = "standalone";
    String STANDARD_ROLE_NAMES = "standard-role-names";
    String START = "start";
    String START_SERVERS = "start-servers";
    String STATE_TRANSFER = "state-transfer";
    String STATIC_CONNECTORS = "static-connectors";
    String STATISTICS_ENABLED = "statistics-enabled";
    String STATUS = "status";
    String STEPS = "steps";
    String STOP = "stop";
    String STOP_SERVERS = "stop-servers";
    String STORAGE = "storage";
    String STORE = "store";
    String STREAM = "stream";
    String STRING = "string";
    String STYLESHEETS = "stylesheets";
    String SUBDEPLOYMENT = "subdeployment";
    String SUBSYSTEM = "subsystem";
    String SUCCESS = "success";
    String SUGGEST_CAPABILITIES = "suggest-capabilities";
    String SUSPEND = "suspend";
    String SUSPEND_SERVERS = "suspend-servers";
    String SUSPEND_STATE = "suspend-state";
    String SYSLOG_AUDIT_LOG = "syslog-audit-log";
    String SYSTEM_PROPERTY = "system-property";
    String TABLE = "table";
    String TAIL = "tail";
    String TEST_CONNECTION_IN_POOL = "test-connection-in-pool";
    String THREAD_FACTORY = "thread-factory";
    String THREAD_POOL = "thread-pool";
    String THROUGH = "through";
    String TIMEOUT = "timeout";
    String TIMESTAMP_COLUMN = "timestamp-column";
    String TO = "to";
    String TO_PROFILE = "to-profile";
    String TOKEN_REALM = "token-realm";
    String TRANSACTION = "transaction";
    String TRANSACTION_SUPPORT = "transaction-support";
    String TRANSACTIONS = "transactions";
    String TRANSPORT = "transport";
    String TRIM_DESCRIPTIONS = "trim-descriptions";
    String TRUST_MANAGER = "trust-manager";
    String TRUST_MODULE = "trust-module";
    String TYPE = "type";
    String UNDEFINE_ATTRIBUTE_OPERATION = "undefine-attribute";
    String UNDEFINED = "undefined";
    String UNDEPLOY = "undeploy";
    String UNDERTOW = "undertow";
    String UNIT = "unit";
    String URL = "url";
    String USER_NAME = "user-name";
    String USER_PASSWORD_MAPPER = "user-password-mapper";
    String USERNAME = "username";
    String VALUE = "value";
    String VALUE_TYPE = "value-type";
    String VERBOSE = "verbose";
    String VERSION = "version";
    String WEBSERVICES = "webservices";
    String WEBSOCKETS = "websockets";
    String WELCOME_FILE = "welcome-file";
    String WHERE = "where";
    String WHOAMI = "whoami";
    String WM_SECURITY_MAPPING_GROUPS = "wm-security-mapping-groups";
    String WM_SECURITY_MAPPING_USERS = "wm-security-mapping-users";
    String WORKER = "worker";
    String WORKMANAGER = "workmanager";
    String WRITE = "write";
    String WRITE_ATTRIBUTE_OPERATION = "write-attribute";
    String X500_ATTRIBUTE_PRINCIPAL_DECODER = "x500-attribute-principal-decoder";
    String XA_DATA_SOURCE = "xa-data-source";
    String X509_CREDENTIAL_MAPPER = "x509-credential-mapper";
}

