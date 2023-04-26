import { EventEmitter } from 'node:events';

const emitter = new EventEmitter() // creating

const onAsyncEvent = (data, callabck) => { 
    // fetch('https://google.com')
    //     .then( dt => {
    //         callabck()
    //     })

    setTimeout( () => { // simulating fetch by using setTimeout
        callabck()
    }, 1500)
}

emitter.on('asyncEvent', onAsyncEvent)

const asyncCallback = () => console.log('Fetched Data From Google')

emitter.emit('asyncEvent', 1234, asyncCallback )
