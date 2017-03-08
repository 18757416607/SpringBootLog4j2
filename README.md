# SpringBootLog4j2

<h1>Steps to add log4j2 to SpringBoot</h1>

<h3>1)Exclude default logging (logback) in SpringBoot</h3>
To do this add into pom.xml
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>ch.qos.logback</groupId>
                    <artifactId>logback-classic</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

<h3>2)Add log4j2 and slf4j dependencies</h3>

        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.24</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-slf4j-impl</artifactId>
            <version>2.7</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>2.7</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.7</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-jcl</artifactId>
            <version>2.7</version>
        </dependency>
        
<h3> 3) create config file log4j2.xml or write log4j2 config into application.properties</h3>
 
 
 
 <h5>log4j2.xml</h5>
 
<pre>
        <?xml version="1.0" encoding="UTF-8"?>
        <Configuration status="WARN">
            <Properties>
                <Property name="logPath">logs</Property>
                <Property name="patternLayout">%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n</Property>
            </Properties>
            <Appenders>
                <Console name="consoleAppender" target="SYSTEM_OUT">
                    <PatternLayout pattern="${patternLayout}" />
                </Console>
                <File name="fileAppender" fileName="${logPath}/app_log.log" >
                    <PatternLayout pattern="${patternLayout}" />
                </File>
            </Appenders>
            <Loggers>
                <Root level="info">
                    <AppenderRef ref="consoleAppender"/>
                    <AppenderRef ref="fileAppender"/>
                </Root>
            </Loggers>
        </Configuration>
</pre>


<h5>application.properties</h5>

<pre>
        logging.level.org.springframework.web=INFO
        logging.level.guru.springframework.blogs.controllers=INFO
        logging.level.org.hibernate=ERROR
        logging.file=logs/spring-boot-logging.log
        log4j.logger.org.thymeleaf=DEBUG
</pre>


<h3>NOTICE: Can be troubles with versions</h3>
        
