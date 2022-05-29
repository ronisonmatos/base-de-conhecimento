// Anonymous function
(function (a,b,c){
    return a + b + c
})

// Function expression
const sum = function (a, b){
    return a + b
}

const resut = sum(7,59)
console.log(resut)

const anotherSum = sum
console.log(anotherSum(5,9))