console.log(axios)

axios.get('http://localhost:8080/invoice/')
        .then(console.log)
        .catch(console.log)