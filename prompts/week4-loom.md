# Java Servlets, JDBC & HTML/CSS

# REMINDER: Each prompt is answerable in 5min. You'll have 25 minutes to respond to each of these questions. You must record your screen as well with this prompt on the foreground.

[Here is the link for the survey to be completed after.](https://forms.office.com/r/2ty04ksdbs)

# Prompt 1

1. Give me an example of when your using Abstraction or Inheritance in you project.

2. What is a servlet?

3. What do we use POSTMAN for? Why not just a browser?

4. What is a query parameter? where is it used?

5. What are the two parameters set in every servlet method? What is each used for?

# Prompt 2

1. What is a PreparedStatement? Why do we use it? How can we edit the sql string given to a PreparedStatement?

2. What file do we use to obfuscate our connection to the database? What else does java need in order to connect to our database?

3. Name the Verbs of HTTP Requests. What does each of them handle?

4. What happens in the scenario that a user provides the wrong information in an HTTP Request? What about if it's actually the server failing?

5. Tell me all the basic elements that an html page needs. At least the bare minimum.

# Prompt 3

Explain the following code. Line-by-line. **_NOTE_** Answer some of the comments.

```java

    @Override // What pillar of OOP is occuring here?
    // Why are we overriding this method?
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        // Explain the following code? What is the datatype of req.getParameter()
        if(req.getParameter("id") != null && req.getParameter("email") != null){
            resp.getWriter().write("Hey you have the follow id and email " + req.getParameter("id") + " " + req.getParameter("email") );
            return;
        }

        // What happens if I put this code above the previous if-block?
        if(req.getParameter("id") != null){
            Trainer trainer; // why is this trainer reference variable declared here?
            try {
                trainer = trainerServices.readById(req.getParameter("id"));
            } catch (ResourcePersistanceException e){
                logger.warn(e.getMessage());
                resp.setStatus(404);
                resp.getWriter().write(e.getMessage());
                return;
            }

            // What's going on here?
            String payload = mapper.writeValueAsString(trainer);
            resp.getWriter().write(payload);
            return; // Do we need this?
        }

        // What's these last few lines doing? When would they execute?
        List<Trainer> trainers = trainerServices.readAll();
        String payload = mapper.writeValueAsString(trainers);
        resp.getWriter().write(payload);

    }

```
