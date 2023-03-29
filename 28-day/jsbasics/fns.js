function callHi(msg) {
    return 'Hi '+ msg.toUpperCase()
}

const dt = callHi('abc')
console.log(dt)

function calc(num1, num2, op) {

    if(num1 < 10 && num1 > 100) return  '❌ Bad Number'
    if(num2 < -10 && num2 > 10) return '❌ Bad Number'

    if(op == '+') {
        return num1 + num2
    }
    if(op == '-') {
        return num1 - num2
    }
    if(op == '*') return num1 * num2
    if(op == '/') return num1 / num2
}

console.log(calc(3, 45, '+'))

// anonymous functions
const sqr1 = function (n) {
    return n * n
}

// fat arrows
const sqr2 = n => n * n

const nm = 2
console.log(`Square of ${nm} is ${sqr1(nm)}`)
console.log('Square of '+ nm +' is ' + sqr2(nm))
