import * as fs from 'node:fs';

const readStream = fs.createReadStream('./input.txt');

readStream.on('data', (chunk) => {
    console.log(chunk.toString());
});

readStream.on('end', () => {
    console.log('Finished reading file.');
});