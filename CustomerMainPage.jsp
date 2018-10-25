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
 <SCRIPT type="text/javascript" src="vkboard.js"></SCRIPT>

        <SCRIPT>

        // Minimal callback function:
        function keyb_callback(char)
        {
            // Let's bind vkeyboard to the <TEXTAREA>

            // with id="textfield":
            var text =
                document.getElementById("textfield"), val = text.value;

            switch(ch)
            {
                case "BackSpace":
                var min=(val.charCodeAt(val.length - 1) == 10) ? 2 : 1;
                text.value = val.substr(0, val.length - min);
                break;

               case "Enter":
                   text.value += "\n";
                   break;

               default:
                   text.value += ch;
            }
        }

        </SCRIPT>
</head>
<body>
	<div align="center">
		<table cellpadding=5 cellspacing=5>
			<tr>
				<h1>
					<font>Click to procced your request</font>
				</h1>
			</tr>
			<tr>
				<td>
					<form name="deposit" action="" method="post">
						<input type="submit" value="Deposit" />
					</form>
				</td>
				<td>
					<form name="withraw" action="" method="post">
						<input type="submit" value="Withraw" />
					</form>
				</td>
				<td>
					<form name="fundTransfer" action="" method="post">
						<input type="submit" value="Fund Transfer" />
					</form>
				</td>
				<td>
					<form name="viewDetails" action="" method="post">
						<input type="submit" value="View Details" />
					</form>
				</td>
					<td>
					<form name="miniStatement" action="" method="post">
						<input type="submit" value="Mini Statement" />
					</form>
				</td>
				<td>
					<form name="deleteAccount" action="" method="post">
						<input type="submit" value="Delete Account" />
					</form>
				</td>
			</tr>
		</table>
	</div>
	
</body>
</html>