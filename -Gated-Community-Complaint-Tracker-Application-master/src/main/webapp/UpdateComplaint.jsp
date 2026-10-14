<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Complaint</title>
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
        width: 400px;
    }

    h1 {
        text-align: center;
        margin-bottom: 25px;
        font-size: 22px;
        color: #333;
    }

    label {
        display: block;
        margin-bottom: 6px;
        font-weight: bold;
        color: #444;
    }

    input {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 14px;
    }

    input[type="submit"] {
        width: 100%;
        background: #2196F3;
        color: white;
        font-size: 16px;
        font-weight: bold;
        border: none;
        border-radius: 6px;
        padding: 12px;
        cursor: pointer;
        transition: background 0.3s;
    }

    input[type="submit"]:hover {
        background: #0b7dda;
    }

    .home-link {
        display: inline-block;
        margin-top: 15px;
        padding: 12px 20px;
        background: #4CAF50;
        color: white;
        text-decoration: none;
        border-radius: 6px;
        font-weight: bold;
        transition: background 0.3s;
        text-align: center;
        width: 100%;
    }

    .home-link:hover {
        background: #45a049;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Update Complaint</h1>
        <form action="UserUpdateComplaint" method="post">
            <input type="hidden" name="id" value="<%= request.getParameter("id") %>">
            
            <label for="complaintName">Complaint Name:</label>
            <input type="text" name="complalintName" placeholder="Enter your Problem" required>
            
            <label for="FlatNumber">Flat Number:</label>
            <input type="text" name="FlatNumber" placeholder="Enter Flat Number" required>
            
            <label for="complaintDate">Complaint Date:</label>
            <input type="date" name="complalintDate" required>
            
            <label for="phoneNumber">Phone Number:</label>
            <input type="number" name="phoneNumber" placeholder="Enter Phone Number" required>
            
            <input type="submit" value="Update Complaint">
        </form>

        <a href="userInfo.jsp" class="home-link"> Back to Home</a>
    </div>
</body>
</html>
