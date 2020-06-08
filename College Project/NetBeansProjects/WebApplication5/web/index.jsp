<%-- 
    Document   : index
    Created on : Apr 6, 2011, 1:07:13 PM
    Author     : Nitin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<HTML>
<TITLE>Login</TITLE>
<BODY>
<FORM ACTION="LoginHandler" METHOD="POST">
<CENTER>
<TABLE BORDER=0>
<TR><TD COLSPAN=2>
<P ALIGN=center>
Welcome!  Please enter your Name<br>
 and Password to log in.
</TD></TR>

<TR><TD>
<P ALIGN=right><B>Name:</B>
</TD>
<TD>
<P><INPUT TYPE=text NAME="name" VALUE="" SIZE=15>
</TD></TR>

<TR><TD>
<P ALIGN=right><B>Password:</B>
</TD>
<TD>
<P><INPUT TYPE=password NAME="passwd" VALUE="" SIZE=15>
</TD></TR>

<TR><TD COLSPAN=2>
<CENTER>
<INPUT TYPE=submit VALUE="  OK   ">
</CENTER>
</TD></TR>
</TABLE>
</BODY></HTML>