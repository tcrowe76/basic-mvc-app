<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>
		Welcome to application!</h1>
	
	<P>  The time on the server is ${serverTime}. 
	<form action="login">
			<input type="submit">
	</form></P>


</body>
</html>
