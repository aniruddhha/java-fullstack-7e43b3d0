const headerDate = document.getElementById('hdrDt')
console.log(headerDate)

const headerTime = document.getElementById('hdrTm')
console.log(headerTime)

const today = new Date()
headerDate.textContent = `Date : ${today.getFullYear()}-${today.getMonth()}-${today.getDate()}`
headerTime.textContent = `Time : ${today.getHours()}:${today.getMinutes()}:${today.getSeconds()}`