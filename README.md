# Instagram Backend API

This API is designed for managing users and posts, similar to the functionality found in Instagram. The backend is built using Java and Spring Boot, and it provides endpoints for user registration, user authentication, and post management.

### Features:
- User registration and authentication with JWT (JSON Web Token).
- Create and fetch posts associated with a user.
- Secured API with JWT-based authentication.

## Getting Started

### Prerequisites

Before running this application, make sure you have the following installed:
- Java 17+
- Maven
- PostgreSQL (or any other SQL database, depending on your configuration)

### Installing

1. Clone the repository:

    ```bash
    git clone https://github.com/redianmarku/instagram-spring-API
    ```

2. Navigate to the project directory:

    ```bash
    cd instagram-spring-API
    ```

3. Configure your database in `application.properties` or `application.yml`.

4. Build the project using Maven:

    ```bash
    mvn clean install
    ```

5. Run the application:

    ```bash
    mvn spring-boot:run
    ```

## API Endpoints

### User Endpoints

#### 1. Register a New User
- **URL**: `/api/users/register`
- **Method**: `POST`
- **Request Body**: JSON
  ```json
  {
      "username": "exampleUser",
      "email": "example@gmail.com",
      "password": "examplePassword"
  }
  ```
- **Description**: This endpoint registers a new user.

#### 2. Login and Obtain JWT Token
- **URL**: `/api/users/login`
- **Method**: `POST`
- **Request Body**: JSON
  ```json
  {
      "username": "exampleUser",
      "password": "examplePassword"
  }
  ```
- **Description**: This endpoint authenticates the user and returns a JWT token that should be used for further API calls.

#### 3. Get User by Username
- **URL**: `/api/users/{username}`
- **Method**: `GET`
- **Description**: Fetch user details by their username.

---

### Post Endpoints

#### 1. Create a New Post
- **URL**: `/api/posts`
- **Method**: `POST`
- **Request Header**:
    - `Authorization: Bearer <JWT Token>`
- **Request Body**: JSON
  ```json
  {
      "content": "This is my new post",
      "imageUrl": "http://example.com/image.jpg"
  }
  ```
- **Description**: This endpoint creates a new post. The authenticated user is automatically associated with the post.

#### 2. Get All Posts by a User
- **URL**: `/api/posts/user/{username}`
- **Method**: `GET`
- **Description**: Fetches all posts created by a specific user.

---

### Security and Authentication

- This API uses **JWT (JSON Web Token)** for securing the endpoints. After a user successfully logs in, a JWT token is returned. This token must be included in the `Authorization` header for any requests to secured endpoints.
- Example of an `Authorization` header:
  ```bash
  Authorization: Bearer <JWT Token>
  ```

---

### Technologies Used
- Java 17+
- Spring Boot
- Spring Security (JWT)
- PostgreSQL (or other SQL database)
- Maven

---

Feel free to contribute to this project by submitting issues or creating pull requests. Any feedback is highly appreciated!

