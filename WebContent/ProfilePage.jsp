<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% HttpSession s = request.getSession(false);
  if(s==null){
	  System.out.println("login");
	  out.println("Login First");
		request.getRequestDispatcher("index.jsp").include(request, response);
  }
  else{  
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>create profile</title>
<center>
<h2>Create Your Profile</h2>
</head>
<body>
<table>
<form action="SaveProfileData" method="post">
<tr><td>First Name</td><td><input type="text" name="firstname" required/></td></tr>
<tr><td>Last Name</td><td><input type="text" name="lastname" required/></td></tr>
<tr><td>Permanent Address</td><td><input type="text" name="address" required/></td></tr>
<tr><td>Age</td><td><input type="number" name="age" required/></td></tr>
<tr><td>Contact Number</td><td><input type="number" name="phoneNo" required maxlength="10"/></td></tr>
<tr><td>Email Id</td><td><input type="email" name="email" required/></td></tr>
<tr><td><input type="submit" value="Save"/></td></tr>
</table>
</form>
</center>
</body>
</html>
<% }%>