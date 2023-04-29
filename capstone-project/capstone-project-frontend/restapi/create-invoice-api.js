function apiCreateNewInvoice(invoice, form) {

        const headers = {
                'content-type' : 'application/json'
        }

        axios.post('http://localhost:8080/invoice/', invoice, { headers })
                .then(res => {
                        form.reset()
                        showSuccessModal()
                })
                .catch(err => console.log(err))
}

function apiCreateNewCustomerInvoive(invoice, form) {
        const headers = {
                'content-type' : 'application/json'
        }

        axios.post('http://localhost:8080/invoice/customer', invoice, { headers })
                .then(res => {
                        form.reset()
                        showSuccessModal()
                })
                .catch(err => console.log(err))
}


function apiFindCustomersContaining(ss) {
        const url = `http://localhost:8080/customer/${ss}`
        axios.get(url)
                .then(httpResponse => httpResponse.data)
                .then(data => populateCustomerDataList(data))
                .catch(err => console.log(err))

}

function setupForm() {

        const searchCustomerIp = document.getElementById('ipCustomerSearch')
        searchCustomerIp.onkeyup = ke => {
                console.log(ke)
               
                const seachString = ke.target.value
                console.log(seachString)

                apiFindCustomersContaining(seachString)
        }
         

        const formInvoice = document.getElementById('formInvoice')


        formInvoice.onsubmit = ev => { // when form is submitted, this function would be called
               
                ev.preventDefault() // stop the default behaviour of refreshing the page
                console.log(ev)

                // const invoice = { id : 12,  client : 'abc', invDt : '2022-01-01', amt : 98.02 }

                const formData = new FormData(ev.target) // ev.target points to form tag in the html

                // for(let key of formData.keys()) {
                //         console.log(key) // this is mapped to name attribute of input tags
                // }

                // for(let val of formData.values()) {
                //         console.log(val) // this is mapped to name attribute of input tags
                // }

                // const invoice = { 
                //         client : formData.get('client') ,
                //         invDt: formData.get('invDt'),
                //         amt: formData.get('amt') 
                // }

                const invoice = Object.fromEntries(formData.entries()) // you are converting form data to js object
                console.log(invoice)

                // apiCreateNewInvoice(invoice, formInvoice) // we are pass form object to reset the form on success
                apiCreateNewCustomerInvoive(invoice, formInvoice)
        }
}
setupForm()

function showSuccessModal() {
        const myModalEl = document.getElementById('successModal');
        const modal = new bootstrap.Modal(myModalEl)
        modal.show()
}

function populateCustomerDataList(customers) {
        console.log(customers)
        const dataList = document.getElementById('datalistCustomers')
        dataList.innerHTML = ''

        for (const { id, name, mobile } of customers) {
                const option = document.createElement('option')
                option.value = id
                option.text = `${name}, ${mobile}`
                dataList.appendChild(option)
        }
}