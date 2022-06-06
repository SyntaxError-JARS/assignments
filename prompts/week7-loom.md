# Hibernate, Docker & Azure

# REMINDER: Each prompt is answerable in 5min. You'll have 25 minutes to respond to each of these questions. You must record your screen as well with this prompt on the foreground.

[Here is the link for the survey to be completed after.](https://forms.office.com/r/2ty04ksdbs)

# Prompt 1

1. What is an ORM?

2. Where do we use the JPA? What's it doing?

3. What can you tell me about Hibernate?

4. Can hibernate work with multiple types of relational databases? If it can, how would we adapt it?

5. What does the @Entity and @Table annotations do for us?

# Prompt 2

1. What are the Object States in Hibernate?

2. What is HQL? Why not just write native SQL?

3. What is Docker?

4. Explain

5. Where and how are we deploying our API to Azure?

# Prompt 3

```java

// Explain the following block of code?
public Trainer authenticateTrainer(String email, String password){

        try {
            Session session = HibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("from Trainer where email= :email and password= :password");
            query.setParameter("email", email);
            query.setParameter("password", password);
            Trainer trainer = (Trainer) query.uniqueResult();
            transaction.commit();
            return trainer;
        } catch (HibernateException | IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }

    }

// Explain what all the annotations are doing for us.
@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @Column(name = "pokemon_name")
    private String pokemonName;

    private int hp;

    private int atk;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "element_type", referencedColumnName = "id")
    private ElementType elementType;

    @ManyToOne(optional = false)
    @JoinColumn(name="ability1", referencedColumnName = "ability_name")
    private Ability ability1;

    @ManyToOne(optional = false)
    @JoinColumn(name="ability2", referencedColumnName = "ability_name")
    private Ability ability2;
}
```
