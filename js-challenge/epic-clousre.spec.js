// Write a function that takes in a value and number representing how deep to nest that value in a closure
// hint if the input is 10 that means the first 9 function calls return a function

function epicClosure(value, times ){

}

test("1", ()=>{
    const result = epicClosure(100,1)
    expect(result()).toBe(100)
}) 


test("3", ()=>{
    const result = epicClosure(100,3)
    expect(result()()()).toBe(100)
})

test("10", ()=>{
    const result = epicClosure(100,10)
    expect(result()()()()()()()()()()).toBe(100)
})