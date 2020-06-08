<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <BODY BGCOLOR="CYAN">
            <HEAD><TITLE>Nitin Sharma</TITLE></HEAD>
           <%
             
           java.util.Date date = new java.util.Date();
          
           System.out.println( "Nitin Sharma" );
           %>

	<pre style="font-family: chiller; font-size: 27px">
  <a href="http://www.facebook.com"target="_blank">Link to Facebook </a>

  <a href="http://www.gmail.com"target="_blank">Link to G.Mail </a>

  <a href="http://www.google.com"target="_blank">Link to Google </a>

  <a href="http://www.yahoomail.com/"target="_blank">Link to Yahoo </a>

  <a href="http://tv.blinkx.com"target="_blank">Link to Tv.blinkx </a> </pre><p  style="font-family:Monotype Corsiva; font-size:70px;text-align:center;color: #ff0000"> Nitin Sharma </p>
        <%
    out.println( date );
    out.println( "<BR>Your machine's address is " );
    out.println( request.getRemoteHost());
%>





        </body>
    </html>
</f:view>
