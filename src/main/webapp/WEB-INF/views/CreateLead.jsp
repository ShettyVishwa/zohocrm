<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Lead</title>
</head>
<body>
       <h2>Create New Lead | Create</h2>
       <hr>
       
       <form action="saveLead" method="post">
       <table>
       <tr>
       <td>First Name</td>
       <td><input type="text" name="firstName"></td>
       </tr>
       
       <tr>
       <td>Last Name</td>
       <td><input type="text" name="lastName"></td>
       </tr>
       
       <tr>
          <td>Source</td>
		  <td><select name="source">
            <option value="Television">Television</option>
            <option value="News Paper">News Paper</option>
            <option value="Online">Online</option>
            <option value="Radio">Radio</option>
            </select></td>
	   </tr>
	           
       <tr>
       <td>Email</td>
       <td><input type="email" name="email"></td>
       </tr>
       
       <tr>
       <td>Mobile</td>
       <td><input type="text" name="mobile"></td>
       </tr>
       
       <tr>
       <td><input type="submit" value="Save"></td>
       </tr>
       </table>
       </form>
</body>
</html>