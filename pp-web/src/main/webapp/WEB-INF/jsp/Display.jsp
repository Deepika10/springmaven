<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%-- <%Object[] row=(Object[])request.getAttribute("name");
    String ID=(String)row[0];
    String Name=(String)row[1];t
    System.out.println(Name);

%>  --%>
<%ArrayList<Object> row=(ArrayList<Object>)request.getAttribute("name");
    
    Iterator i=row.iterator();
    while(i.hasNext())
    {
    	Object[] o=	(Object[] )i.next();
    	System.out.println(o[0]+" "+o[1]);
    	
    }

%> 


<%-- <%= ID %>:<input type="text" ><br>
<%= Name %>:<input type="text" ><br>  --%>


<%-- 

	<f:form>
           
		<table width="100%" border="0">
			<tr>
				<td><%= ID %><f:input path="ID"
						placeholder="Please enter your id" required="autofocus"
						maxlength="5"  />
				</td>
			</tr>
			
			<tr>
				<td><%= Name %><f:password path="Name"
						placeholder="Please enter your password" required="autofocus"
						maxlength="20" id="Password" /></td>
			</tr>
			<tr><td><input type="submit" value="login"/></td></tr>
			
		</table>
		
	</f:form> --%>
</body>
</html>