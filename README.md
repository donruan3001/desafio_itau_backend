# Itau Transaction API

## Descrição

Este projeto é um desfaio feito por este repositório caso queira replicar https://github.com/rafaellins-itau/desafio-itau-vaga-99-junior
A aplicação gerencia transações financeiras e fornece estatísticas em tempo real sobre as transações realizadas nos últimos 60 segundos.

## Funcionalidades

- **Criar Transação**: Adiciona uma nova transação.
- **Consultar Estatísticas**: Retorna estatísticas como soma, média, valor mínimo, valor máximo e contagem das transações realizadas nos últimos 60 segundos.
- **Remover Transações**: Remove todas as transações armazenadas.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.4.5**
- **Maven**
- **Lombok**
- **Jakarta Validation**

## Estrutura do Projeto
src/ ├── main/ │ ├── java/ │ │ └── com/itau/itau/ │ │ ├── controllers/ # Controladores REST │ │ ├── domain/ # Modelos de domínio │ │ ├── exception/ # Tratamento de exceções │ │ └── service/ # Lógica de negócios │ └── resources/ │ └── application.properties # Configurações da aplicação ├── test/ │ └── java/ │ └── com/itau/itau/ # Testes unitários

## Endpoints

### 1. Criar Transação
- **URL**: `/transacao`
- **Método**: `POST`
- **Request Body**:
  ```json
  {
    "valor": 100,
    "dataHora": "2025-05-03T10:00:00Z"
  }

  Respostas:

    201 Created: Transação criada com sucesso.
    422 Unprocessable Entity: Valor inválido ou data futura.
2. Consultar Estatísticas
    URL: /estatistica
    Método: GET
    Respostas:
3. Remover Transações
    URL: /transacao
    Método: DELETE
    Respostas:
        200 OK: Todas as transações foram removidas.
Configuração e Execução
    Pré-requisitos

    Java 21 instalado.
    Maven configurado no ambiente.

Passos para executar

Clone o repositório:

git clone <URL_DO_REPOSITORIO>
cd itau

Compile o projeto:
./mvnw clean install

Execute a aplicação:
./mvnw spring-boot:run

A aplicação estará disponível em http://localhost:8080.

Testes
Para executar os testes unitários, utilize o comando:

./mvnw test

Tratamento de Exceções

400 Bad Request: Erros de validação no corpo da requisição.
422 Unprocessable Entity: Transações com valores inválidos.
