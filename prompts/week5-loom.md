# JavaScript, Important JS for React

# REMINDER: Each prompt is answerable in 5min. You'll have 25 minutes to respond to each of these questions. You must record your screen as well with this prompt on the foreground.

[Here is the link for the survey to be completed after.](https://forms.office.com/r/2ty04ksdbs)

# Prompt 1

1. What is JavaScript?

2. Why don't we use something else for Frontend Development?

3. What are the primitives in JavaScript? Are they objects?

4. What is hoisting in JavaScript? How can we prevent it?

5. Name a few ways can we make functions in JavaScript.

# Prompt 2

1. What is Destructuring in JavaScript? What can it be used with? Why is it important?

2. What can you tell me about the spread operator?

3. What is functional programming? Why is it useful?

4. Name and explain the functions pre-built into arrays that we can leverage for functional programming.

5. What's a Callback Function vs a Higher-Order Function?

# Prompt 3

Explain the following code. Line-by-line. **_NOTE_** Answer some of the comments.

```javascript
// Explain what's happening below? What's the output?
const people = ["Adam", "Charles", "Asrat", "Soyoung"];
const [adam, asrat, soyoung] = people;

console.log(adam, asrat, soyoung);

// What's going on below? What's the output?
const user = { username: "JesterCharles", fname: "Charles", lname: "Jester" };
const { username, firstName, lname } = user;

console.log(username, lname, firstName);
console.log({ ...user, age: 29 });

// Explain what's happening and what the output would be...

const nums = [1, 2, 3, 4, 5];

const add6 = (a) => {
    return a + 6;
};

const forEachRun = nums.forEach(add6);
const mapRun = nums.map(add6);

console.log(forEachRun, mapRun);

// What's going on here???
console.log(
    nums
        .map(add6)
        .filter((a) => a % 2 == 0)
        .map((i) => i - 6)
        .reduce((a, b) => a + b)
);
/*
Answer the following 3 questions:
1. Will it run?
2. If so, What's the output?
3. How could you improve it?
*/

hoistAway();

function hoistAway() {
    console.log(hello);

    var bye;
    var hello = "Hello there";

    console.log(hello);
}
```
