# Product Management Demo
This project is a demo of Spring Boot web application serves users to manage product information.  
Instead of separate frontend and backend setup, this project make use of **stereotype controller** and **thymeleaf** template to serve web pages.  
To protect tampering of DB information, **spring security** feature is enabled to protected the products page.
As for application storage, sqlite3 is used.

# Environment Setup
- System: Ubuntu 22.04 or above
- Software/Packages
    - openjdk-21-jdk (JAVA 21)
    - maven
    - sqlite3

# Use
- Ensure similar system environment and required packages are intalled
- Open project folder, Run the following command to launch application  
    ```
    cd prdtmngt 
    mvn spring-boot:run
    ```
- Open http://localhost:8080/ in broswer and click the ```here``` from home page to open [products](http://localhost:8080/products) page.
- Provide credential if redirected to [login](http://localhost:8080/login) page. (User Name: user1, Password: pass)
- Perform product creation, read, and deletion action in [products](http://localhost:8080/products) page.


# Reference
- https://spring.io/guides/gs/securing-web#run_the_app
- https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/index.html#servlet-authentication-unpwd
- https://spring.io/guides/gs/serving-web-content
- https://www.baeldung.com/thymeleaf-list
- https://www.baeldung.com/spring-boot-crud-thymeleaf
- https://www.blackslate.io/articles/integrate-sqlite-with-spring-boot
