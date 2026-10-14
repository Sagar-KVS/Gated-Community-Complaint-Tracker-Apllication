<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin views</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
      
           background: linear-gradient(to right, #e0f7fa, #ffffff);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background: #ffffff;
        padding: 40px;
        border-radius: 12px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.25);
        text-align: center;
        width: 480px;
    }

    h1 {
        font-size: 22px;
        color: #333;
        margin-bottom: 20px;
    }

    .welcome {
        font-size: 20px;
        font-weight: bold;
        color: #007bff;
        margin-bottom: 25px;
    }

    .link-btn {
        display: inline-block;
        padding: 12px 20px;
        background: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 6px;
        font-weight: bold;
        transition: background 0.3s;
    }

    .link-btn:hover {
        background: #0056b3;
    }
</style>
</head>
<body>
    <div class="container">
        <h1 class="welcome"> Welcome Admin <%= session.getAttribute("adminName") %>!</h1>
        <a href="AdminViewComplants" class="link-btn"> Visit All Complaints</a>
    </div>
</body>
</html>
