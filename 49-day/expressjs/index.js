const express = require('express')

const app = express()
const port = 3000

const onGet = (req, res) => {
    res.json({ sts: 'success', msg :'GET Request' })
}
function onGet2(req, res) {
    res.json({ sts: 'success', msg :'GET Request' })
}
app.get('/', onGet2)

app.post('/', (req, res) => {
    res.json({ sts: 'success', msg :'POST Request' })
})

app.put('/', (req, res) => {
    res.json({ sts: 'success', msg :'PUT Request' })
})

app.delete('/', (req, res) => {
    res.json({ sts: 'success', msg :'DELETE Request' })
})

app.listen(port, () => {
    console.log(`🟢 Example app listening on port ${port}`)
})