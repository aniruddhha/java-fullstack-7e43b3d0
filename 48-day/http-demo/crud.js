const http = require('node:http')

const loggware = (req, res) => {
    console.log(`⚠️ Received ${req.method} request for ${req.url}`);
}

const globalErrorHandler = (req, res) => {
    console.log(`❌ This is Global Error handler`);
}

const server = http.createServer((req, res) => {

    // below are called middleware
    req.on('end', () =>  loggware(req, res))
    req.on('error', () =>  globalErrorHandler(req,res))

    // const url = req.url
    // const method = req.method

    const { url, method } = req

    if(method === 'GET' && url === '/') {
        // Handle GET request for root path
        res.writeHead(200, { 'Content-Type': 'application/json' });
        res.end(JSON.stringify({ message: 'GET request received for root path' }));
    } else if(method === 'POST' && url === '/') {
        // Handle POST request for root path

        let reqData = '';
        req.on('data', chunk => reqData += chunk )
        req.on('end', () => {
            const json = JSON.parse(reqData);
            console.log('Received JSON:', json);
            res.writeHead(200, { 'Content-Type': 'application/json' });
            res.end(JSON.stringify({ message: 'JSON received successfully', bdy : json }));
        })
    } else if (method === 'PUT' && url === '/users') {
        // Handle PUT request for /users path
        res.writeHead(200, { 'Content-Type': 'application/json' });
        res.end(JSON.stringify({ message: 'PUT request received for /users path' }));
    }  else if (method === 'DELETE' && url === '/users') {
        // Handle DELETE request for /users path
        res.writeHead(200, { 'Content-Type': 'application/json' });
        res.end(JSON.stringify({ message: 'DELETE request received for /users path' }));
    } else {
         // Handle requests with unknown method or URL path
         res.writeHead(404, { 'Content-Type': 'text/plain' });
         res.end('404 Not Found');
    }
})

server.listen(3000, '127.0.0.1', (err) => {
    if(err) {
        console.log(`❌ There is an error`)    
        console.log(err)
        return
    }
    console.log(`✅ Listening on 3000 port`)
})