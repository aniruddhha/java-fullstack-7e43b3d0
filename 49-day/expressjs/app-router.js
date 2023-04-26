const express = require('express')

const port = 3000

const app = express()
const carRouter = express.Router()
carRouter.get('/', (req, res) => {
    res.json({ sts : 'success', msg :'Car Get Method' })
})

const bikeRouter = express.Router()
bikeRouter.get('/', (req, res) => {
    res.json({ sts : 'bike', msg :'Bike Get Method' })
})

app.use('/car', carRouter)
app.use('/bike', bikeRouter)

app.listen(port, () => {
    console.log(`🟢 Example app listening on port ${port}`)
})