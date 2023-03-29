const arr = [5, 3, 8, 1, 4]

console.log('Original')
console.log(arr)

console.log('Sorted')
console.log(arr.sort())

let str = ''
for(let num of arr) {
    str += num;
}

console.log(str)

arr.forEach( el => console.log(el) )

const filtered = arr.filter(el => el >=3 )
console.log(filtered)