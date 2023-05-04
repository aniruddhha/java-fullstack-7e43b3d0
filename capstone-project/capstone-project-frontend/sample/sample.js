const frm = document.getElementById('frmSmp')

frm.onsubmit = ev => {

    ev.preventDefault()
    
    console.log(ev)
}