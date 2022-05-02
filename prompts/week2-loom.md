# Linux/Unix, SDLC/Agile, Git

# REMINDER: Each prompt is answerable in 5min. You'll have 25 minutes to respond to each of these questions. You must record your screen as well with this prompt on the foreground.

# Prompt 1

1. What is SQL? Why do we use it?

2. Name a few sub-languages of SQL and the commands associated with them.

3. What is Referential Integrity?

4. What is the difference between aggregate and scalar functions? Give an example.

5. What is a Primary key vs a Foreign Key? Why do we use them?

# Prompt 2

1. What is Java?

2. What is the main signature? Does it ever change?

3. What are String Literals and how do they relate to the String Pool?

4. What is the default constructor of a Class? Is it always present in each class?

5. What is the JDK? What does it contain?

# Prompt 3

Explain the following code. Line-by-line. **_NOTE_** Answer some of the comments.

```sql
-- What's going on here?
create table bank_user (
	fname varchar(50),
	lname varchar(50),
	email varchar(25) primary key,
	"password" varchar(15) not null,
    	age int check (age >= 16)
);

create table account (
	id serial primary key,
	account_type varchar(50),
	balance numeric not null,
    open_date varchar(15) not null,
    user_email varchar(25)
);

-- Why execute this?
alter table account
add constraint fk_user_email
foreign key(user_email) references bank_user(email);

-- What's happening here?
insert into bank_user values
('Charles', 'Jester', 'charles.jester@mail.com', 'superPassword1', 29),
('Adam', 'Ranieri', 'adamn.ranieri@mail.com', 'superPassword2', 20),
('Jon', 'Duller', 'jon.duller@mail.com', 'superPassword3', 16);

-- Does this work?
insert into bank_user values
('Bobby', 'Little', 'bobby.little@mail.com', 'superPassword4', 9);

insert into account values
(default, 'checking', 100.00, '05-02-2022', 'charles.jester@mail.com'),
(default, 'savings', 1000.00, '05-02-2022', 'charles.jester@mail.com');

-- What's this for?
create view user_account as
select bu.fname, bu.lname, a.account_type, a.balance, a.open_date
from bank_user bu
join account a ON bu.email = a.user_email;

-- What happens here? Are we missing anything?
update account set balance = 10000.00 where user_email = 'charles.jester@mail.com';

-- What would you expect to be output?
select * from user_account ;
```
