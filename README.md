# 클론코딩 

### 의존성

- Sring Boot DevTools
- Lombok
- hibernate
- Spring Data JPA
- MariaDB Driver
- Spring Security
- Spring Web
- oauth2-client

```xml
<!-- 시큐리티 태그 라이브러리 -->
<dependency>
	<groupId>org.springframework.security</groupId>
	<artifactId>spring-security-taglibs</artifactId>
</dependency>

<!-- JSP 템플릿 엔진 -->
<dependency>
	<groupId>org.apache.tomcat</groupId>
	<artifactId>tomcat-jasper</artifactId>
	<version>9.0.43</version>
</dependency>

<!-- JSTL -->
<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>jstl</artifactId>
</dependency>

<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-aop</artifactId>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

### yml 설정

```yml
spring:
  mvc:
    view:
      prefix: /WEB-INF/views/
      suffix: .jsp

  #  datasource:
  #    driver-class-name: org.mariadb.jdbc.Driver
  #    url: jdbc:mariadb://localhost:3306/photogram?serverTimezone=Asia/Seoul
  #    username: jsh
  #    password: 1234
  #    
  datasource:
    hikari:
      jdbc-url: jdbc:h2:mem:testdb;MODE=MYSQL
      username: sa

  jpa:
    open-in-view: true
    hibernate:
      naming:
        physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
    show-sql: true
    properties:
      hibernate:
        dialect: org.hibernate.dialect.MySQL57Dialect

  h2:
    console:
      settings:
        web-allow-others: true
      enabled: true

  servlet:
    multipart:
      enabled: true
      max-file-size: 2MB

  security:
    user:
      name: test
      password: 1234

    oauth2:
      client:
        registration:
          facebook:
            client-id: 315293796826930
            client-secret: 487af9479023b8c0e58f913b411327cf
            scope:
              - public_profile
              - email


file:
  path: D:/image/

```

### 태그라이브러리

```jsp
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
```
