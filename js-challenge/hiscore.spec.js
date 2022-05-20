// write a function that takes in a list of scores and returns a list of intitals
// ordered from highest score to lowest
// Assume no duplicate scores

// FORBIDDEN KEYWORDS
// for, while
// hint use map and sort

function highScores(scores){

}

test('High Scores',()=>{
    const scores = [
    {intials:"ACR", points: 1000},
    {intials:"JAG", points: 1200},
    {intials:"TED", points: 90},
    {intials:"AAA", points: 0}
    ]
    const ordered = highScores(scores)
    expect(ordered).toEqual(['JAG','ACR','TED','AAA'])

})