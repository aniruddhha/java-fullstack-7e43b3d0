const axios = require('axios');

axios.get('https://reqres.in/api/users?page=2')
  .then(function (response) {
    // handle success
    console.log(response.data.data);
  })
  .catch(function (error) {
    // handle error
    console.log(error);
  })
  .finally(function () {
    // always executed
  });