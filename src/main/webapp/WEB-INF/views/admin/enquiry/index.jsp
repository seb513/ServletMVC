<%-- 
    Document   : index
    Created on : Feb 26, 2016, 11:52:28 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enqueries</h1>
        
        <table>
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Subject</th>
            </tr>
            <c:forEach var="c" items="${requestScope.contacts}">
                <tr>
                    <td>${c.getFirstName()}</td>
                    <%--
                    <td>${c.firstName} ${c.lastName}}</td>
                    --%>
                    <td>${c.getSubject()}</td>
                    <%--
                    <td>${c.subject}</td>
                    --%>
                    <td>${c.getEmail()}</td>
                    <%--
                    <td>${c.email}</td>
                    --%>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
