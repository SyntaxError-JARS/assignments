// In Zelda money takes the form of rupees
// rupees come in colors indicating their value 
// green = 1 ,blue = 5,red = 20, silver = 100, gold = 300
// calculate the total value
// note that if there is 0 of that rupee color it WILL NOT be on the object
// {green:2, blue:3, red:10} there are 0 silver and gold rupees

// hint good use case of guards 

function rupeeCalculator(wallet){

}

test("dirt broke", ()=>{
    const wallet = {}
    const total = rupeeCalculator(wallet)
    expect(total).toBe(0)
})

test("At least one of each", ()=>{
    const wallet = {green:10,blue:4,red:5,silver:2,gold:1}
    const total = rupeeCalculator(wallet)
    expect(total).toBe(630)
})

test("Some missing", ()=>{
    const wallet = {blue:4,gold:1}
    const total = rupeeCalculator(wallet)
    expect(total).toBe(320)
})