<html>
<head>
    <title>log4j shell vulnerable site</title>
</head>
<body>
<h2>Below field is logged</h2>
<form method="post" action="saveDetails"> 
    Logged Field : <input type="text" name="testInput"/>
    <input type="submit" value="Submit">
</form>
</body>
</html>
