const fs = require('fs')

const content = 'Some Data '+ new Date()

console.log('👉 Writing File')
fs.writeFileSync('./my.txt', content) // 🤪
console.log('✅ Data written successfully')

console.log('👉 Reading File')
const fd = fs.readFileSync('./my.txt', 'utf-8') // 🤪
console.log(fd)