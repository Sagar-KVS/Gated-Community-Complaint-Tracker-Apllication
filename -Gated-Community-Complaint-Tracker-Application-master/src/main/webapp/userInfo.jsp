<%@ page import="java.util.* , com.model.*" language="java"
    contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Info</title>
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
        display: block;
        margin: 12px 0;
        padding: 12px;
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

    hr {
        margin-top: 25px;
        border: none;
        height: 1px;
        background: #ddd;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Welcome <%= session.getAttribute("email") %> !</h1>
        
        <a href="newcomplaint.jsp"> Add New Complaint</a>
        <a href="ViewUserComplaints"> View Your Complaints</a>
        <a href="UpdateDelete"> Update / Delete Complaint</a>
        <a href="UserViewHistory"> View History</a>
        <a href="index.html"> Log Out</a>
        
        <hr>
    </div>
</body>
</html>
