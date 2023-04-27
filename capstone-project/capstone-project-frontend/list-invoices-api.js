function setupTable() {
    const table = document.getElementById('tableInvoice')

    fetchAllInvoices(table)
}

setupTable()

function populateStaticData(table) {
    for(let i = 0 ; i < 10; i++) {
        const row = table.insertRow()
        row.insertCell(0).innerHTML = i + 1
        row.insertCell(1).innerHTML = 'abc'
        row.insertCell(2).innerHTML = 2333
        row.insertCell(3).innerHTML = '2020-01-01'
        row.insertCell(4).innerHTML = `<a href='#'>View</a> <a class='ms-2' href='#'>Update</a> <a class='ms-2' href='#'>Delete</a> `
    }
}

function propulateActualData(table, invoices) {

    for(let i = 0; i < invoices.length; i++) {

        const { id, client, invDt, amt } = invoices[i]

        const row = table.insertRow()
        row.insertCell(0).innerHTML = id
        row.insertCell(1).innerHTML = client
        row.insertCell(2).innerHTML = amt
        row.insertCell(3).innerHTML = invDt
        row.insertCell(4).innerHTML = `<a href='#'>View</a> <a class='ms-2' href='#'>Update</a> <a class='ms-2' href='#'>Delete</a> `
    }
}

function fetchAllInvoices(table) {
    axios.get('http://localhost:8080/invoice/')
        .then(res => {
            const { data } = res
            console.log(data)  
            const { sts, msg, bd } = data

            propulateActualData(table, bd)
        })
        .catch(err => console.log(err))
}