<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<Link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css"> 
<Link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/shop.css?ver=1" type="text/css">
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>매장리스트</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<h1><img src="${pageContext.request.contextPath}/assets/images/adminlogo.gif" width="50px"><a href="${pageContext.request.contextPath }" style="color: #fff;text-decoration: none">Modeal</a></h1> <!-- 로고와 이름(이름에는 메인으로 가는 링크 연결) -->
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
			<div>
				<!-- 부트스트랩에서 가져온 테이블폼 -->
				<table class="table table-striped table-hover ">
					 <thead>
					    <tr>
					     <th class="short">#</th>
					     <th class="middle">Picture</th>
					     <th class="middle">Name</th>
					     <th class="long">Address</th>
					     <th class="middle">Contact</th>
					     <th class="long">Introduce</th>
					   </tr>
					 </thead>
					 <!-- DB에서 매장 리스트 가져오기!!! -->
					 <!-- controller에서는 list로 받아와서 list2로 이름을 변경 후 사용중-->
					 <c:forEach items="${list }" var="list2" varStatus="no">
					 <tbody>
					   <tr>
					     <td>${no.count }</td> <!-- forEach 태그의 속성으로 ${status.count} <=1부터의 순서 -->
					     <td class="pic"><img src="${pageContext.request.contextPath }/gallery/assets/${list2.picture }"/></td>
					     <td>${list2.name }</td>
					     <td>${list2.address }</td>
					     <td>${list2.phone }</td>
					     <td>${list2.introduce }</td>
					   </tr>
					 </tbody>
					 </c:forEach>
				</table>
			</div>	
		</div>
	</div>
	<div id="footer">
		<!-- footer import -->
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>