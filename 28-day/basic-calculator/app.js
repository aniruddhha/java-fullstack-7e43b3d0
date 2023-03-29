const calcForm = document.getElementById('calcForm')

calcForm.onsubmit = ev => {

    console.log(ev)
    console.log(ev.submitter.id)
    ev.preventDefault()

    const whBtn = ev.submitter.id

    const txtNum1 = document.getElementById('txtNum1')
    console.log(txtNum1)
    console.log(txtNum1.value)

    const txtNum2 = document.getElementById('txtNum2')
    console.log(txtNum2)
    console.log(txtNum2.value)

    const hdrRes = document.getElementById('hdrRes')

    if (whBtn == 'add')
        hdrRes.textContent = Number.parseInt(txtNum1.value) + Number.parseInt(txtNum2.value)
    if (whBtn == 'sub')
        hdrRes.textContent = Number.parseInt(txtNum1.value) - Number.parseInt(txtNum2.value)
    if (whBtn == 'mul')
        hdrRes.textContent = Number.parseInt(txtNum1.value) * Number.parseInt(txtNum2.value)
    if (whBtn == 'div')
        hdrRes.textContent = Number.parseInt(txtNum1.value) / Number.parseInt(txtNum2.value)
}