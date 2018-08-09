<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<title>success</title>
</head>
<body>
<jstl:if test="${sessionScope.username != null}">
<div>
<jsp:include page="Header.jsp"></jsp:include>
</div>


	<h3>Hello ${sessionScope.username}</h3>


<div>
<jsp:include page="Footer.jsp"></jsp:include>
</div>
</jstl:if>
</body>
</html>