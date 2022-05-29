/*
* Functions that operate on other functions
* either by taking them as argument or by
* returning them, are called higthe-order functions.
*/

// Recebendo função por parâmetro
function run(fn) {
   return `Result ${fn()}`
}

function sayHello() {
    console.log('Hello!')
}

// Passando referencia da função
run(sayHello)
// passando função anônima como parâmetro
run(function (){
    console.log('run!!!')
})

const result = run(Math.random)
console.log(result)