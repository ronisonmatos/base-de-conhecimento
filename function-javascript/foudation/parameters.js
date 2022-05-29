function logParams(a, b, c){
    console.log(a, b, c)
}

logParams(1,2,3,4)
logParams(1,3,4)
logParams(1,3)
logParams(1)

function defaultParams(a = 1, b = 2, c = 3){
    console.log(a, b, c)
}

defaultParams(7, 8, 1)
defaultParams(7, 4)
defaultParams()

// spread/rest
function logNums(...nums){
    console.log(Array.isArray(nums))
    for (let n of nums) {
        console.log(n)
    }
}

logNums(1, 2, 3)

function sumAll(...nums){
    let total = 0
    for(let n of nums){
        total += n
    }
    return total
}

console.log(sumAll(1,3,5,3,7,8))