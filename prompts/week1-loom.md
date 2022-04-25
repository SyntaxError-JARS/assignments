# Linux/Unix, SDLC/Agile, Git

# REMINDER: Each prompt is answerable in 5min. You'll have 25 minutes to respond to each of these questions. You must record your screen as well with this prompt on the foreground.

# Prompt 1

1. What can you tell me about bash?

2. What are Standard Input and Output Streams? Why are they useful?

3. What is a conditional statement?

4. What different types of loops can be used? When would you use one over the other?

# Prompt 2

1. What can you tell me about SDLC? Why do we use it?

2. What is Agile? How does it compare to Waterfall?

3. What is git? How does it compare to github?

4. Why do we even bother using git?

# Prompt 3

Explain the following code. Line-by-line. **_NOTE_** Answer some of the comments.

```bash
function generateTeamWith1000HP {
    # What are these? Where and why are they used?
    totalHP=0;
    numOfPokemon=0;
    IFS=$'\n'

    for i in $(get20RandomPokemon) # What's going on here? Will the function work?
    do
        ((totalHP+=$(echo $i | awk -F ',' '{ print $29 }' )))
        if (( "$totalHP" <= "1000" )) #  Why use this?
        then
            echo $i | awk -F ',' '{ print "Name: " $31, "HP: " $29, "Abilities: " $1 }'
        else
            ((totalHP-=$(echo $i | awk -F ',' '{ print $29 }' ))) # What does this do and why do we use this?
            break;
        fi
    done
    echo $totalHP
}

# What's happening in this function? Why do we use it?
function get20RandomPokemon {
    IFS=$'\n'
    for i in $(cat pokemon_compendium.csv | tail -n +2 | shuf | head -20)
    do
        echo $i
    done
}

```
