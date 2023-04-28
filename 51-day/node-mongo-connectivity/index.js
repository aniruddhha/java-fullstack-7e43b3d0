// console.log(require('mongodb'))

function moduleImportExportRevision() {
    const obj = {
        MongoClinent: 'abc',
        MongoError: 'error'
    }

    const MongoCl = obj.MongoClinent
    const MongoErr = obj.MongoError

    const { MongoClinent, MongoError } = obj
}

const { MongoClient, ServerApiVersion } = require('mongodb');

const url = 'mongodb://127.0.0.1:27017/test';

const client = new MongoClient(url, {
    serverApi: {
        version: ServerApiVersion.v1,
        strict: true,
        deprecationErrors: true,
    }
});

client.connect().then(() => {
    console.log(`✅ Connected Successfully`)

    const db = client.db('test');

    const collection = db.collection('cars');

    collection.insertOne({ a: 1 })
    .then(result => {
        console.log(`✅ Data Inserted Successfully`)
        console.log(result)
    }).catch(err => {
        console.log(`❌ Problme in inserting data`)
        console.log(err)
    })

    // Find documents
    collection.find({}).toArray().then(docs => {
        console.log("Found the following records:");
        console.log(docs);
    }).catch(err => {
        console.log(`❌ Problme in inserting data`)
        console.log(err)
    })

    // Update a document
    collection.updateOne({ a: 2 }, { $set: { b: 1 } })
        .then(result => {
            console.log("✅ Updated the document");
            console.log(result)
        }).catch(err => {
            console.log(`❌ Problme in inserting data`)
            console.log(err)
        })

    // Delete a document
    collection.deleteOne({ a: 3 }).then(result => {
        console.log("✅ Deleted the document");
        console.log(result)
    }).catch(err => {
        console.log(`❌ Problme in inserting data`)
            console.log(err)
    })

    // client.close();
}).catch(console.log);