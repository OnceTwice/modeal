<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
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
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Please Sign In</h3>
					</div>
					<div class="panel-body">
						<form role="form" name="loginform" method="post" action="${pageContext.request.contextPath }/loginresult">
							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="Id" name="id"
										type="text" autofocus>
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Password"
										name="password" type="password" value="">
								</div>
								<c:if test="${'fail' == param.result }">
									<p>로그인이 실패 했습니다.</p>
								</c:if>
								<!-- Change this to a button or input when using this as a form -->
								<input type="submit" class="btn btn-lg btn-success btn-block">
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
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
</body>
</html>