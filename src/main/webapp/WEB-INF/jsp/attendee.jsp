<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="UTF-8">
		<title>Attendee Page</title>
		<style type="text/css">
		
			.errorClass {
				color: #ff0000;
			}
			
			.errorBlock {
				color: #000;
				background-color: #ffEEEE;
				border: 3px solid #ff0000;
				padding: 8px;
				margin: 16px;
			}
					
		</style>
	</head>

	<body>
		
		<form:form commandName="attendee">
		
			<form:errors path="*" cssClass="errorBlock" element="div"/>
		
			<label for="textinput1">Enter name:</label>
			<form:input path="name" cssErrorClass="error"/>
			<form:errors path="name" cssClass="error"/>
			<br/>
			
			<label for="textinput2">Enter email address:</label>
			<form:input path="emailAddress" cssErrorClass="error"/>
			<form:errors path="emailAddress" cssClass="error"/>
			<br/>
			
			<input type="submit" value="Enter Attendee" class="button"/>
			
		</form:form>
		
	</body>
	
</html>