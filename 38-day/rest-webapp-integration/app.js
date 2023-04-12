const form = document.getElementById('formCreateNewUser')

form.addEventListener('submit', async ev => {
    ev.preventDefault()

    const frmDt = new FormData(ev.target)
    const owner = frmDt.get('owner');
    const balance = frmDt.get('balance');

    const reqObj = { id: 1, owner : owner, balance: balance }
    console.log(reqObj)

    postCreateNewUserRequest(reqObj)
    
})


async function postCreateNewUserRequest(reqObj) {
    const response = await fetch('http://localhost:8080/atm/', { 
        method : 'POST',
        headers : {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body : JSON.stringify(reqObj)
    })

    const json = await response.json()

    showSuccessMessage(json.msg)

    console.log(json)
}


function showSuccessMessage(msg) {
    const alt = document.getElementById('altSc')
    alt.style.display = 'block'
    alt.innerText = msg
}