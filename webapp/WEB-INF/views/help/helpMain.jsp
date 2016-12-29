<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<Link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/main.css">
<title>고객센터</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<h1>
			<img src="${pageContext.request.contextPath}/assets/images/adminlogo.gif" width="50px"><a href="${pageContext.request.contextPath }" style="color: #fff;text-decoration: none">Modeal</a>
			</h1>
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
			
			<!-- 게시판 테이블 설정 -->
			<table class="helptable" width="500" height="200" border="2" bgcolor="ECECEC">
				<colgroup>
					<col width="30" />
					<col width="150" />
					<col width="50" />
					<col width="50" />
				</colgroup>
				
				<thead>
					<tr>
						<th align="center">번   호</th>
						<th align="center">제   목</th>
						<th align="center">등록일</th>
						<th align="center">작성자</th>
					</tr>
				</thead>
				<c:forEach items="${list }" var="list2" varStatus="no">
					<tbody>
						<tr>
						<td align="center">${no.index}</td>
						<td align="center"><a href="helpview.jsp">${list2.title }</a></td>
						<td align="center">${list2.complain }</td>
						<td align="center">${list2.usersNo }</td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
			<br><br>
		</div>
	</div>
	
	<div id="footer">
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
	
</body>
</html>