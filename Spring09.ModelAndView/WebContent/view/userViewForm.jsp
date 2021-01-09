<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<form:form action="displayUserInfo" modelAttribute="user">
Name:<form:input path="name"/>
Gender:<form:radiobutton path="gender"/>
Female <form:radiobutton path="gender" value="female"/>
	   <p/>
	   <input type="submit" value="Submit">
</form:form>

</body>
</html>