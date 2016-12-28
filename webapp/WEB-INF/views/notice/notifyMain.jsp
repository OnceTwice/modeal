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
<title>Insert title here</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<h1><img src="${pageContext.request.contextPath}/assets/images/jh.png" width="100px"><a href="${pageContext.request.contextPath }" style="color: #fff;text-decoration: none">Junkins</a></h1>
			<c:import url="/WEB-INF/views/includes/header.jsp" />
		</div>
		
		<div id="wrapper">

			<div id="navigation">
				<c:import url="/WEB-INF/views/includes/navigation.jsp" >
				<c:param name="menu" value="notify"/>
				</c:import>
			</div>
			
		</div>
		
		<div id="content">
			<p>준킨스 공지사항 창</p>
		</div>
		
		
	</div>


	<div id="footer">
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>