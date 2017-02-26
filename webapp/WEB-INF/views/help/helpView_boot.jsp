<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>고객센터</title>
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
					<!-- 뷰 페이지 -->
					<table class="helptable table">
						<tr>
							<!-- tr : 행 나누기 -->
							<th class="short" align="center">작성자</th>
							<!-- th : 필드명(제목) -->
							<td class="middle" align="left">${view.id }</td>
							<!-- td : 데이터(값)-->
						</tr>
						<tr>
							<th class="short" align="center">등록일</th>
							<td class="middle" align="left">${view.regDate }</td>
						</tr>
						<tr>
							<th class="short" align="center">제목</th>
							<td class="middle" align="left">${view.title }</td>
						</tr>
						<tr>
							<th class="short" align="center">내용</th>
							<td class="middle" align="left">${view.complain }</td>
						</tr>
						<tr>
							<!-- c:forEach문(자바의 for문과 같음)으로 돌려준다. -->
							<c:forEach items="${list }" var="vo" varStatus="status">
								<td align="center">${vo.no}</td>
								<td align="center">${vo.title }</td>
								<td align="center">${vo.complain }</td>
								<td align="center">${vo.regDate }</td>
								<td align="center">${vo.usersNo }</td>
							</c:forEach>
						</tr>
					</table>

					<!-- 전체목록 버튼 -->
					<form action="${pageContext.request.contextPath }/help"
						method="get">
						<input type="submit" value="전체목록">
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- /.row -->
</body>
</html>