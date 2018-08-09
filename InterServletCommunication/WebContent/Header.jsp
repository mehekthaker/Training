<!DOCTYPE html>
<html>
<head>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
h1{
	text-align:center;
	font-family:"Serif";
	color:#CCCC00;
}
div{
	box-shadow: 5px 10px #888888;
	padding: 10px;

}

</style>
</head>
<body>

<div>
<h1>Welcome to the MyDocs Portal &#8208; A safe way of sharing documents</h1>
<jstl:if test="${sessionScope.username != null}">
	<h3><a href="logout.app" style="float:right; padding:10px;">Logout</a></h3>
</jstl:if>

</div>

</body>
</html>