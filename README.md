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
-- ****Método****: `POST`
- **Request Body**:
  ```json
  {
    "valor": 100,
    "dataHora": "2025-05-03T10:00:00Z"
  }

  Respostas:

    201 Created: Transação criada com sucesso.
    422 Unprocessable Entity: Valor inválido ou data futura.
### 2. Consultar Estatísticas
-    **URL**: /estatistica
-    **Método**: GET
    Respostas: 
    200 OK: 
### 3. Remover Transações
-    **URL:** /transacao
-    **Método**: DELETE
    Respostas:
        200 OK: Todas as transações foram removidas.
Configuração e Execução
    Pré-requisitos

    Java 21 instalado.
    Maven configurado no ambiente.

Passos para executar

# 📦 desafio-itau-backend

Aplicação Java (Spring Boot) empacotada em Docker.

---

## 🐳 Como usar esta imagem

- **Instalar a imagem**
`docker pull donruan3001/desafio-itau-backend`
- **Rodar o docker**
`docker run -p donruan3001/desafio-itau-backend`

```
//caso queira fazer o build da imagem
docker build -t ruan123/desafio-itau-backend .```
