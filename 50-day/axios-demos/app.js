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

const data = { 
    name : 'abc',
    job: 'aaa'
}

axios.post('https://reqres.in/api/users', data)
    .then( res  => console.log(res.data))
    .catch(err => console.log(err))

axios.delete('https://reqres.in/api/users/2')
    .then( res => console.log(res.status) )
    .catch(err => console.log(err))

const updatedData = { 
    name : 'abc',
    job: 'sss'
}
axios.put('https://reqres.in/api/users/2', updatedData)
    .then( res => console.log(res.data) )
    .catch(err => console.log(err))