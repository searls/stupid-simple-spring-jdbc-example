Silly simple little example that (I think) represents the bare minimum amount of work to just get a transactional test talking to a database connection using Spring JDBC.

    [INFO] Scanning for projects...
    [INFO]                                                                         
    [INFO] ------------------------------------------------------------------------
    [INFO] Building jdbc-lol 0.0.1-SNAPSHOT
    [INFO] ------------------------------------------------------------------------
    [INFO] 
    [INFO] --- maven-clean-plugin:2.4.1:clean (default-clean) @ jdbc-lol ---
    [INFO] Deleting /Users/justin/code/java/workspaces/spikes/jdbc-lol/target
    [INFO] 
    [INFO] --- maven-resources-plugin:2.4.3:resources (default-resources) @ jdbc-lol ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /Users/justin/code/java/workspaces/spikes/jdbc-lol/src/main/resources
    [INFO] 
    [INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ jdbc-lol ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO] 
    [INFO] --- maven-resources-plugin:2.4.3:testResources (default-testResources) @ jdbc-lol ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 2 resources
    [INFO] 
    [INFO] --- maven-compiler-plugin:2.3.2:testCompile (default-testCompile) @ jdbc-lol ---
    [INFO] Compiling 1 source file to /Users/justin/code/java/workspaces/spikes/jdbc-lol/target/test-classes
    [INFO] 
    [INFO] --- maven-surefire-plugin:2.7.1:test (default-test) @ jdbc-lol ---
    [INFO] Surefire report directory: /Users/justin/code/java/workspaces/spikes/jdbc-lol/target/surefire-reports

    -------------------------------------------------------
     T E S T S
    -------------------------------------------------------
    Running com.github.searls.jdbc.PantsIntegrationTest
    Apr 19, 2011 9:41:06 PM org.springframework.test.context.TestContextManager retrieveTestExecutionListeners
    INFO: @TestExecutionListeners is not present for class [class com.github.searls.jdbc.PantsIntegrationTest]: using defaults.
    Apr 19, 2011 9:41:07 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
    INFO: Loading XML bean definitions from class path resource [test-context.xml]
    Apr 19, 2011 9:41:07 PM org.springframework.context.support.AbstractApplicationContext prepareRefresh
    INFO: Refreshing org.springframework.context.support.GenericApplicationContext@2d58f9d3: startup date [Tue Apr 19 21:41:07 EDT 2011]; root of context hierarchy
    Apr 19, 2011 9:41:07 PM org.springframework.core.io.support.PropertiesLoaderSupport loadProperties
    INFO: Loading properties file from class path resource [jdbc.properties]
    Apr 19, 2011 9:41:07 PM org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
    INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@4cedf389: defining beans [dataSource,org.springframework.beans.factory.config.PropertyPlaceholderConfigurer#0,transactionManager,org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.internalCommonAnnotationProcessor]; root of factory hierarchy
    Apr 19, 2011 9:41:07 PM org.springframework.jdbc.datasource.DriverManagerDataSource setDriverClassName
    INFO: Loaded JDBC driver: org.hsqldb.jdbcDriver
    Apr 19, 2011 9:41:08 PM org.springframework.test.context.transaction.TransactionalTestExecutionListener startNewTransaction
    INFO: Began transaction (1): transaction manager [org.springframework.jdbc.datasource.DataSourceTransactionManager@79226a77]; rollback [true]
    Apr 19, 2011 9:41:08 PM org.springframework.test.context.transaction.TransactionalTestExecutionListener endTransaction
    INFO: Rolled back transaction after test execution for test context [[TestContext@87e9ce2 testClass = PantsIntegrationTest, locations = array<String>['classpath:/test-context.xml'], testInstance = com.github.searls.jdbc.PantsIntegrationTest@306dbdc9, testMethod = shouldPullOutWhatYouGiveIt@PantsIntegrationTest, testException = [null]]]
    Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.272 sec

    Results :

    Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 6.482s
    [INFO] Finished at: Tue Apr 19 21:41:08 EDT 2011
    [INFO] Final Memory: 9M/81M
    [INFO] ------------------------------------------------------------------------
