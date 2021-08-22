# Instruções:

- ` docker-compose up -d ` = subir imagem banco mysql e liberar o terminal
- `winpty docker exec -it mysql mysql -uapi -papi` = acessando a imagem do banco mysql
- `show databases;` = verificamos dentro da nossa imagem do mysql os bancos de dados
- `use api_db` = para acessar o banco de dados criado
- `show tables;` = verifica as tabelas do banco de dados
- `select * from (nome-tabela)` = acessa a tabela dentro do nosso banco de dados


# Read Me First
The following was discovered as part of building this project:

* The original package name 'br.com.antonio.api-rest' is invalid and this project uses 'br.com.antonio.apirest' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Validation](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-validation)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

