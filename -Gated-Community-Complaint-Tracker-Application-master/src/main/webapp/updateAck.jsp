<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complaint Updated</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #56CCF2, #2F80ED);
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
        width: 450px;
    }

    h1 {
        font-size: 22px;
        color: #333;
        margin-bottom: 20px;
    }

    .success {
        font-size: 20px;
        font-weight: bold;
        color: green;
        margin-bottom: 25px;
    }

    .home-link {
        display: inline-block;
        padding: 12px 20px;
        background: #4CAF50;
        color: white;
        text-decoration: none;
        border-radius: 6px;
        font-weight: bold;
        transition: background 0.3s;
    }

    .home-link:hover {
        background: #45a049;
    }
</style>
</head>
<body>
    <div class="container">
        <h1 class="success"> You have updated the complaint successfully!</h1>
        <a href="userInfo.jsp" class="home-link"> Go to Home Page</a>
    </div>
</body>
</html>
