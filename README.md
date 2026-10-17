# Explorando Padrões de Projetos na Prática com Java

Projeto do lab da DIO - Bootcamp Itaú Java com IA
**Aluno:** johndimitry

## 🎯 Padrões de Projeto aplicados

### 1. Singleton
No Spring, todo @Service e @Repository é um Singleton por padrão. O Spring gerencia uma única instância no ApplicationContext.

### 2. Strategy
- `ClienteService` (interface) + `ClienteServiceImpl` (implementação)
- `ViaCepService` com @FeignClient - estratégia de busca de CEP intercambiável

### 3. Facade
`ClienteServiceImpl` é uma Facade que simplifica:
`Controller -> Facade (Service) -> Sub-sistemas (ViaCEP API + ClienteRepository + EnderecoRepository)`

## 🚀 Tecnologias
- Java 17+
- Spring Boot 3
- Spring Data JPA
- H2 Database
- OpenFeign (ViaCEP)
- SpringDoc OpenAPI (Swagger)

## 🔗 Como rodar
```bash
git clone https://github.com/johndimitry/dio-design-patterns-spring.git
./mvnw spring-boot:run
# http://localhost:8080/swagger-ui.html