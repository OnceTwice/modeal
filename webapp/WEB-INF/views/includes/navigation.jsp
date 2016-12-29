<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<ul>
		<c:choose>
			<c:when test="${param.menu == 'notice' }">
				<li class="selected"><a href="${pageContext.request.contextPath}/notice">	공지사항	</a></li>
				<li>				 <a href="${pageContext.request.contextPath}/user">		사용자 리스트	</a></li>
				<li>				 <a href="${pageContext.request.contextPath}/shop">			매장 리스트	</a></li>
				<li>				 <a href="${pageContext.request.contextPath}/help">			고객센터	</a></li>
			</c:when>

			<c:when test="${param.menu == 'user' }">
				<li><a href="${pageContext.request.contextPath}/notice">공지사항</a></li>
				<li class="selected"><a href="${pageContext.request.contextPath}/user">사용자 리스트</a></li>
				<li><a href="${pageContext.request.contextPath}/shop">매장 리스트</a></li>
				<li><a href="${pageContext.request.contextPath}/help">고객센터</a></li>
			</c:when>

			<c:when test="${param.menu == 'shop' }">
				<li><a href="${pageContext.request.contextPath}/notice">공지사항</a></li>
				<li><a href="${pageContext.request.contextPath}/user">사용자 리스트</a></li>
				<li class="selected"><a href="${pageContext.request.contextPath}/shop">매장 리스트</a></li>
				<li><a href="${pageContext.request.contextPath}/help">고객센터</a></li>
			</c:when>

			<c:when test="${param.menu == 'help' }">
				<li><a href="${pageContext.request.contextPath}/notice">공지사항</a></li>
				<li><a href="${pageContext.request.contextPath}/user">사용자 리스트</a></li>
				<li><a href="${pageContext.request.contextPath}/shop">매장 리스트</a></li>
				<li class="selected"><a href="${pageContext.request.contextPath}/help">고객센터</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="${pageContext.request.contextPath}/notice">공지사항</a></li>
				<li><a href="${pageContext.request.contextPath}/user">사용자 리스트</a></li>
				<li><a href="${pageContext.request.contextPath}/shop">매장 리스트</a></li>
				<li><a href="${pageContext.request.contextPath}/help">고객센터</a></li>
			</c:otherwise>
		</c:choose>
	</ul>