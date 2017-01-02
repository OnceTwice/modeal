<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<Link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" type="text/css">
<Link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/shop.css?ver=1" type="text/css"> <!-- css 수정해도 안변할때 ?ver=숫자 입력 -->
<!-- 합쳐지고 최소화된 최신 CSS -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css"> -->
<title>매장리스트</title>
</head>
<body>
	<div id="container">
		<div id="header">
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
			<h2>총 매장 : <fmt:formatNumber value="${total }" pattern="###,###,###" /></h2><br> <!-- 총 매장의 수 fmt을 이용해서 패턴을 추가했음 백만자리일시 1,000,000 이렇게 됨?! -->
			<div>
				<!-- 부트스트랩에서 가져온 테이블폼 -->
				<table class="table table-striped">
					 <thead>
					    <tr>
					     <th class="short">#</th>
					     <th class="middle">Name</th>
					     <th class="long">Address</th>
					     <th class="middle">Contact</th>
					     <th class="shor">Grade</th>
					   </tr>
					 </thead>
					 <!-- DB에서 매장 리스트 가져오기!!! -->
					 <!-- controller에서는 list로 받아와서 list2로 이름을 변경 후 사용중-->
					 <!-- 테이블에 링크 걸기 onclick="location.href... " -->
					 <c:forEach items="${list }" var="list2" varStatus="no">
					 <tbody onclick="location.href='${pageContext.request.contextPath }/shop/${list2.no }'">
					   <tr>
					     <td>${list2.no }</td> <!-- forEach 태그의 속성으로 ${status.count} <=1부터의 순서 -->
					     <td>${list2.name }</td>
					     <td>${list2.address }</td>
					     <td>${list2.phone }</td>
					     <td>${list2.comment[0] }</td>
					   </tr>
					 </tbody>
					 </c:forEach>
				</table>
				<!-- 부트스트랩에서 가져온 검색창 -->
				<form class="navbar-search" action="${pageContext.request.contextPath }/shop" method="get">
					<input type="text" class="search-query" placeholder="검색" name="keyword">
				</form>
				◀ 1 2 3 4 5 ▶
			</div>	
		</div>
	</div>
	<div id="footer">
		<!-- footer import -->
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>