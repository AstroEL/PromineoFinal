# Quiz API

## Endpoints

### Questions
| Method | URI | Description |
|---|---|---|
|GET|/api/questions|Retrieves all questions|
|GET|/api/questions/{id}|Retrieves a single question by id|

### Users
| Method | URI | Description |
|---|---|---|
|GET|/api/users|Retrieves all users|
|GET|/api/users{class_Id}|Retrieves all users for a specific class(cohort) id|
|PUT|/api/users{user_Id}|Update a specific user by id|
|DELETE|/api/users{user_Id}|Delete a specific user by id|
|POST|/api/users|Create a new user|
