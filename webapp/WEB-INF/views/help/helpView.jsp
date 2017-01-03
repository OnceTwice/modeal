<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<Link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css">
<Link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/help.css">
<title>고객센터 게시물 상세 페이지</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<c:import url="/WEB-INF/views/includes/header.jsp" />
		</div>
		<div id="wrapper">

			<div id="navigation">
				<c:import url="/WEB-INF/views/includes/navigation.jsp" >
				<c:param name="menu" value="help"/>
				</c:import>
			</div>
		</div>
		
		<div id="content">
				
			<table class="helptable table">
		
			<tr>
				<th align="center">번   호</th>
				<th align="center">제   목</th>
				<th align="center">내   용</th>
				<th align="center">등록일</th>
				<th align="center">작성자</th>
			</tr>
			<tr>
				<c:forEach items="${list }" var="list2">
					<td align="center">${list2.no}</td>
					<td align="center">${list2.title }</td>
					<td align="center">${list2.complain }</td>
					<td align="center">${list2.regDate }</td>
					<td align="center">${list2.usersNo }</td>
				</c:forEach>
			</tr>
			</table>	
		</div>	
	</div>
	
	<div id="footer">
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
	
</body>
</html>