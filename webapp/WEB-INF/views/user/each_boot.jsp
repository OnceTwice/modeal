<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>사용자리스트</title>
</head>
<body>
	<div id="wrapper">
		<div id="navigation">
			<c:import url="/WEB-INF/views/includes/newnavigation.jsp" />
		</div>
		<div id="page-wrapper">
			<!-- /.row -->
			<div class="row">
				<div class="hc vc">
					<h2>사용자 ID : ${userID }</h2>
					<br>

					<table class=" table">
						<tr>
							<th width="200">매장명</th>
							<th width="700">댓글내용</th>
							<th width="100">평점</th>
						</tr>
						<c:forEach items="${list }" var="vo" varStatus="index">
							<tr>
								<td>${vo.name }</td>
								<td>${vo.content}</td>
								<td>${vo.grade }</td>
							</tr>
						</c:forEach>

					</table>

				</div>
			</div>
		</div>
	</div>
</body>
</html>