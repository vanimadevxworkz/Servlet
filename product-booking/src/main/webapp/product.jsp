<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Booking</title>
</head>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" 
   integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" 
   crossorigin="anonymous"></script>
   
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" 
    integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
    crossorigin="anonymous"></script>
    
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
    rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
    crossorigin="anonymous">
    
    <style>
      footer {
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  background-color: black;
  color: white;
  text-align: center;
  padding: 10px;
  }
  .form{
  position:absolute;
  right:600px;
  }
    </style>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
      
        <image src="https://img.freepik.com/free-photo/electronic-device-balancing-concept_23-2150422322.jpg "         
    alt=" width="60" height="64">
         </div>
        </div>
        </nav>
        
        <h3 align="center">Booking Here!!!!!!!</h3>
        <br>
        <br>
        <div class="form">
          <form action="submit" method="get">
       <select class="form-select" aria-label="Default select example" name="productName">
  <option selected>Select ProductName</option>
  <option value="Mobile">Mobile</option>
  <option value="Laptop">Laptop</option>
  <option value="Charger">Charger</option>
  <option value="4">Speaker</option>
  <option value="5">Stand</option>
  <option value="6">Tv</option>
  <option value="7">Chair</option>
</select>
        <br>
            <input type="tel" placeholder="quantity" name="quantity">
            <br>  
        <br>
          <input type="tel" placeholder="price" name="price">
            <br>
        <br>
       <button type="submit" class="btn btn-success">Submit</button>
       
      <input type="reset" class="btn btn-primary" value="Clear">
      <br>
      <br>
        </form>
        </div>

<footer>
 <span><b>DesignedBy:Vanishri<b></b></span>
 <span>Copyright@2024</span>
    </footer>

</body>
</html>