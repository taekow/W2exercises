<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<title>Customer Receipt</title>
</head>
<body>
    <h1>Receipt</h1>
    <h2><c:out value="${name}"/></h2>
    <h2><c:out value="${itemName}"/></h2>
    <h2><c:out value="${price}"/></h2>
    <h2><c:out value="${description}"/></h2>
    <h2><c:out value="${vendor}"/></h2>
</body>
</head>