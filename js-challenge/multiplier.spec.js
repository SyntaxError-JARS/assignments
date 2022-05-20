
// write a function that takes in a callback, the amount of times you want to execute the callback,
// and any parameters to that function

// note the use of rest syntax for the args
function multiplier(times,func, ...args){


}

test("No args", ()=>{
    let tot = 0
    multiplier(2, () => tot+=1)
    expect(tot).toBe(2)
})

test("multi args", ()=>{
    let tot = 0
    multiplier(2, (a,b) => {tot+=1; 
        if(a === undefined || b === undefined){
            throw new Error("You done goofed on the params")
        }
    }, "Hello", "World")
    expect(tot).toBe(2)
})