# Game Backlog API 🎮

Uma API RESTful construída com Spring Boot e MySQL para gerenciar um backlog pessoal de jogos. Este projeto serve como back-end para rastrear o progresso, plataformas, avaliações e tempo de jogo.

## 🚀 Tecnologias

* **Java**
* **Spring Boot** (Web, Data JPA)
* **MySQL**
* **Maven**

## ⚙️ Configuração e Execução

1. Clone o repositório:
   ```bash
   git clone [https://github.com/viniciusvictor07/game_backlog.git](https://github.com/viniciusvictor07/game_backlog.git)
   ```

2. Configure as credenciais do seu MySQL local em `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/backloggd_db?useSSL=false&serverTimezone=UTC
   spring.datasource.username=root
   spring.datasource.password=root
   ```

3. Inicie a aplicação usando o Maven wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```

## 🛣️ Endpoints da API

| Método | Endpoint | Descrição |
|---|---|---|
| `GET` | `/api/games` | Retorna a lista de todos os jogos |
| `POST` | `/api/games` | Adiciona um novo jogo ao banco de dados |

### Exemplo de Payload POST

```json
{
  "title": "Resident Evil 4 Remake",
  "platform": "PC",
  "status": "Finalizado",
  "rating": 10,
  "review": "Obra-prima",
  "playtime": 45
}
```
