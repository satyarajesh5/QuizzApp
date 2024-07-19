# Spring Boot Quiz App

This is a quiz application developed using Spring Boot. Users can take quizzes on various topics and view their results.

## Key Features

* Quiz Management: Users can take pre-defined quizzes on a variety of subjects.
* Spring Boot Framework: Leverages Spring Boot's efficient development experience and rapid application production.

## Technologies Used

* Spring Boot
* Java 21.0.3

## Integration Testing with Postman

For integration testing of the quiz application's REST API endpoints, we recommend using Postman, a popular API client. Postman allows you to:

* Send HTTP requests (GET, POST, PUT, DELETE) to your application's API endpoints.
* Set headers, cookies, and body parameters to simulate various API calls.
* Inspect response codes, headers, and body content to verify API behavior.

**Benefits of Using Postman:**

   **Easy Setup:** Postman is a free, downloadable application with a user-friendly interface.
   **Intuitive Request Building:** You can create and customize HTTP requests effortlessly.
   **Response Analysis:** Postman helps you analyze responses and identify potential API issues.

**Example Quiz API Endpoint:**

Here's an example of using Postman to retrieve a list of available Questions:

1. Open Postman and create a new GET request.
2. Set the URL to `http://localhost:8080/questions/allquestions`.
3. Send the request and analyze the response code (200 indicates success) and body content (list of questions).

By using Postman and the provided API documentation, you can effectively test and integrate with the quiz application's API features.

---
