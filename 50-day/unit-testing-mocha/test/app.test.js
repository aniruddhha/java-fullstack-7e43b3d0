const assert = require('assert');
const { sum } = require('../app')

describe('Sum', () => {

    describe('Checking Sum of any numbers', () => {
        it('sum of 1 + 1 should be 2', () => {
           const actual = sum(1, 1)
           const expected = 2
           assert.equal(actual, expected)
        });
       
        it('sum of 1 + -1 should be 0', () => {
            const actual = sum(1, -1)
            const expected = 0
            assert.equal(actual, expected)
         });
    });

    describe('Checking Sum with one number', () => {
        it('sum of 1 + undefined should be NaN', () => {
           const actual = sum(1, undefined)
           const expected = NaN
           assert.equal(actual, expected)
        });
    });
});