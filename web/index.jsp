<%-- 
    Document   : index
    Created on : Dec 6, 2020, 1:21:30 PM
    Author     : abhi
--%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="test" prefix="t" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <t:test first_name="${param.name}" last_name="Dananjaya">
            <!--<h1>asas</h1>-->
            ${cookie}
        </t:test>

        <t:loop start="1" end="10">
            <h1>HHIII</h1>
        </t:loop>

        <%
            ArrayList ar = new ArrayList();
            ar.add("A");
            ar.add("B");
            ar.add("C");
            ar.add("D");
            ar.add("E");
            ar.add("F");

            pageContext.setAttribute("l", ar);

        %>

        <t:forEach items="${l}" var="c">
            <h1>${c}</h1>
        </t:forEach>

    </body>
</html>
