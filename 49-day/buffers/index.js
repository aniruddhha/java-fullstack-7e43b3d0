import { Buffer } from 'node:buffer'; // Es6 modules
import * as fs from 'node:fs/promises';
// const { Buffer } = require('node:buffer') // CommonJs module

const buf1 = Buffer.alloc(10);
console.log(buf1)

const buf2 = Buffer.from('hello');
console.log(buf2)
console.log(buf2.toString())
const subBuf = buf2.subarray(0,2)
console.log(subBuf)
console.log(subBuf.toString())

const buf3 = Buffer.from([1, 2, 3]);
console.log(buf3)

const buf4 = Buffer.from('hello')
console.log(buf4)
const buf5 = Buffer.from('world')
console.log(buf5)
const buf6 = Buffer.concat([buf4, buf5])
console.log(buf6)

fs.writeFile('./text.txt', buf6)
    .then( () => console.log('Data Written Successfully') )
    .catch(err => console.log(err))
fs.readFile('./text.txt').then((dt) => console.log(dt.toString()))