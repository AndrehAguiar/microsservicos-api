# Microsserviços em Spring Cloud com Java

Projeto desenvolvido durante a aula do Bootcamp Codeanywhere.

## API REST

As configurações disponibilizadas pelo Config Server, que trabalha como provedor de serviços REST e disponibiliza porta 8888 para consumo pelas aplicações.

O Service Discovery integrando as aplicações pela porta 9000 disponibilizando as estatísticas por uma interface gráfica.

O Product Catalog é disponibilizado pelo Service Discovery e aguarda ser chamada pelo cliente utilizando a porta 8081.

O Shopping Cart também é disponibilizado pelo Service Discovery e aguarda ser chamada pelo cliente utilizando a porta 8082.

O Gateway distribui as solicitações para o micro um serviço específico responsável recebendo as requisições e disponibiliza as respostas pela porta 8080.

##### Arquitetura básica de microsserviços

- Config Server: Consumindo as configurações do repositório no git e disponibilizando para os módulos.
- Service Discory: Criado pelo Eureka Integrando os serviços e disponibilizando para as aplicações.
- Product Catalog: Módulo desenvolvido utilizando Elasticsearch.
- Shopping Cart: Módulo desenvolvido utilizando Redis.
- Gateway: Módulo responsável pelas rotas

![image-20210429031604514](img/image-20210429031604514.png)

---


<img width=80px src="https://avatars.githubusercontent.com/u/1257486?v=4" />

### Oswaldo Neto

###### [Especialista / Instrutor](https://github.com/oswaldoneto/)

###### [Digital Innovation One](https://digitalinnovation.one/sign-up?ref=NL9EADWVZW)

