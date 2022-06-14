# Spring, Spring Boot & Spring AOP/MVC/Data JPA

# REMINDER: Each prompt is answerable in 5min. You'll have 25 minutes to respond to each of these questions. You must record your screen as well with this prompt on the foreground.

[Here is the link for the survey to be completed after.](https://forms.office.com/r/2ty04ksdbs)

# Prompt 1

1. What is spring?

2. How can we configure a spring application?

3. What is a bean?

4. What is spring boot?

5. How does spring boot differ from spring?

# Prompt 2

1. What are the stereotype annotations of spring?

2. What is the difference between @RestController and @Controller?Also what does @CrossOrigin do?

3. How do you configure a dao/repository with Spring Data?

4. What is spring AOP and what can we use it for?

5. What is a ResponseEntity?

# Prompt 3

```java

@RestController
@CrossOrigin
public class TrainerServlet {

    private final TrainerServices trainerServices;

    // Is the below annotation required? What's this telling spring to do?
    @Autowired
    public TrainerServlet(TrainerServices trainerServices) {
        this.trainerServices = trainerServices;
    }

    @PostMapping("/register")
    public ResponseEntity<Trainer> saveTrainer(@RequestBody @Valid Trainer trainer){
        Trainer newTrainer = trainerServices.create(trainer);
        return new ResponseEntity<>(newTrainer, HttpStatus.CREATED);
    }

    @GetMapping("/trainers")
    // What's this annotation about? Does spring provide it?
    @SecureEndpoint(allowedUsers = {"by@mail.com", "abczyx123@mail.com"}, isLoggedIn = true)
    public ResponseEntity<List> findAllTrainers(){
        // ResponseEntity takes an Object for the ResponseBody and an HTTP Status Code
        return new ResponseEntity<>(trainerServices.readAll(), HttpStatus.I_AM_A_TEAPOT);
    }

    // The two methods defined below, what do they do for us? Is there a way to improve this?
    @ExceptionHandler({InvalidRequestException.class, IOException.class})
    public ResponseEntity<String> handleException(Exception e){
        String message = "Caught the invalid request with : " + e.getMessage();
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({AuthenticationException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED) // only use with void, if you plan to return some JSON body you have to use ResponseEntity<>
    public void handleException2(Exception e){
        String message = "Caught the invalid request2 with : " + e.getMessage();
        System.out.println(message);
    }
}
```
