<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% pageContext.setAttribute( "newLine", "\n" );%>
<!DOCTYPE html>
<html>
<head>
	<title> 공지사항 글보기 페이지 </title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css">
	<link href="${pageContext.request.contextPath }/assets/css/notice.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		<div id="header">
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
			<table class="noticetable table">
				<tr>
					<th class="short"  align="center">제목</th>
					<td class="middle" align="left">${noticeVo.title }</td>
				</tr>
				<tr>
					<th class="short"  align="center">내용</th>
					<td class="middle" align="left">${fn:replace(noticeVo.content, newLine, "<br>") }</td>
				</tr>
			</table>
			
			<a href="${pageContext.request.contextPath }/notice">Back to List</a>
			<a href="${pageContext.request.contextPath }/notice/modify?no=${noticeVo.no }">Modify</a>
			<a href="${pageContext.request.contextPath }/notice/delete?no=${noticeVo.no}">Delete</a>
		</div>
	</div>

	<div id="footer">
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>