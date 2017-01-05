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
<title>고객센터</title>
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
			<br>
			<h2>총 게시물 : <fmt:formatNumber value="${helpCount }" pattern="###,###,###"/>건 </h2><br>
			
			<!-- 게시판 테이블 설정 -->
			<table class="helptable table">
					<tr>
						<th align="center">번   호</th>
						<th align="center">제   목</th>
						<th align="center">작성일</th>
						<th align="center">글쓴이</th>
					</tr>
				
				<c:forEach items="${list }" var="list2" varStatus="status">
					<!-- 주소창에 ?뒤에 값이 붙어오면 get방식 -->
					<tbody onclick="location.href='${pageContext.request.contextPath }/help/view?no=${list2.no }'">
						<tr>
						<td align="center" width="100">${list2.no}</td>
						<td align="center" width="400">${list2.title }</td>
						<td align="center" width="100">${list2.regDate}</td>
						<td align="center" width="100">${list2.usersNo }</td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
			
			<!-- 카테고리 & 검색창 -->
			<div class="dropdown">
				<form id="search_form" action="" method="get" class="navbar-search">
					<select name="filterCheck" onChange="redirect(this.options.selectedIndex)" class="search-query">
						<option value="1">전체</option>
						<option value="2">제목</option>
						<option value="3">내용</option>
					</select>				
					<input type="text" id="kwd" name="kwd" value="" placeholder="검색" class="search-query" >
					<input type="submit" value="검색" class="bottom">			
				</form>
			</div>
			<br>
		</div>
	</div>
	
	<div id="footer">
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
	
</body>
</html>