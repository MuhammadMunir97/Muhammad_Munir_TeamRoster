<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${team.getName()}</title>
</head>
<body>
	<h1>${team.getName()}</h1>
	<a href="PlayerController" >New Player</a>
	<c:forEach items="${team.getPlayers()}" var="player">	
   		<br> <Strong>${player}</strong>  <a href="DeletePlayer?id=${player.getKey()}" >Delete</a> 
	</c:forEach>
</body>
</html>