<%@ page import="java.io.*, java.sql.*, jakarta.servlet.*, jakarta.servlet.http.*" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 50%;
            margin: 0 auto;
            text-align: center;
            padding: 50px;
            border: 1px solid #ddd;
            border-radius: 10px;
            background-color: #f9f9f9;
        }
        h1 {
            color: #333;
        }
        .logout {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome, 
        <% 
          
            if (session != null) {
                String username = (String) session.getAttribute("username");
                out.print(username);
            } else {
                response.sendRedirect("login.jsp");
            }
        %>!
        </h1>
        <p>You have successfully logged in.</p>
        <form action="login.jsp" method="post">
            <input type="submit" value="Logout" class="logout">
        </form>
    </div>
</body>
</html>
