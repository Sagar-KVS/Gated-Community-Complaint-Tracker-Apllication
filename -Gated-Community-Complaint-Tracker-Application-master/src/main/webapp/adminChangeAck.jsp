<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Status Updated</title>
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
        padding: 30px;
        border-radius: 12px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.25);
        width: 450px;
        text-align: center;
    }

    h1 {
        font-size: 22px;
        color: #007bff;
        margin-bottom: 20px;
    }

    p {
        font-size: 16px;
        color: #333;
        margin-bottom: 25px;
    }

    a {
        text-decoration: none;
        font-weight: bold;
        color: #fff;
        background: #007bff;
        padding: 10px 20px;
        border-radius: 8px;
        transition: background 0.3s;
    }

    a:hover {
        background: #0056b3;
    }
</style>
</head>
<body>
    <div class="container">
        <h1> You have changed the status successfully!</h1>
        <p>To visit all updated complaints <a href="AdminViewComplants">click here</a></p>

    </div>
</body>
</html>
