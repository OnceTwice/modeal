<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<form method="post"
					action="${pageContext.request.contextPath }/notice/modify">
					<input type="text" name="no" value="${noticeVo.no }" />

					<table>
						<tr>
							<th>글수정</th>
						</tr>
						<tr>
							<td>제목</td>
							<td><input type="text" name="title"
								value="${noticeVo.title }"></td>
						</tr>
						<tr>
							<td>내용</td>
							<td><textarea rows="10" cols="40" name="content">${noticeVo.content }</textarea>
							</td>
						</tr>
					</table>
					<a href="${pageContext.request.contextPath }/notice">취소</a> <input
						type="submit" value="Submit">
				</form>
			</div>
		</div>
	</div>
	<!-- /.row -->
</body>
</html>