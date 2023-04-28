// console.log(require('mongodb'))

function moduleImportExportRevision() {
    const obj = { 
        MongoClinent : 'abc',  
        MongoError : 'error'
    }
    
    const MongoCl = obj.MongoClinent
    const MongoErr = obj.MongoError
    
    const { MongoClinent, MongoError } = obj
}

const { MongoClient } = require('mongodb');

const url = 'mongodb://localhost:27017';
const dbName = 'nodejsdb';

MongoClient.connect(url, (err, client) => {
    if(err) {
        console.log(`❌ Problem in connectivity`)
        console.log(err)
        return
    }

    const db = client.db(dbName);
    const collection = db.collection('cars');

    collection.insertOne({a: 1}, (err, result) => {
        if(err) {
            console.log(`❌ Problem Inserting`)
            console.log(err)
            return
        }
    
        console.log("Inserted document with _id: " + result.insertedId);
    });

    collection.find({}).toArray((err, docs) => {
        if(err) {
            console.log(`❌ Problem In Fetching`)
            console.log(err)
            return
        }
        console.log("Found the following records:");
        console.log(docs);
    });

    collection.updateOne({ a : 2 }, { $set: { b : 1 } }, (err, result) => {
        if(err) {
            console.log(`❌ Problem In Updating`)
            console.log(err)
            return
        }
        console.log("Updated the document");
    });
    
    collection.deleteOne({ a : 3 }, (err, result) => {
        if(err) {
            console.log(`❌ Problem In Updating`)
            console.log(err)
            return
        }
        console.log("Deleted the document");
    });

    client.close();
})