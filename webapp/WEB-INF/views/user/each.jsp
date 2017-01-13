<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<Link rel="stylesheet" 	href="${pageContext.request.contextPath}/assets/css/main.css">
<Link rel="stylesheet" 	href="${pageContext.request.contextPath}/assets/css/user.css" >
<title>User List</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<c:import url="/WEB-INF/views/includes/header.jsp" />
		</div>
		<div id="wrapper">

			<div id="navigation">
				<c:import url="/WEB-INF/views/includes/navigation.jsp">
				<c:param name="menu" value="user"/>
				</c:import>
			</div>
		</div>
		<div id="content">

		<h2>사용자 ID : ${userID } </h2><br>

		<table class=" table" >
			<tr>
				<th width="200">매장명</th>
				<th width="700">댓글내용</th>
				<th width="100">평점</th>
			</tr>
				<c:forEach items="${list }" var="vo" varStatus="index">
			<tr>
					<td >${vo.name }</td>
					<td >${vo.content}</td>
					<td >${vo.grade }</td>
			</tr>
				</c:forEach>
			
		
		</table>
		
		
		
		</div>
	</div>


	<div id="footer">
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>