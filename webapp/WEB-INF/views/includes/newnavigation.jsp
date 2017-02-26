<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link
	href="${pageContext.request.contextPath}/assets/css/bootstrap/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/assets/css/bootstrap/metisMenu.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/assets/css/bootstrap/sb-admin-2.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/assets/css/bootstrap/morris.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/assets/css/bootstrap/font-awesome.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/assets/css/bootstrap/custom.css"
	rel="stylesheet">

<nav class="navbar navbar-default navbar-static-top" role="navigation"
	style="margin-bottom: 0">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target=".navbar-collapse">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<c:choose>
			<c:when test="${empty adminUser }">
				<a class="navbar-brand" href="${pageContext.request.contextPath }">Mobility Deal</a>
			</c:when>
			<c:otherwise>
				<a class="navbar-brand" href="${pageContext.request.contextPath }/loginsuccess">Mobility Deal</a>
			</c:otherwise>
		</c:choose>
	</div>

	<!-- /.navbar-header -->
	<ul class="nav navbar-top-links navbar-right">
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
				<i class="fa fa-caret-down"></i>
		</a>
			<ul class="dropdown-menu dropdown-user">
				<c:choose>
					<c:when test="${empty adminUser }">
						<li><a href="${pageContext.request.contextPath }/login">
								<i class="fa fa-sign-out fa-fw"></i>Login
						</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${pageContext.request.contextPath }/logout">
								<i class="fa fa-sign-out fa-fw"></i>Logout
						</a></li>
					</c:otherwise>
				</c:choose>
			</ul> <!-- /.dropdown-user --></li>
		<!-- /.dropdown -->
	</ul>
	<!-- /.navbar-top-links -->

	<div class="navbar-default sidebar" role="navigation">
		<div class="sidebar-nav navbar-collapse">
			<ul class="nav" id="side-menu">
				<li><a href="${pageContext.request.contextPath }/notice">
				<i class="fa fa-dashboard fa-fw"></i>공지사항</a></li>
				
				<li><a href="${pageContext.request.contextPath}/user">
				<i class="fa fa-bar-chart-o fa-fw"></i>사용자리스트</a>
				
				<li><a href="${pageContext.request.contextPath}/shop">
				<i class="fa fa-table fa-fw"></i>매장리스트</a></li>
				
				<li><a href="${pageContext.request.contextPath}/help">
				<i class="fa fa-edit fa-fw"></i>고객센터</a></li>
				
				<%-- <li><a href="${pageContext.request.contextPath}/stats">
				<i class="fa fa-wrench fa-fw"></i>통계</a></li> --%>
			</ul>
		</div>
		<!-- /.sidebar-collapse -->
	</div>
	<!-- /.navbar-static-side -->
</nav>

<!-- jQuery -->
<script
	src="${pageContext.request.contextPath}/assets/js/bootstrap/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script
	src="${pageContext.request.contextPath}/assets/js/bootstrap/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script
	src="${pageContext.request.contextPath}/assets/js/bootstrap/metisMenu.min.js"></script>

<!-- Morris Charts JavaScript -->
<script
	src="${pageContext.request.contextPath}/assets/js/bootstrap/raphael.min.js"></script>
<script
	src="${pageContext.request.contextPath}/assets/js/bootstrap/morris.min.js"></script>
<script
	src="${pageContext.request.contextPath}/assets/js/bootstrap/morris-data.js"></script>

<!-- Custom Theme JavaScript -->
<script
	src="${pageContext.request.contextPath}/assets/js/bootstrap/sb-admin-2.js"></script>