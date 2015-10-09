<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
	<head>
		<title>Welcome homePage</title>
	</head>
	<body>
		${message}
		<div>
			<sec:authorize access="hasRole('ADMIN')">
				<h1>Only Admin can see this page</h1>
				<a href="<c:url value="/admin" />">To admin page!</a>
			</sec:authorize>
		</div>
		<div>
			<sec:authorize access="hasRole('ADMIN') and hasRole('DBA')">
				<h1>Only DBA can see this page</h1>
				<a href="<c:url value="/db" />">To admin db page</a>			
			</sec:authorize>
		</div>
	</body>
</html>