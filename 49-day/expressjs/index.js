const express = require('express')

const app = express()
const port = 3000

const customMiddleware = (req, res, next) => {
    // const id = req.body.id
    // const name = req.body.name
    // const category = req.body.category
    // const price = req.body.price

    const { id, name, category, price } = req.body

    if(name.length < 3) {
        res.json({ sts :'fail', msg:'invalid name' })
        return
    }
    next()
}

app.use(express.json())

const onGet = (req, res) => {
    res.json({ sts: 'success', msg :'GET Request' })
}
function onGet2(req, res) {
    res.json({ sts: 'success', msg :'GET Request' })
}
app.get('/', onGet2)

app.post('/', express.json(), customMiddleware , (req, res) => {
    console.log(req.body)
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