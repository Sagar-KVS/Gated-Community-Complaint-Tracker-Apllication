<%@ page import="java.util.* , com.model.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Complaints</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #74ebd5, #ACB6E5);
        min-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background: #ffffff;
        padding: 30px;
        border-radius: 12px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.2);
        width: 90%;
        max-width: 900px;
        text-align: center;
    }

    h1 {
        margin-bottom: 20px;
        font-size: 22px;
        color: #333;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }

    th, td {
        padding: 12px;
        text-align: center;
        border-bottom: 1px solid #ddd;
    }

    th {
        background-color: #4CAF50;
        color: white;
    }

    tr:nth-child(even) {
        background-color: #f9f9f9;
    }

    tr:hover {
        background-color: #f1f1f1;
    }

    p {
        font-size: 16px;
        color: #444;
    }

    a {
        display: inline-block;
        margin-top: 20px;
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

    hr {
        margin: 25px 0;
        border: none;
        height: 1px;
        background: #ddd;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Your Complaints</h1>

        <%
            List<NewComplaint> complaintsList = (List<NewComplaint>) request.getAttribute("complaintsList"); 
            if(complaintsList != null && !complaintsList.isEmpty()){
        %>
        
        <table>
            <tr>
                <th>Complaint ID</th>
                <th>Complaint Name</th>
                <th>Flat Number</th>
                <th>Date</th>
                <th>Status</th>
                <th>Phone Number</th>
            </tr>
            
            <%
                for(NewComplaint complaint : complaintsList ){
            %>
            <tr>
                <td><%= complaint.getId() %></td>
                <td><%= complaint.getName() %></td>
                <td><%= complaint.getFlatNumber() %></td>
                <td><%= complaint.getDate() %></td>
                <td><%= complaint.getStatus() %></td>
                <td><%= complaint.getPhoneNumber() %></td>
            </tr>
            <% } %>
        </table>

        <hr>
        <% } else { %>
            <p>No complaints found</p>
        <% } %>

        <a href="userInfo.jsp"> Go to Home Page</a>
    </div>
</body>
</html>
