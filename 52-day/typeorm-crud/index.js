const typeorm = require('typeorm')

const dataSource = new typeorm.DataSource({
    type: "mysql",
    host: "localhost",
    port: 3306,
    username: "root",
    password: "aniruddha",
    database: "nodejsdb",
    synchronize: true,
    entities: [ require("./Post"), require("./Category")],
    logging: true,
})

dataSource.initialize().then(() => {
    console.log(`✅ Successfully Created`)

    var category1 = {
        id: 1,
        name: "Python",
    }
    var category2 = {
        name: "Programming",
    }

    const categoryRepository = dataSource.getRepository('Category')
    categoryRepository.save(category1).then(saved => {
        console.log(`✅ Category Saved`)
    }).catch(console.log)
    categoryRepository.save(category2).then(saved => {
        console.log(`✅ Category Saved`)
    }).catch(console.log)

    // categoryRepository.find().then(categories => console.log(categories)).catch(console.log)

    // categoryRepository.delete(2).then(res => console.log(`✅ Deleted Successfully`)).catch(console.log)
}).catch(error => {
    console.log("❌ Error: ", error)
})