# Projeto de Entregas - Tartaruga Cometa

## Descrição

Este projeto é uma aplicação web para gerenciar entregas, desenvolvido usando Spring Boot e PostgreSQL.

## Pré-requisitos

- Java 8 ou superior
- Maven
- PostgreSQL

## Configuração do Banco de Dados

1. Crie um banco de dados no PostgreSQL:

   ```sql
   CREATE DATABASE entregas;

### Atualize o arquivo application.properties com suas credenciais do PostgreSQL:
spring.datasource.url=jdbc:postgresql://localhost:5432/entregas
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update

### Como Rodar a Aplicação
1. Clone o repositório:
git clone URL_DO_REPOSITORIO
cd entregas

2. Compile e rode a aplicação usando Maven:
mvn spring-boot:run

3. Acesse a aplicação no seu navegador:
http://localhost:8080

### Alternar Tema
Você pode alternar entre o tema claro e o tema escuro clicando no botão de tema no canto superior esquerdo da página.

### Contribuições
Sinta-se à vontade para enviar pull requests e abrir issues para quaisquer melhorias ou correções de bugs.
