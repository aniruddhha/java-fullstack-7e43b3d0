export default class FuelConverter {

    constructor() {
        this.capacity = 10;
        this.tank = 'metal'
    }

    show() {
        console.log(`Capacity ${this.capacity}, Tank ${this.tank}`)
    }
}