
const cardData = {
    img : 'https://shelleygrayteaching.com/wp-content/uploads/2020/03/Blue_3-x-5.png',
    ttl : 'Javascript Course',
    txt : 'A shallow copy of an object is a copy whose properties share the same references (point to the same underlying values) as those of the source object from which the copy was made.'
}

const cardDataArr = [
    {
        img : 'https://shelleygrayteaching.com/wp-content/uploads/2020/03/Blue_3-x-5.png',
        ttl : 'Javascript Course',
        txt : 'A shallow copy of an object is a copy whose properties share the same references (point to the same underlying values) as those of the source object from which the copy was made.'
    },
    {
        img : 'https://www.fossmint.com/wp-content/uploads/2020/03/Udemy-Advance-Python-Learning-Courses.png',
        ttl : 'Python Basics',
        txt : 'A shallow copy of an object is a copy whose properties share the same references (point to the same underlying values) as those of the source object from which the copy was made.'
    },
    {
        img : 'https://i.ytimg.com/vi/S0V20PHPR4M/maxresdefault.jpg',
        ttl : 'Java Fullstack',
        txt : 'A shallow copy of an object is a copy whose properties share the same references (point to the same underlying values) as those of the source object from which the copy was made.'
    }
]

function updateDateTime() {
    const headerDate = document.getElementById('hdrDt')
    console.log(headerDate)

    const headerTime = document.getElementById('hdrTm')
    console.log(headerTime)

    const today = new Date()
    headerDate.textContent = `Date : ${today.getFullYear()}-${today.getMonth()}-${today.getDate()}`
    headerTime.textContent = `Time : ${today.getHours()}:${today.getMinutes()}:${today.getSeconds()}`
}

function setCardDetails() {

    const img = document.getElementById('crdImg')
    img.src = cardData.img

    const ttlH5 = document.getElementById('crdTtl')
    ttlH5.textContent = cardData.ttl

    const txtPara = document.getElementById('crdTxt')
    txtPara.textContent = cardData.txt
}

function showAllCards() {
    const cardsSection = document.getElementById('cards')

    for( let crd of cardDataArr ) {
        const card = createNewCard(crd)
        cardsSection.appendChild(card)
    }
}

function createNewCard(cardData) {
    const cardContainer = document.createElement('div')
    cardContainer.classList.add('card')
    cardContainer.style.width = '18rem'

    const cardImg = document.createElement('img')
    cardImg.src = cardData.img
    cardImg.classList.add('card-img-top')
    cardContainer.appendChild(cardImg)

    const cardBody = document.createElement('div')
    cardBody.classList.add('card')
    cardContainer.appendChild(cardBody)

    const cardTitle = document.createElement('h5')
    cardTitle.textContent = cardData.ttl
    cardTitle.classList.add('card-title')
    cardBody.appendChild(cardTitle)

    const cardText = document.createElement('p')
    cardText.classList.add('card-title')
    cardText.textContent = cardData.txt
    cardBody.appendChild(cardText)

    return cardContainer
}

updateDateTime()
// setCardDetails()
showAllCards()


