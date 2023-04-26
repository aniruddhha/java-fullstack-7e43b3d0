import { EventEmitter } from 'node:events';

const emitter = new EventEmitter() // creating

const onTick = dt => console.log('✅ Called =>  ' + dt) // es6 => arrow function

function onTickNormal(dt) { // normal function
    console.log('✅ Called normal ' + dt)
}

const onComplete = () => console.log(`✅ Files Uploaded`)

emitter.on('tick', onTick) // listening -> method reference 
emitter.on('tick', onTickNormal) // listening

emitter.once('completed', onComplete)

emitter.emit('tick', 1) // emitting



emitter.off('tick', onTick) // removing event listener
