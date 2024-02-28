<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
    rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
    crossorigin="anonymous">
    
     <style>
     .action{
     position:absolute;
     top:200px;
     right:400px;
     } 
     </style>
</head>
<body>

<div class="action">
 <form action="index.jsp">
   <h1 style="color:green" align="center">Thanks For Applying!!!!</h1>
    <h2>${name}</h2>
    
    <h3 align="center"><b>Voter Id Number is<b>:${voterId}</h3>
    <button type="submit" class="btn btn-primary">Home</button>
    </form>
    </div>

    
</body>
</html>