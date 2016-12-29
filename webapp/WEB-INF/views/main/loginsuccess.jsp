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
	
<title>준킨스 입니다</title>
<style>
div {
	position: relative;
}

.hc {
	width: 200px;
	left: 0;
	right: 0;
	margin-left: auto;
	margin-right: auto;
} /* 가로 중앙 정렬 */
.vc {
	height: 400px;
	top: 0;
	bottom: 0;
	margin-top: auto;
	margin-bottom: auto;
} /* 세로 중앙 정렬 */
</style>
</head>
<body>
	<div id="container">
		<div id="header">
			<h1>
				<img src="${pageContext.request.contextPath}/assets/images/adminlogo.gif"
					width="50px"><a href="${pageContext.request.contextPath }"
					style="color: #fff; text-decoration: none">Modeal</a>
			</h1>
			<c:import url="/WEB-INF/views/includes/header.jsp" />
		</div>
		<div id="wrapper">

			<div id="navigation">
				<c:import url="/WEB-INF/views/includes/navigation.jsp" />
			</div>
		</div>
		<div id="content">
			<div class="hc vc">
				<img src="${pageContext.request.contextPath}/assets/images/login.gif" style="height: 300px;" />
				<h1>SUCCESS!</h1>
				<p>
					안녕하세요, 관리자님.<br> 환영합니다.!
				</p>
			</div>
		</div>
	</div>


	<div id="footer">
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>