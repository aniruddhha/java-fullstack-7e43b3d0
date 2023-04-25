
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
hi({ name, age }) // 🟢 object destructutring

const obj2 = { sal : 90, dob : '2020-01-01' }
const sl = obj2.sal
const db = obj2.dob
console.log(`Sal ${sl} Dob ${db}`)

const { sal, dob } = obj2 // 🟢 object destructutring
console.log(`Sal ${sal} Dob ${dob}`)

const arr = [ 100, 200 ]
const el1 = arr[0]
const el2 = arr[1]
console.log(`1El ${el1}, 2El ${el2}`)

const [e1, e2] = arr // 🟢 array destructutring
console.log(`1El ${e1}, 2El ${e2}`) // 🟢 interpolation
console.log('1El ' + e1 + ' 2El ' + e2)

const fn = (a, b) => 10 + (a + b) // 🟢 Fat Arrow -> Lambda
console.log(fn(1, 1))

const names = ['abc', 'pqr', 'lmn', 'xyz', 'zzz']
const upAr = []
for (let i = 0; i < names.length; i++) {
    // console.log(names[i].toUpperCase())
    upAr.push(names[i].toUpperCase())
}
console.log(upAr)

const conArr = names.map(el => el.toUpperCase())
console.log(conArr)

if(names.length > 10 || names.length <=20) {
    console.log(`Small Array`)
}else if(names.length > 20 || names.length <= 30) {
    console.log(`Medium Size Array`)
} else {
    console.log(`Big Array`)
}

