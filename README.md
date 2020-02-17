# Quick introduction to Spring Boot

The goal of this introducion course is to learn the barics of developing REST API´s using Java and SpringBoot.

### Pre requirements
- Have InelliJ Ultimate installed
- Have Maven installed
- Some tool to perform API request (eg: Postman)
- Have Java 11 installed

### Topics
- REST API
- JPA
- H2
- Servies
- Controllers
- Dependency injection


## The end Product
We will create a simple REST API where the end product should be a service where you can create and view movies displayed at a Cinema.

You should also be able to query moves by their age limit.


## Exercises

#### Ex 1
Create a Controller - branch: `ex-1`

You should create a Controller class that contains one method for a GET request. It should only return a String.\
Now run the application an open your web browser. Go to the following URL: [localhost:8080/movies](http://localhost:8080/movies). You should now see the String you wrote in the Controller Class, in your browser window.


#### Ex 2
Create a Service class - branch: `ex-2

Create a Class annotated with @Service. This should have a method that returns a list of Strings (Movie Titles). 
Make use of the Service class in the Controller, using the @Autowired annotation. 
Your API should now return a list of Movie titles.

#### Ex 3
Create a Movie object - branch: `ex-3`

Create a Movie class containing two fields: `title` and `ageLimit`. 
Now populate the previously created list of strings (Movie titles) with Movie objects instead.

You will now see that by calling your API, that Spring automatically serialize the java objects into JSON objects


#### Ex 4
Create new Movie - branch: `ex-4`

Now we want to create new Movie objects by doing a POST request to our API. 
First we need to create a new method in the Controller class. This should handle a POST request, with a request body in JSON.
We will now see that Spring automatically deserializes the JSON object into a Java class.
Lastly we need to create a method in the Service class to add the new Movie into our list of Movies.
