# React & Azure

# REMINDER: Each prompt is answerable in 5min. You'll have 25 minutes to respond to each of these questions. You must record your screen as well with this prompt on the foreground.

[Here is the link for the survey to be completed after.](https://forms.office.com/r/2ty04ksdbs)

# Prompt 1

1. What can you tell me about React?

2. How do you create and run a react app? What directory must you be in?

3. What are componenets? What must they always return?

4. What is JSX?

5. What are hooks? Give two examples of how and why we would use them.

# Prompt 2

1. What is the Virtual DOM?

2. Why use React over another library or framework?

3. What is state vs props?

4. What is the cloud? Why do we use Azure?

5. Where and how are we deploying our API to Azure?

# Prompt 3

Explain the following code. Line-by-line. **_NOTE_** Answer some of the comments.

```javascript
// What is this import block of code? Where is it finding what to import?
import axios from "axios";
import { useContext, useRef } from "react";
import { useNavigate } from "react-router-dom";
import { userContext } from "../../App";

// What does the below line indicate?
export default function TrainerLogin() {
    const emailInput = useRef();
    const passwordInput = useRef();
    const [user, setUser] = useContext(userContext);
    const navigate = useNavigate();
    const url = "https://pokeproject.azurewebsites.net";

    // What two keywords are vital when making a HTTP request with react? Is there any alternative?
    async function login() {
        // What would happen if I defined the trainer outside the scope of this login function?
        const trainer = {
            email: emailInput.current.value,
            password: passwordInput.current.value,
        };

        // What's the point of this if statement?
        if (trainer.password === "hello") {
            alert("You need to reset password");
        } else {
            // Why are we using a try-block?
            try {
                const response = await axios.post(`${url}/auth`, trainer);
                setUser({ ...user, email: trainer.email });

                // Why not just use window.location.replace("http://localhost:3000/dashboard") ?
                // What library do we need to leverage useNavigate()?
                navigate("/dashboard");
            } catch (error) {
                console.error(error.response.data);
            }
        }
    }

    // What must we return?
    return (
        // What is that empty tag?
        <>
            <h4>Welcome back, please log in below.</h4>
            <input placeholder="Enter Email" ref={emailInput}></input>
            <input type="password" placeholder="Enter password" ref={passwordInput}></input>
            <button onClick={login}>Login</button>
        </>
    );
}
```
