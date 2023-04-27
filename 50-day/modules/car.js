const exported  = require('./engine')

const { engine, util, calcObj } = exported.someObj

function increaseSpeed() {
    console.log(engine)
    console.log(util)
}

increaseSpeed()
calcObj()
