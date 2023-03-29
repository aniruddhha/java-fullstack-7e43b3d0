const nums = [1, 4, 5, 2, 3 ,9, 10]

console.log(`0th Element ${nums[0]}`)
console.log(`1st Element ${nums[1]}`)

console.log(`🔥 For Loop 🔥`)
for (let i = 0; i < nums.length; i++ ) {
    console.log(`Index ${i} -> Element ${nums[i]}`)
}

console.log(`🔥 While Loop 🔥`)
let i = 0
while( i < nums.length) {
    console.log(`Index ${i} -> Element ${nums[i]}`)
    i++
}

console.log(`🔥 Do While Loop 🔥`)
let j = 0;
do {
    console.log(`Index ${j} -> Element ${nums[j]}`)
    j++
} while( j < nums.length )

console.log(`🔥 For In 🔥`)
for (let ind in nums) {
    console.log(`Index ${ind} -> Element ${nums[ind]}`)
}

console.log(`🔥 For Of 🔥`)
for (let el of nums) {
    console.log(`Element ${el}`)
}

