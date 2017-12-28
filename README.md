# Spring Boot y JSP

Se creara un proyecto spring-boot configurado con war, donde podremos utilizar el motor de plantillas JSP.
Debemos agregar las siguientes dependencias al pom.xml para utilizar los JSP:
1. Dependencia JSTL:
```[xml]
<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>jstl</artifactId>
</dependency>
```
2. Dependencia Jasper:
```[xml]
<dependency>
	<groupId>org.apache.tomcat.embed</groupId>
	<artifactId>tomcat-embed-jasper</artifactId>
	<scope>provided</scope>
</dependency>
```
3. Correr la App: