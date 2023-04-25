const fs = require('fs/promises')

const content = 'Some Data '+ new Date()

console.log('👉 Writing File')
const prm = fs.writeFile('./async.txt', content)
prm.then( () => console.log('✅ Data written successfully') )
console.log('✅ Done write operation') 

