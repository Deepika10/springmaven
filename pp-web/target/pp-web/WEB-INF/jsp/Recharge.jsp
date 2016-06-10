<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="dorech.do"
		modelAttribute="Recharge">
		<table width="100%" border="0">
		<tr>
				<td>User id&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="id"
						placeholder="Please enter your mobile number" required="autofocus"
						maxlength="10" id="id" />
				</td>
			</tr>
			<tr>
				<td>Mobile Number&nbsp&nbsp<form:input path="Mobileno"
						placeholder="Please enter your mobile number" required="autofocus"
						maxlength="10" id="Mobileno" />
				</td>
			</tr>
			<tr>
				<td>Service Provider<form:input path="Vendor"
						placeholder="Please enter your service Provider"
						required="autofocus" maxlength="25" id="Vendor" />
				</td>
			</tr>
			<tr>
				<td>Amount&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="Amount"
						placeholder="Please enter recharge amount"
						required="autofocus" maxlength="4" id="Amount" />
				</td>
			</tr>
			
			<tr>
				<td>Date&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<form:input path="Date"
						placeholder="Please enter your mobile number" required="autofocus"
						maxlength="10" id="Date" />
				</td>
			</tr>
			<tr><td><input type="submit" value="Recharge Now!"/></td></tr>
		</table>
		<c:choose>
    <c:when test="${empty list}">
        Sorry!! No details to view.
    </c:when>
    </c:choose>
		<table width="100%">
		
        <tr>
         <th>user id:</th>
          <th>Mobile No:</th>
          <th>Service provider:</th>
            <th>Amount:</th>
            </tr>
            <c:forEach items="${list}" var="recharge">
            <tr>
            <td> <c:out value="${recharge.id}"/></td>
       
            <td><c:out value="${recharge.getMobileno()}"/></td>
           <td>  <c:out value="${recharge.getVendor()}"/></td>
         <td>   <c:out value="${recharge.getAmount()}"/></td>  
        </tr>
    </c:forEach>
		</table>
	</form:form>
</body>
</html>