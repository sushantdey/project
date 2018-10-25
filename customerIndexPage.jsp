<!DOCTYPE html>
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
}
</style>
</head>
<body>
	<div align="center">
		<table cellpadding=5 cellspacing=5>
			<tr>
				<td>
					<form name="customerlogin" action="customerloginPage.jsp" method="post">
						<input type="submit" value="Customer Login" />
					</form>
				</td>
				<td>
					<form name="customerRegistration" action="acceptCustomerDetailsPage.jsp" method="post">
						<input type="submit" value="Customer Registration" />
					</form>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>