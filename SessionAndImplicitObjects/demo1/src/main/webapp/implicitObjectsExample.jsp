<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Implicit Objects Example</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 80%;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 10px;
            background-color: #f9f9f9;
        }
        h1 {
            color: #333;
        }
        p {
            font-size: 18px;
        }
        .info {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>JSP Implicit Objects Example</h1>

        <div class="info">
            <h2>Request Information</h2>
            <p><strong>Client IP Address:</strong> <%= request.getRemoteAddr() %></p>
            <p><strong>Requested URL:</strong> <%= request.getRequestURL() %></p>
            <p><strong>HTTP Method:</strong> <%= request.getMethod() %></p>
        </div>

        <div class="info">
            <h2>Session Information</h2>
            <%
            //    HttpSession session = request.getSession();
                String sessionId = session.getId();
                Long creationTime = session.getCreationTime();
                Long lastAccessedTime = session.getLastAccessedTime();

                session.setAttribute("username", "JohnDoe");
                String username = (String) session.getAttribute("username");
            %>
            <p><strong>Session ID:</strong> <%= sessionId %></p>
            <p><strong>Session Creation Time:</strong> <%= new java.util.Date(creationTime) %></p>
            <p><strong>Last Accessed Time:</strong> <%= new java.util.Date(lastAccessedTime) %></p>
            <p><strong>Username (stored in session):</strong> <%= username %></p>
        </div>

        <div class="info">
            <h2>Application Context Information</h2>
            <%
               // ServletContext application = getServletContext();
                application.setAttribute("appName", "My Awesome JSP App");
                String appName = (String) application.getAttribute("appName");
            %>
            <p><strong>Application Name:</strong> <%= appName %></p>
            <p><strong>Server Info:</strong> <%= application.getServerInfo() %></p>
            <p><strong>Servlet Context Name:</strong> <%= application.getServletContextName() %></p>
        </div>

        <div class="info">
            <h2>Using out, config, and pageContext Implicit Objects</h2>
            <p><strong>out object:</strong> <%= out.getClass().getName() %></p>
            <p><strong>Servlet Config Name:</strong> <%= config.getServletName() %></p>
            <p><strong>Page Context:</strong> <%= pageContext.getPage().getClass().getName() %></p>
        </div>
    </div>
</body>
</html>
