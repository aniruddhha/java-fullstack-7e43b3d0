const readIdQueryParam = () => {
    const params = new Proxy(new URLSearchParams(window.location.search), {
        get: (searchParams, prop) => searchParams.get(prop),
    });
    return params.id
}

function apiGetInvoiceDetails() {
    const id = readIdQueryParam()

    axios.get(`http://localhost:8080/invoice/${id}`)
        .then(httpReponse => httpReponse.data)
        .then(data => populateDetails(data.bd))
        .catch(err => console.log(err))
}

function populateDetails({ id, client, amt, invDt }) {
    document.getElementById("invId").innerHTML = `<strong> Id </strong> : ${id}`
    document.getElementById("client").innerHTML = `<strong> Client </strong> : ${client}`
    document.getElementById("amt").innerHTML = `<strong> Amount </strong> : ${amt}`
    document.getElementById("invDt").innerHTML= `<strong> Date </strong> : ${invDt}`
}

apiGetInvoiceDetails()