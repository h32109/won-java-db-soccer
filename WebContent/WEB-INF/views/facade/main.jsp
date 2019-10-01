<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../common/head.jsp"></jsp:include>
<div></div><div></div><div></div>
<div></div>
<div class ="container">
<div id = "main_term">Welcome Player!</div>
	<div class = "content">
	<c:choose>
		<c:when test="${page eq 'login'}">
			<jsp:include page="login.jsp"></jsp:include>
		</c:when>
		<c:when test="${page eq 'join'}">
			<jsp:include page="join.jsp"></jsp:include>
		</c:when>
	</c:choose>
	</div>
</div>
<div></div>
<div></div><div></div><div></div>
<jsp:include page="../common/foot.jsp"></jsp:include>