<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Information</title>
</head>
<body>
      <h2>Lead Information | Lead Info</h2>
      <hr>
      
      Lead Id : ${lead.id }<br/>
      First Name : ${lead.firstName }<br/>
      Last Name : ${lead.lastName }<br/>
      Source : ${lead.source }<br/>
      Email : ${lead.email }<br/>
      Mobile : ${lead.mobile }<br/>
      
      <form action="convertLead" method="post">
      <input type="hidden" name="id" value="${lead.id }">
      <input type="submit" value="Convert">
      </form>
</body>
</html>