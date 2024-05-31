<%@ page import="java.io.*, jakarta.servlet.*, jakarta.servlet.http.*" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Session Counter</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            padding-top: 50px;
        }
        .container {
            width: 50%;
            margin: 0 auto;
            border: 1px solid #ddd;
            border-radius: 10px;
            padding: 20px;
            background-color: #f9f9f9;
        }
        h1 {
            color: #333;
        }
        p {
            font-size: 18px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Session Counter</h1>
        <% 
            // Get the current session or create a new one
            HttpSession session = (HttpSession) request.getSession(false);
             
            // Get the counter from the session, or initialize to 0 if it doesn't exist
            Integer counter = (Integer) session.getAttribute("counter");
            if (counter == null) {
                counter = 0;
            }
            // Increment the counter
            counter++;
            // Store the updated counter back in the session
            session.setAttribute("counter", counter);
        %>
        <p>You have visited this page <%= counter %> times during this session.</p>
        <form action="sessionCounter1.jsp" method="get">
            <input type="submit" value="Refresh">
        </form>
    </div>
</body>
</html>
