<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h1>
<a href="${pageContext.request.contextPath }"><img src="${pageContext.request.contextPath}/assets/images/adminlogo.gif">Modeal</a>
</h1>
<ul>
	<c:choose>
		<c:when test="${empty adminUser }">
			<li><a href="${pageContext.request.contextPath }/login">로그인</a></li>
		</c:when>
		<c:otherwise>
			<li style="color: #fff"> 관리자님 반갑습니다.&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/logout">로그아웃</a></li>
		</c:otherwise>
	</c:choose>
</ul>