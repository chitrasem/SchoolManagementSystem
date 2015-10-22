<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<html>
<head>

<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
<title>Welcome homePage</title>
</head>
<body>
<div class="success">
        Greeting : ${greeting}
        This is a welcome page.
    </div>
	<div class="">
		<sec:authorize access="hasRole('ADMIN')">
		<div class="success">
			<h1>Only Admin can see this page</h1>
			<a href="<c:url value="/admin" />">To admin page!</a>
		</div>
		</sec:authorize>
	</div>
	<div class="">
		<sec:authorize access="hasRole('ADMIN') and hasRole('DBA')">
		<div class="success">
			<h1>Only DBA can see this page</h1>
			<a href="<c:url value="/db" />">To admin db page</a>
		</div>
		</sec:authorize>
	</div>
</body>
</html>