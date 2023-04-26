import * as fs from 'node:fs';
import { PassThrough } from 'node:stream';

const readStream = fs.createReadStream('./input.txt');
const writeStream = fs.createWriteStream('./stream.txt');

const tunnel = new PassThrough()

readStream.on('data', (chunk) => {
    console.log(chunk.toString());
});

readStream.pipe(tunnel).pipe(writeStream)