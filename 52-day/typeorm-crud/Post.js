const EntitySchema = require("typeorm").EntitySchema

module.exports = new EntitySchema({
    name: "Post", // Will use table name `post` as default behaviour.
    tableName: "posts", // Optional: Provide `tableName` property to override the default behaviour for table name.
    columns: {
        id: {
            primary: true,
            type: "int",
            generated: true,
        },
        title: {
            type: "varchar",
        },
        text: {
            type: "text",
        },
    },
    relations: {
        categories: {
            target: "Category",
            type: "many-to-many",
            joinTable: true,
            cascade: true,
        },
    },
})