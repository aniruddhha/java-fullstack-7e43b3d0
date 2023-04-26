import { Buffer } from 'node:buffer'; // Es6 modules
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



