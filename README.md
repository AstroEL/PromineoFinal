# NEW
# Quiz API

## Endpoints

### Questions
| Method | URI | Description |
|---|---|---|
|GET|/api/questions|Retrieve all questions|
|GET|/api/questions/{id}|Retrieve a single question by id|
|POST|api/questions|Create a new question|
|PUT|api/questions/{id}|Update a specific question|
|DELETE|api/questions/{id}|delete a specific question|


### Users
| Method | URI | Description |
|---|---|---|
|GET|/api/users|Retrieve all users|
|PUT|/api/users{id}|Update a specific user by user id|
|DELETE|/api/users{id}|Delete a specific user by user id|
|POST|/api/users|Create a new user|
|POST|/api/users/login|Return a valid user|


### Quizzes
| Method | URI | Description |
|---|---|---|
|GET|/api/quizzes|Retrieve all quizzes|
|GET|/api/quizzes{id}|Retrieve a quiz by id|
|GET|/api/quizzes/{user_id}|Retrieve quizzes by user id|
|POST|/api/quizzes|Create a new quiz|
|PUT|/api/quizzes/{id}|Update a quiz by id|
|DELETE|/api/quizzes/{id}|Delete a quiz|