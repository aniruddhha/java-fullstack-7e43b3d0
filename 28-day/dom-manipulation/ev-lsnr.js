

let sts = false

const dvAlt = document.getElementById('dvAlt')

const btnAlt = document.getElementById('btnAlt')

btnAlt.onclick = () => {
    console.log(`Button Clicked`)
    if(sts) {
        dvAlt.style.display = 'none'
        sts = false
    }else {
        dvAlt.style.display = 'block'
        sts = true
    }
}