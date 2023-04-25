
function hi(ob) {
    console.log(ob)
}

const obj1 = { 
    name : 'abc',
    age : 20
}

hi(obj1)
hi({ name : 'andriod', age : 89 })

const name = 'ccc'
const age = 45

hi({ name: name, age: age })
hi({ name, age }) // object destructutring

const obj2 = { sal : 90, dob : '2020-01-01' }
const sl = obj2.sal
const db = obj2.dob
console.log(`Sal ${sl} Dob ${db}`)

const { sal, dob } = obj2 // object destructutring
console.log(`Sal ${sal} Dob ${dob}`)

const arr = [ 100, 200 ]
const el1 = arr[0]
const el2 = arr[1]
console.log(`1El ${el1}, 2El ${el2}`)

const [e1, e2] = arr
console.log(`1El ${e1}, 2El ${e2}`)

