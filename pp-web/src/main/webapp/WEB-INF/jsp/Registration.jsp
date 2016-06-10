<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<f:form method="post" action="user.do" modelAttribute="Registration">

		<table width="100%" border="0">
			<tr>
				<td><f:errors path="First_name" class="label error-label"></f:errors></br>
					First name&nbsp&nbsp&nbsp<f:input path="First_name"
						placeholder="Please enter your firstname" maxlength="5"
						id="First_name" /></td>
			</tr>

			<tr>

				<td><f:errors path="Last_name" class="label error-label"></f:errors></br>
					Last name&nbsp&nbsp&nbsp<f:input path="Last_name"
						placeholder="Please enter your lastname" maxlength="5"
						id="Last_name" /></td>
			</tr>
			
             
			<tr>

				<td></br>User id&nbsp&nbsp&nbsp&nbsp&nbsp<f:input path="id"
						placeholder="Please enter your id" maxlength="5" id="id" />
				</td>
			</tr>


			<tr>

				<td><f:errors path="Email_id" class="label error-label"></f:errors></br>
					User email&nbsp&nbsp&nbsp <f:input path="Email_id"
						placeholder="Please enter your email" maxlength="50" id="Email_id" /></td>
			</tr>


			<tr>

				<td><f:errors path="Password" class="label error-label"></f:errors></br>
					User Password&nbsp <f:password path="Password"
						placeholder="Please enter your password" maxlength="20"
						id="Password" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Registration" />
			</tr>

		</table>
		
	</f:form>
</body>
</html>