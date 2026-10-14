<%@ page import="java.util.* , com.model.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Complaints List</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #e0f7fa, #ffffff); 
        min-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background: #fff;
        padding: 30px;
        border-radius: 12px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.25);
        width: 90%;
        max-width: 1000px;
        text-align: center;
    }

    h1 {
        font-size: 24px;
        color: #333;
        margin-bottom: 20px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin-bottom: 20px;
    }

    table th, table td {
        border: 1px solid #ccc;
        padding: 10px;
        text-align: center;
        font-size: 14px;
    }

    table th {
        background: #007bff;
        color: #fff;
    }

    table tr:nth-child(even) {
        background: #f9f9f9;
    }

    .btn-link {
        padding: 6px 12px;
        background: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        font-size: 13px;
        transition: background 0.3s;
    }

    .btn-link:hover {
        background: #0056b3;
    }

    .logout {
        margin-top: 20px;
    }

    .logout a {
        display: inline-block;
        padding: 10px 20px;
        background: #dc3545;
        color: white;
        text-decoration: none;
        border-radius: 6px;
        font-weight: bold;
        transition: background 0.3s;
    }

    .logout a:hover {
        background: #a71d2a;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>All Complaints</h1>

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
                <th>Update</th>
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
                <td>
                    <a href="AdminUpadate.jsp?id=<%= complaint.getId() %>" class="btn-link">Update</a>
                </td>
            </tr>
            <% } %>
        </table>
        
        <% } else { %>
            <p style="color: red; font-weight: bold;"> No complaints found</p>
        <% } %>

        <div class="logout">
            <a href="index.html"> Log Out</a>
        </div>
    </div>
</body>
</html>
