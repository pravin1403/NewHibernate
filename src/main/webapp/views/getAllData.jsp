<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Get All Data of Bikkad IT Student</h1>
<table border="1">
<thead>
<tr>
<td>User ID<td>
<td>Name<td>
<td>Username<td>
<td>User Email Id<td>
<td>Password<td>

</tr>
</thead>

<tbody>
<c:forEach items="${list}" var="l">
<tr>
<td>${l.uid}<td>
<td>${l.name}<td>
<td>${l.uname}<td>
<td>${l.email}<td>
<td>${l.upwd}<td>
</tr>

</c:forEach>

</tbody>




</table>
</body>
</html>