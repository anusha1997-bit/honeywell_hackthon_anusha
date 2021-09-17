<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="request">RquestApi</a>
 <c:forEach items="${categoryList}" var="category">
 	<p><c:out value="${category.name}"/></p>
 		<hr/>
 		<div>
       	<c:forEach items="${category.apiDetails}" var="api">
        	<div>
        		<a href="apiDesc">API Doc</a>
        		<a href="subscribe">Subscribe</a>
        		<ul>
            		<li>Api Name: <c:out value="${api.name}"/></li>
            		<li>Details: <c:out value="${api.details}"/></li>  
            	</ul>
        	</div>
        </div>
    </c:forEach>
    </c:forEach>
</body>
</html>