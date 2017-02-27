<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>${view[0].name }</title>
</head>
<body>
	<div id="wrapper">
		<div id="navigation">
			<c:import url="/WEB-INF/views/includes/newnavigation.jsp" />
		</div>
		<div id="page-wrapper">
			<!-- /.row -->
			<div class="row">
				<br>
				<table class="table table-striped my_table">
					<tr>
						<td rowspan='6'><img src="${view[0].picture }" id="shop_image" alt="이미지엑박" style="padding-right: 20px;"/></td>
						<td class="form">매장명</td>
					</tr>
					<tr>
						<td class="form2">${view[0].name }</td>
					</tr>
					<tr>
						<td class="form">매장 주소</td>
						<td class="form">매장 전화번호</td>
					</tr>
					<tr>
						<td class="form2">${view[0].address }</td>
						<td class="form2">${view[0].phone }</td>
					</tr>
					<tr>
						<td colspan="2" class="form">매장 소개</td>
					</tr>
					<tr>
						<td colspan="2" class="form2">${view[0].introduce }</td>
					</tr>
				</table>
				<!-- 평균평점 구하는 방법 -->
				<c:set var="sum" value="0" />
				<!-- 평점들 리스트에서 평점을 가져와서 합계를 받을 변수 -->
				<!-- for문을 돌면서 평점들을 sum에다가 더함 -->
				<c:forEach items="${view }" var="view2">
					<c:set var="sum" value="${sum + view2.comment[0].grade }" />
				</c:forEach>
				<c:set var="avg" value="${sum/fn:length(view) }" />
				<!-- 평점 총합계를 댓글 갯수로 나누어서 평균을 구함 -->
				<div class="avg form">
					평균 평점 <b class="form2">${avg }</b>
				</div>
				<table class="table table-striped">
					<thead>
						<tr>
							<th class="short">번호</th>
							<th class="short">아이디</th>
							<th class="short">평점</th>
							<th class="long">댓글</th>
						</tr>
					</thead>
					<!-- DB에서 매장 리스트 가져오기!!! -->
					<!-- controller에서는 view로 받아와서 view2로 이름을 변경 후 사용중-->
					<c:forEach items="${view }" var="view2" varStatus="no">
						<tbody>
							<tr>
								<td>${no.count }</td>
								<!-- forEach 태그의 속성으로 ${varStatus.count} <=1부터의 순서 -->
								<td>${view2.users[0].id }</td>
								<td>${view2.comment[0].grade }</td>
								<td>${view2.comment[0].content }</td>
							</tr>
						</tbody>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>