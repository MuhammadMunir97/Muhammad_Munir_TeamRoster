<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Roster</title>
</head>
<body>
<h1>Welcome to the team Roster</h1>
	<a href="TeamController" >New Team</a>
	<br><br>
	<c:forEach items="${teams}" var="team">	
   		<br> <Strong>${team}</strong> <a href="ShowTeamController?id=${team.getKey()}" >Details</a>
   		<a href="DeleteTeam?id=${team.getKey()}" >Delete</a> 
	</c:forEach>
</body>
</html>