<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>공지사항</title>
</head>
<body>
	<div id="wrapper">
		<div id="navigation">
			<c:import url="/WEB-INF/views/includes/newnavigation.jsp" />
		</div>
		
		<div id="page-wrapper">
			<!-- /.row -->
			<div class="row">
				<h2>글쓰기</h2>
				<div id="notice">
				
					<form class="notice-form" enctype="multipart/form-data" method="post" action="upload">
						<table class="tbl-ex">
							<tr>
								<td class="label">유형</td>
								<td>
									<div class="drop" style="margin-bottom:10px;">
										<select name="categoryNo">
											<option value="1">전체 공지</option>
											<option value="2">사용자 공지</option>
											<option value="3">매장 공지</option>
										</select>
									</div>
								</td>
							</tr>
							<tr>
								<td class="label">제목</td>
								<!-- class:css, name:parameter값 넘김 -->
								<td style="padding-bottom: 10px;"><input type="text" name="title" size="68"></td>
							</tr>
							<tr>
								<td class="label">내용</td>
								<td><textarea name="content" rows="5" cols="70"></textarea></td>
							</tr>
						</table>

						<br>

						<div class="bottom" style="margin-left: 33px;">
							<input type="file" name="file" style="margin-right: 160px;">
							<a href="${pageContext.request.contextPath }/notice">취소</a>
							<input type="submit" value="등록">
						</div>
					</form>
					
				</div>
			</div>
		</div>
	</div>
	<!-- /.row -->
</body>
</html>