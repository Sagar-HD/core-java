<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>index</title>
</head>
<body>

    <h1> Register</h1>

<form method="POST" action="register">
<label for="name" >Name :</label>
  <input type="text" name="name" placeholder="enter name"/>
<label for="password" >Name :</label>
  <input type="text" name="password" placeholder="enter password"/>
  <button type="submit">Submit</button>
  </form>

  <p> ${message} </p>

</body>
</html>