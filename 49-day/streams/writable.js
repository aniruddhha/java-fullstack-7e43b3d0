import * as fs from 'node:fs';

const writeStream = fs.createWriteStream('./output.txt');

writeStream.write('Hello, World!');
writeStream.end();
