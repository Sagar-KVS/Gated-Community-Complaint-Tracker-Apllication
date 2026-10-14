<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complaint Added</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #74ebd5, #ACB6E5);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background: #ffffff;
        padding: 40px;
        border-radius: 12px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.2);
        text-align: center;
        width: 400px;
    }

    h1 {
        margin-bottom: 25px;
        font-size: 22px;
        color: #333;
    }

    a {
        display: inline-block;
        margin-top: 15px;
        padding: 12px 20px;
        background: #4CAF50;
        color: white;
        text-decoration: none;
        border-radius: 6px;
        font-weight: bold;
        transition: background 0.3s;
    }

    a:hover {
        background: #45a049;
    }
</style>
</head>
<body>
    <div class="container">
        <h1> You have added a new complaint successfully!</h1>
        <a href="userInfo.jsp"> Go to Home Page</a>
    </div>
</body>
</html>
