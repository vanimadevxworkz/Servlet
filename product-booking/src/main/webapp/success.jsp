<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
    rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
    crossorigin="anonymous">
    
<style>
.back{
position:absolute;
right:700px;
}

</style>
<body>

<h1 align="center">Thanks for Buying Product</h1>

<form action="index.jsp">
<h2 align="center">Total bill is:${price}</b></h2>
<br>

<div class="back">
 <button type="button" class="btn btn-success">Home</button>
 </div>
</form>

</body>
</html>