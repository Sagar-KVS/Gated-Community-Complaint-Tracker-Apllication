<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Change Status</title>
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
        background: #fff;
        padding: 30px;
        border-radius: 12px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.25);
        width: 400px;
        text-align: center;
    }

    h1 {
        font-size: 22px;
        color: #333;
        margin-bottom: 15px;
    }

    p {
        font-size: 16px;
        margin-bottom: 20px;
        color: #444;
    }

    fieldset {
        border: none;
        margin: 0;
        padding: 0;
    }

    legend {
        font-size: 16px;
        margin-bottom: 10px;
        font-weight: bold;
        color: #222;
    }

    .radio-group {
        display: flex;
        justify-content: space-around;
        margin-bottom: 20px;
    }

    .radio-option {
        position: relative;
    }

    .radio-option input[type="radio"] {
        display: none; /* hide the default radio */
    }

    .radio-option label {
        display: inline-block;
        padding: 8px 16px;
        border: 2px solid #007bff;
        border-radius: 20px;
        cursor: pointer;
        font-size: 14px;
        transition: all 0.3s;
        user-select: none;
    }

    .radio-option input[type="radio"]:checked + label {
        background: #007bff;
        color: white;
    }

    input[type="submit"] {
        margin-top: 10px;
        padding: 10px 20px;
        font-size: 15px;
        font-weight: bold;
        background: #007bff;
        color: white;
        border: none;
        border-radius: 6px;
        cursor: pointer;
        transition: background 0.3s;
    }

    input[type="submit"]:hover {
        background: #0056b3;
    }
</style>
</head>
<body>
    <div class="container">
        <h1> Change Complaint Status</h1>
        <p>Dear Admin, you can update the status of this complaint</p>

        <form action="AdminUpadateStatus" method="post">
            <input type="hidden" name="id" value="<%= request.getParameter("id") %>">

            <fieldset>
                <legend>Select New Status:</legend>
                <div class="radio-group">
                    <div class="radio-option">
                        <input type="radio" id="inprogress" name="changestatus" value="inprogress">
                        <label for="inprogress">InProgress</label>
                    </div>
                    <div class="radio-option">
                        <input type="radio" id="pending" name="changestatus" value="pending">
                        <label for="pending">Pending</label>
                    </div>
                    <div class="radio-option">
                        <input type="radio" id="resolved" name="changestatus" value="resolved">
                        <label for="resolved">Resolved</label>
                    </div>
                </div>
            </fieldset>

            <input type="submit" value="Change Status">
        </form>
    </div>
</body>
</html>
