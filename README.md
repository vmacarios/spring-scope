# spring-scope
This example shows how to configure the bean scope in the Spring XML configuration file

MyLoggerConfig defines the Spring log level. In this case, it's set as FINE.

SetterDemoApp demonstrate the use of setters to inject the FortuneService dependency on 
CricketCoach and also the injection of literal values from a file.

In BeanScopeDemoApp is possible to see that if the bean scope is set as "prototype", 
each bean will be created in different memory position. 