const expect = require('chai').expect;
const { sum } = require('../app')

describe('Sum', () => {

    describe('Checking Sum of any numbers', () => {
        it('sum of 1 + 1 should be 2', () => {
           expect(sum(1,1)).to.equal(2)
        });
       
        it('sum of 1 + -1 should be 0', () => {
            expect(sum(1,-1)).to.equal(0)
         });
    });

    describe('Checking Sum with one number', () => {
        it('sum of 1 + undefined should be NaN', () => {
            expect(sum(1, undefined)).to.be.NaN
        });
    });
});