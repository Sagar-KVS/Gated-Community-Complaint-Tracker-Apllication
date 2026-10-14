<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #e0f7fa, #ffffff); /* Light blue to white */
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background: #fff;
        padding: 40px;
        border-radius: 12px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.25);
        width: 420px;
        text-align: center;
    }

    h1 {
        margin-bottom: 20px;
        color: #007bff;
    }

    label {
        display: block;
        text-align: left;
        margin: 10px 0 5px;
        font-weight: bold;
        color: #333;
    }

    input[type="text"],
    input[type="email"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 14px;
    }

    fieldset {
        border: none;
        margin: 15px 0;
        text-align: left;
    }

    legend {
        font-weight: bold;
        margin-bottom: 5px;
        color: #333;
    }

    .role-inline {
        display: flex;
        align-items: center;
        gap: 20px;
    }

    .role-inline label {
        font-weight: normal;
    }

    input[type="submit"] {
        background: #007bff;
        color: #fff;
        border: none;
        padding: 12px 20px;
        font-size: 16px;
        border-radius: 8px;
        cursor: pointer;
        transition: background 0.3s;
    }

    input[type="submit"]:hover {
        background: #0056b3;
    }

    p {
        margin-top: 15px;
        color: #555;
    }

    p a {
        color: #007bff;
        text-decoration: none;
        font-weight: bold;
    }

    p a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Signup Form</h1>
        <form action="SingUpServlet" method="post">
            <label for="name">User Name:</label>
            <input type="text" name="name" placeholder="Enter your name" required>

            <label for="email">Email:</label>
            <input type="email" name="email" placeholder="Enter email" required>

            <label for="password">Password:</label>
            <input type="password" name="password" placeholder="Enter password" required>

            <label for="confirm-password">Confirm Password:</label>
            <input type="password" name="confirm-password" placeholder="Enter password again" required>

           
            <fieldset>
                <legend>Role:</legend>
                <div class="role-inline">
                    <label><input type="radio" name="Role" value="user" required> User</label>
                    <label><input type="radio" name="Role" value="admin"> Admin</label>
                </div>
            </fieldset>

            <input type="submit" value="Signup">
            <p>Already have an account? <a href="index.html">Login</a></p>
        </form>
    </div>
</body>
</html>
