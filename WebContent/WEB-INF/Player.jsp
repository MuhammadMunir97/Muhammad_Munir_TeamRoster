<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD PLAYER</title>
</head>
<body>
	<form action= "PlayerController" method="Post">
		FirstName : <input type="text" name="firstName" /><br>
		LastName : <input type="text" name="lastName" /><br>
		Age : <input type="number" name="age" /><br>
		<input type="submit" value="Create Player" />
	</form>	
</body>
</html>