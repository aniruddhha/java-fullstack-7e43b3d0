import { EventEmitter } from 'node:events';

const emitter = new EventEmitter() // creating

const onAsyncEvent = data => { 
    // fetch('https://google.com')
    //     .then( dt => {
    //         callabck()
    //     })

    return new Promise((resolve, reject) => {
        setTimeout( () => { // simulating fetch by using setTimeout
            
            resolve() // success

            // reject() // fail

        }, 1500)
    })
}

emitter.on('asyncEvent', () => { 
    onAsyncEvent().then( () => console.log(`✅ Fetched Data From Google`))
})

emitter.emit('asyncEvent', 1234)
