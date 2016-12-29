<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<Link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/main.css">
<title>User List</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<h1><img src="${pageContext.request.contextPath}/assets/images/adminlogo.gif" width="100px"><a href="${pageContext.request.contextPath }" style="color: #fff;text-decoration: none">Modeal</a></h1>
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

		<h2>총 가입자 : ${usercount } </h2><br>
		
		<table class="usertable">
			<tr>
				<th>아이디</th>
				<th>성별</th>
				<th>거주지역</th>
				<th>생년월일</th>
				<th>관리자유무</th>
				<th>매장번호</th>
			</tr>
			<tr>
				<c:forEach items="${list }" var="vo">
					<td><a href="${pageContext.request.contextPath }/user/{userno}">${vo.id }</a></td>
					<td>${vo.gender }</td>
					<td>${vo.location }</td>
					<td>${vo.birth }</td>
					<td>${vo.managerIdentified }</td>
					<td>${vo.shopNo }</td>
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