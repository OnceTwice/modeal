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
<title>고객센터 뷰페이지</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<c:import url="/WEB-INF/views/includes/header.jsp" />
		</div>
		<div id="wrapper">
			<div id="navigation">
				<c:import url="/WEB-INF/views/includes/navigation.jsp">
					<c:param name="menu" value="help" />
				</c:import>
			</div>
		</div>
		<div id="content">
		<br>
		<h2 align="right">고객센터 상세페이지</h2>
		<br>
			<!-- 고객센터 상세페이지 -->
			<table class="helptable table">
				<tr>
					<!-- tr : 행 나누기 -->
					<th class="short" align="center">작성자</th>
					<!-- th : 필드명 -->
					<td class="middle" align="left">${view.ID }</td>
					<!-- td : 데이터(값)-->
				</tr>
				<tr>
					<th class="short" align="center">등록일</th>
					<td class="middle" align="left">${view.REGDATE }</td>
				</tr>
				<tr>
					<th class="short" align="center">제목</th>
					<td align="left">${view.TITLE }</td>
				</tr>
				<tr>
					<th class="short" align="center">내용</th>
					<td align="left">${view.COMPLAIN }</td>
				</tr>
				<tr>
					<!-- c:forEach문(자바의 for문과 같음)으로 돌려준다. -->
					<c:forEach items="${list }" var="list2" varStatus="status">
						<td align="center">${list2.no}</td>
						<td align="center">${list2.title }</td>
						<td align="center">${list2.complain }</td>
						<td align="center">${list2.regDate }</td>
						<td align="center">${list2.usersNo }</td>
					</c:forEach>
				</tr>
			</table>
			<!-- 전체목록 버튼 -->
			<form action="${pageContext.request.contextPath }/help" method="get">
				<input type="submit" value="전체목록">
			</form>
		</div>
	</div>
	<div id="footer">
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>