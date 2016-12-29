<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<Link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css"> 
<title>매장리스트</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<h1><img src="${pageContext.request.contextPath}/assets/images/jh.png" width="100px"><a href="${pageContext.request.contextPath }" style="color: #fff;text-decoration: none">Junkins</a></h1> <!-- 로고와 이름(이름에는 메인으로 가는 링크 연결) -->
			<!-- header import -->
			<c:import url="/WEB-INF/views/includes/header.jsp" />
		</div>
		<div id="wrapper">

			<div id="navigation">
				<!-- navigation import -->
				<!-- c:param을 통해 값을 import하는 곳으로 넘기면서 selected 선택 (param.menu = shop) -->
				<c:import url="/WEB-INF/views/includes/navigation.jsp" >
					<c:param name="menu" value="shop"/>
				</c:import>
			</div>
		</div>
		<div id="content">
			<c:forEach items="${list }" var="list" varStatus="no">
				<div>
					<div>${no.count }</div>
					<div></div>
				</div>	
			</c:forEach>
		</div>
	</div>
	<div id="footer">
		<!-- footer import -->
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>