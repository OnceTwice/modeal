<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title> 공지사항 페이지 </title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css">
</head>
<body>
	<div id="container">
		<div id="header">
			<img src="${pageContext.request.contextPath}/assets/images/jh.png" width="100px">
			<a href="${pageContext.request.contextPath }" style="color:#fff; text-decoration:none">Junkins</a>
			<c:import url="/WEB-INF/views/includes/header.jsp" />
		</div>
		
		<div id="wrapper">
			<div id="navigation">
				<c:import url="/WEB-INF/views/includes/navigation.jsp" >
					<c:param name="menu" value="notice"/>
				</c:import>
			</div>
		</div>
		
		<div id="content">
			<table class="tbl-ex">
				<tr>
					<th>No</th>
					<th>Category</th>
					<th>Title</th>
					<th>Date</th>
					<th>Del</th>
					<th>&nbsp;</th>
				</tr>
				
				<!-- 출력 빈거임 -->
				<c:forEach items="${map.list }" var="vo" varStatus="status">
					<td>${vo.no }</td>
					<td>${vo.categoryNo }</td>
					<td>${vo.title }</td>
					<td>${vo.regDate }</td>
				</c:forEach>
			</table>
			
			
		</div>
	</div>

	<div id="footer">
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>