# NEW
# Quiz API

## Endpoints

### Questions
| Method | URI | Description |
|---|---|---|
|GET|/api/questions|Retrieves all questions|
|GET|/api/questions/{id}|Retrieves a single question by id|
|POST|api/questions|create a new question|
|PUT|api/questions/{id}|update a specific question|
|DELETE|api/questions/{id}|delete a specific question|


### Users
| Method | URI | Description |
|---|---|---|
|GET|/api/users|Retrieves all users|
|PUT|/api/users{id}|Update a specific user by user id|
|DELETE|/api/users{id}|Delete a specific user by user id|
|POST|/api/users|Create a new user|


### Quizzes
| Method | URI | Description |
|---|---|---|
|GET|/api/quizzes|Retrieves all quizzes|
|GET|/api/quizzes{id}|Retrieves one quiz|
|GET|/api/quizzes/{user_id}|Retrieves quizzes by user id|
|POST|/api/quizzes|Create a new quiz|
|PUT|/api/quizzes/{id}|Update a quiz by id|
|DELETE|/api/quizzes/{id}|Deletes a quiz|