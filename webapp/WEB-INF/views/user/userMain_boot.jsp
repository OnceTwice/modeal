<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>사용자리스트</title>
</head>
<body>
	<div id="wrapper">
		<div id="navigation">
			<c:import url="/WEB-INF/views/includes/newnavigation.jsp" />
		</div>
		<div id="page-wrapper">
			<!-- /.row -->
			<div class="row">
				<div class="hc vc">
					<h2>
						총 가입자 :
						<fmt:formatNumber value="${usercount }" pattern="###,###,###" />
						명
					</h2>
					<br>

					<table class="table">
						<thead>
							<tr>
								<th>아이디</th>
								<th>성별</th>
								<th>거주지역</th>
								<th>생년월일</th>
								<th>관리자유무</th>
								<th>매장번호</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${map.list }" var="vo">
								<tr class="usertable" height="20"
									onclick="location.href='${pageContext.request.contextPath }/user/view?no=${vo.no}'">
									<td width="100">${vo.id }</td>
									<td width="100">${vo.gender }</td>
									<td width="400">${vo.location }</td>
									<td width="100">${vo.birth }</td>
									<td width="100">${vo.managerIdentified }</td>
									<td width="100">${vo.shopNo }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>

					<div class="dropdown">
						<ul class="my_ul">
							<li><c:if test="${map.pre_page>map.count_page}">
									<a
										href="${pageContext.request.contextPath }/user?page=${map.before_page}&kwd=${kwd }">◀</a>
								</c:if> <c:forEach begin="${map.pre_page }" end="${map.after_page }"
									var="page">
									<c:choose>
										<c:when test="${page > map.last_page}">
										</c:when>
										<c:otherwise>
											<a
												href="${pageContext.request.contextPath }/user?page=${page}&kwd=${kwd }">${page}</a>
										</c:otherwise>
									</c:choose>
								</c:forEach> <c:if test="${map.after_page<map.last_page }">
									<a
										href="${pageContext.request.contextPath }/user?page=${map.next_page}&kwd=${kwd }">▶</a>
								</c:if></li>
						</ul>
						<form id="search_form" action="" method="get"
							class="navbar-search">
							<select name="filterCheck"
								onChange="redirect(this.options.selectedIndex)"
								class="search-query">
								<option value="1">전체</option>
								<option value="2">ID</option>
								<option value="3">거주지역</option>
							</select> <input type="text" id="kwd" name="kwd" value="" placeholder="검색"
								class="search-query">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>