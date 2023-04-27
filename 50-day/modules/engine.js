const engine = {
    rpm : 2333,
    isPiston : true,
    make : 'abc',
    isTwoStroke: false
}
const util = {
    fuelCap : 7,
    tank: 45,
    tyre: 'abc'
}

function calcObj() {
    console.log(`Calculating Speed`)
}

// exports.someObj = { 
//     engine : engine,
//     util: util
// }
exports.someObj = { 
    engine ,
    util,
    calcObj
}