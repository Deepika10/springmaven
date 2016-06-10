<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="saveUser.do" modelAttribute="Userlogin">
           <c:forEach items="${invalid}" var="refinvalid">
                      
                    </c:forEach>
		<table width="100%" border="0">
			<tr>
				<td>User id<form:input path="id"
						placeholder="Please enter your id" required="autofocus"
						maxlength="5" id="id" />
				</td>
			</tr>
			<tr>
				<td>User email<form:input path="Email_id"
						placeholder="Please enter your email" required="autofocus"
						maxlength="50" id="Email_id" /></td>
			</tr>
			<tr>
				<td>User Password<form:password path="Password"
						placeholder="Please enter your password" required="autofocus"
						maxlength="20" id="Password" /></td>
			</tr>
			<tr><td><input type="submit" value="login"/></td></tr>
			
		</table>
		<h1>${invalid }</h1>
	</form:form>
</body>
</html>