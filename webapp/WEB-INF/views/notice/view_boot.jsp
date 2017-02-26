<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("newLine", "\n");
%>
<!DOCTYPE html>
<html>
<head>
<title>공지사항</title>
</head>
<body>
	<div id="wrapper">
		<div id="navigation">
			<c:import url="/WEB-INF/views/includes/newnavigation.jsp" />
		</div>
		<div id="page-wrapper">
			<!-- /.row -->
			<div class="row">
				<table class="noticetable table">
					<tr>
						<th class="short" align="center">제목</th>
						<td class="middle" align="left">${noticeVo.title }</td>
					</tr>
					<tr>
						<th class="short" align="center">내용</th>
						<td class="middle" align="left">${fn:replace(noticeVo.content, newLine, "<br>") }</td>
					</tr>
				</table>

				<a href="${pageContext.request.contextPath }/notice">Back to
					List</a> <a
					href="${pageContext.request.contextPath }/notice/modify?no=${noticeVo.no }">Modify</a>
				<a
					href="${pageContext.request.contextPath }/notice/delete?no=${noticeVo.no}">Delete</a>
			</div>
		</div>
	</div>
	<!-- /.row -->
</body>
</html>