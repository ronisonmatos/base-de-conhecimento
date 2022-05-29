// Anonymous function
// IIFE - Immediately Invoked Function Expression
(function (a,b,c) {
    // Variável dentro do escopo
    let x = 10
    console.log(`Result: ${a + b + c}`)
    console.log(x)
})(1,2,3); // Necessário o uso do ";"

(function () {
    let x = 15
    console.log(x)
})();

(() => {
    console.log('arrow #1')
    }
)();

(() => console.log('arrow #2'))();