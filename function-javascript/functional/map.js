const numbers = [1, 2, 3, 4, 5, 6]

const numbersV2 = numbers.map(el =>  el * 2)

console.log(numbersV2)

const students = [
    {name: 'Jake', score: 6.4},
    {name: 'Susan', score: 8.6},
    {name: 'Emma', score: 9.4},
    {name: 'Peter', score: 9.1}
]

const getScore = el => el.score
const getName = el => el.name

console.log(
    students
        .map(getScore)
        .map(Math.ceil)
)
console.log(students.map(getName))