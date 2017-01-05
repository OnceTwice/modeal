<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title> 공지사항 글쓰기 페이지 </title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css">
	<link href="${pageContext.request.contextPath }/assets/css/notice.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		<div id="header">
			<c:import url="/WEB-INF/views/includes/header.jsp" />
		</div>
		
		<div id="wrapper">
			<div id="navigation">
				<c:import url="/WEB-INF/views/includes/navigation.jsp" >
					<c:param name="menu" value="notice"/>
				</c:import>
			</div>
		</div>
		
		<div id="content">
			<div id="notice">
			
				<form class="notice-form" enctype="multipart/form-data" method="post" action="upload">
					<table class="tbl-ex">
						<tr>
							<th colspan="2">글쓰기</th>
						</tr>
						<tr>
							<td>
								<div class="dropdown">
						  			<select name="categoryNo">
										<option value="1">Total Notify</option>
										<option value="2">User Notify</option>
										<option value="3">Shop Notify</option>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<td class="label">제목</td>		<!-- class:css, name:parameter값 넘김 -->
							<td><input type="text" name="title" style="width: 450px"></td>
						</tr>
						<tr>
							<td class="label">내용</td>
							<td><textarea name="content" style="width: 450px"></textarea></td>
						</tr>
					</table>

					<div class="bottom">
						<input type="file" name="file">
						<a href="${pageContext.request.contextPath }/notice">Calcel</a>
						<input type="submit" value="Submit">
					</div>
					
				</form>
			</div>
		</div>
	</div>
	
	<div id="footer">
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>