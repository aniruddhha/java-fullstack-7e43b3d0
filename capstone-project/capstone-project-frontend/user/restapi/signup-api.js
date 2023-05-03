const validateForm = ({ userName, password, role }) => {

    const roles = ['admin', 'user']

    if (userName.length <= 0) return { msg: 'invalid username', sts: false}
    if (password.length <= 0) return { msg: 'invalid password', sts: false }
    if((role.length <= 0) || !roles.includes(role)) return { msg: 'invalid role', sts: false }

    return { sts : 'success', msg :'all fields are valid' }
}

function setupForm() {

    const err = document.getElementById('errMsg')
    err.style.display = 'none'

    const formSignup = document.getElementById('formSignup')

    formSignup.onsubmit = ev => { // when form is submitted, this function would be called

        ev.preventDefault() // stop the default behaviour of refreshing the page

        const formData = new FormData(ev.target) // ev.target points to form tag in the html

        const user = Object.fromEntries(formData.entries()) // you are converting form data to js object
        console.log(user)

        const { sts, msg } = validateForm(user)

        if (sts) apiSignup(user, formSignup)
        else {
            err.style.display = 'block'
            err.innerHTML = `<strong>${msg}</strong>`
        }
    }
}

setupForm()

function apiSignup(invoice, form) {
    const headers = {
        'content-type': 'application/json'
    }

    axios.post('http://localhost:8080/user/', invoice, { headers })
        .then(res => {
            form.reset()
            showSuccessModal()
        }).catch(err => console.log(err))
}

function showSuccessModal() {
    const myModalEl = document.getElementById('successModal');
    const modal = new bootstrap.Modal(myModalEl)
    modal.show()
}