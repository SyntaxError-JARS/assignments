# Java, JDBC & Maven

# REMINDER: Each prompt is answerable in 5min. You'll have 25 minutes to respond to each of these questions. You must record your screen as well with this prompt on the foreground.

[Here is the link for the survey to be completed after.](https://forms.office.com/r/2ty04ksdbs)

# Prompt 1

1. What OOP pillars are you using in your project? Can you give me an example of one?

2. Name all the methods of handling exceptions.

3. What's the difference between an error, checked exception and an uncheck exception?

4. What are annotations in Java?

5. What are generics in Java and why do we use them?

# Prompt 2

1. What can you tell me about JDBC? Why do we use it?

2. What do we need in order to establish the connection with out database? Why doesn't java provide it?

3. What is Maven? Why do we use it?

4. How do you identify maven artifacts or dependencies?

5. When building a maven project, how does maven obtain the necessary depedencies?

# Prompt 3

Explain the following code. Line-by-line. **_NOTE_** Answer some of the comments.

```java

    // What does this annotation indicate? What pillar of OOP is this?
    @Override
    public Trainer findById(String id) {

        // What is a Connection? Why is it wrap in () for a try block?
        try(Connection conn = ConnectionFactory.getInstance().getConnection();){

            String sql = "select * from trainer where id = ?"; // Why the "?"?

            // What's a PreparedStatement? Do we have any other options?
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(id)); // What's going on here?

            ResultSet rs = ps.executeQuery();

            if(!rs.next()){
                throw new ResourcePersistanceException("User was not found in the database, please check ID entered was correct.");
            }

            Trainer trainer = new Trainer();

            // What are the rs.getString() methods handling for us? Do we need exactly match anything?
            trainer.setFname(rs.getString("fname"));
            trainer.setLname(rs.getString("lname"));
            trainer.setDob(rs.getString("dob"));
            trainer.setPassword(rs.getString("password"));
            trainer.setEmail(rs.getString("email"));

            return trainer;
        } // Will all of this code work as expected?
    }

```
