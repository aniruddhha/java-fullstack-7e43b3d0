
const promiseCallback = (res, rej) => {

    let sts = true

    // for loop - simulation of heavy process
    for (let i = 0; i < 1000; i++) {
        if(sts) res() // success
        else rej() // fail
    }
}

const successCallback = () => console.log(`sucess`) // i will execute in future
const errorCallback = er =>  console.log(`error`) // i will execute in future

const prm = new Promise(promiseCallback) 
prm.then(successCallback)
prm.catch(errorCallback)

async function demo1() {
    try {
        const p = await prm // unwrapping the promise
    }catch(er) {
        console.log(er)
    }
}