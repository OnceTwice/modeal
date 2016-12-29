<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style>
  div { position:relative; }
  .hc { width:200px; left:0; right:0; margin-left:auto; margin-right:auto; } /* 가로 중앙 정렬 */
  .vc { height:100px; top: 0; bottom:0; margin-top:auto; margin-bottom:auto; } /* 세로 중앙 정렬 */
</style>

<title>Insert title here</title>
</head>
<body>
	<div class="hc vc">
		<img src="${pageContext.request.contextPath}/assets/images/404.gif"  style="height: 300px;"/>
		<h1>Oooops!</h1>
		<p>
			죄송합니다.<br>
			404 요청 하신 페이지를 찾을 수 없습니다.
		</p>
	</div>
</body>
</html>