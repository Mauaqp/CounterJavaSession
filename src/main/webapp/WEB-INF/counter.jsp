<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visitas Actuales</title>
</head>
<body>
	<h1>
	Has visitado <a href="/" >http://localhost:8080</a>
	<c:out value="${count}"></c:out> veces.
	</h1>
	<p><a href="/">Prueba otra visita?</a></p>
	<p><a href="/counter2">Counter +2?</a></p>
	<a href="/reset">Reset</a>
</body>
</html>