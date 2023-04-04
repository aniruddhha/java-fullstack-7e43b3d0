<html>
<head>
    <title>User Creation</title>
</head>
<body>
    <form method="post" action="/user/create">
       
        <label for="id">Id:</label>
        <input type="number" id="id" name="id"/><br/>

        <label for="nm">Name:</label>
        <input type="text" id="nm" name="name"/><br/>
    
        <label for="mob">Mobile:</label>
        <input type="number" id="mob" name="mobile"/><br/>
    
        <label for="email">Email:</label>
        <input type="email" id="email" name="email"/><br/>
    
        <input type="submit" value="Submit"/>
    </form>
</body>
</html>