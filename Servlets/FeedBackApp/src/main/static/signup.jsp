<!DOCTYPE html>
<html>
<head>
    <title>Signup</title>
</head>
<body>

<h2>Signup</h2>

<form action="signup" method="post">

    <label>User ID:</label>
    <input type="text" name="userId" required>
    <br><br>
    <label>Name:</label>
     <input type="text" name="name" required>
        <br><br>

    <label>Email:</label>
    <input type="email" name="email" required>
    <br><br>

    <label>Password:</label>
    <input type="password" name="password" required>
    <br><br>

    <label>Confirm Password:</label>
    <input type="password" name="confirmPassword" required>
    <br><br>

    <button type="submit">Sign Up</button>

</form>

</body>
</html>