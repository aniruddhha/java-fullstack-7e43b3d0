import { engine, util, calcObj } from './engine.js'
import FuelConverter from './fuel.js'

function speedUp() {
    console.log(engine)
    console.log(util)
}

speedUp()
calcObj()

const fc = new FuelConverter();
fc.show()
