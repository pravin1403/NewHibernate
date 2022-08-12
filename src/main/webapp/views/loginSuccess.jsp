<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login successfully </h1>
<form action="Login" method="GET" target="_blank">
<h1>Application Details</h1>

<br>
User ID:${user.uid}
<br>
<br>
Name:${user.name}
<br>
<br>
Username:${user.uname}
<br>
<br>
Email ID:${user.email}
<br>
<br>
Password:${user.upwd}
<br>
<br>
<input type="submit" value="Log Out">

</form>
<form action="update" method="get">
<input type="submit" value="Update">
</form>

<form action="delete" method="get">

<input type="submit" value="Delete Account">
</form>
</body>
</html>