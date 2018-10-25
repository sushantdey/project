<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
<style type="text/css">
h1 {
	color: red;
}

body {
	background-color: skyblue;
	 background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
      height: 150%;
 
}
</style>
</head>
<body  background="indeximage.jpg">
	<div align="center">
		
		<table cellpadding=5 cellspacing=5>
			<tr>
				<h1>
					<font style="font-size:50px">Welcome to </font>
				</h1>
			</tr>
			
			<br>
			<br>
			<tr>
				<td>
					<form name="customer" action="customerIndexPage.jsp" size="35" method="post">
						<input type="submit" value="Customer" />
					</form>
				</td>
				<td>
					<form name="manager" action="manager.jsp" method="post">
						<input type="submit" value="Manager" />
					</form>
				</td>
			</tr>
		</table>
	</div>
	
</body>
</html> -->






<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
    height: 100%;
    font-family: Arial, Helvetica, sans-serif;
}

*{
    box-sizing: border-box;
}
.bg-img {
    /* The image used */
    background-image:  url("indeximage2.jpg");

    min-height: 750px;

    /* Center and scale the image nicely */
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
    position: relative;
}

/* Add styles to the form container */
.container {
    position: absolute;
    right: 0;
    margin: 20px;
    max-width: 300px;
    padding: 16px;
    background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

/* Set a style for the submit button */
.btn {
    background-color: #4CAF50;
    color: white;
    padding: 16px 20px;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

.btn:hover {
    opacity: 1;
}
</style>
</head>
<body>

<div class="bg-img">
  <form class="container">
    <h1>Welcome to Capgemini Banking</h1>

  					 <form name="customer" action="customerIndexPage.jsp" size="35" method="post">
						<input type="submit" value="Customer" />
					</form>

			<form name="manager" action="manager.jsp" method="post">
						<input type="submit" value="Manager" />
					</form>

  </form>
</div>
</body>
</html>