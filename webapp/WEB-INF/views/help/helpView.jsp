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
			
			<table class="helptable table">
				<tr>
					<th align="left"> 작성자 <input type="text" name="writer" style="width: 200px"></th>				
				</tr>
				<tr>
					<th align="left"> 등록일 </th>
				</tr>
				<tr>
					<th align="left"> 제목 <input type="text" name="title" style="width: 450px"></th>
				</tr>
				<tr>
					<th align="left"> 내용 <textarea name="content" style="width: 450px"></textarea></th>
				</tr>
				<tr>
					<c:forEach items="${list }" var="list2" varStatus="status">
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