<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title> 공지사항 페이지 </title>
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
			
			<form action="${pageContext.request.contextPath }/notice">
				<select name="categoryNo">
			 		<option value="4">All</option>
					<option value="1">Total Notify</option>
					<option value="2">User Notify</option>
					<option value="3">Shop Notify</option>
				</select>
				<select name="searchNo">
					<option value="1">All</option>
					<option value="2">Title</option>
					<option value="3">Content</option>
				</select>
				<input type="text" name="kwd" value="${map.keyword }">
				<input type="submit" value="찾기">
			</form>
			
			<a id="new-book" href="${pageContext.request.contextPath }/notice/write">글쓰기</a>
			
			<table class="tbl-ex">
				<tr>
					<th>No</th>
					<th>Category</th>
					<th>Title</th>
					<th>Date</th>
					<th>Del</th>
				</tr>
			
				<c:forEach items="${map.list }" var="vo" varStatus="status">
					<tr>
						<td>${map.totalCount - (map.currentPage - 1)*map.listSize - status.index }</td>
						<td>${vo.category }</td>
						<td><a href="${pageContext.request.contextPath }/notice/view?no=${vo.no}">${vo.title }</a></td>
						<td>${vo.regDate }</td>
						<td><a class="del" href="${pageContext.request.contextPath }/notice/delete?no=${vo.no}">삭제</a></td>
					</tr>
				</c:forEach>
			</table>
			
			<div class="pager">
				<ul>
					<c:if test="${map.prevPage > 0 }" >
						<li><a href="${pageContext.request.contextPath }/notice?categoryNo=${map.categoryNo }&searchNo=${map.searchNo }&kwd=${map.keyword }&p=${map.prevPage }">◀</a></li>
					</c:if>
					
					<c:forEach begin="${map.beginPage }" end="${map.beginPage + map.listSize - 1 }" var="page">
						<c:choose>
							<c:when test="${map.endPage < page }">
								<li>${page }</li>
							</c:when> 
							<c:when test="${map.currentPage == page }">
								<li class="selected">${page }</li>
							</c:when>
							<c:otherwise> 
								<li><a href="${pageContext.request.contextPath }/notice?categoryNo=${map.categoryNo }&searchNo=${map.searchNo }&kwd=${map.keyword }&p=${page }">${page }</a></li>
							</c:otherwise>
						</c:choose>
					</c:forEach>
					
					<c:if test="${map.nextPage > 0 }" >
						<li><a href="${pageContext.request.contextPath }/notice?categoryNo=${map.categoryNo }&searchNo=${map.searchNo }&kwd=${map.keyword }&p=${map.nextPage }">▶</a></li>
					</c:if>	
				</ul>
			</div>
			
			<c:forEach items="${map.list }" var="vo" varStatus="status">
				${vo }
			</c:forEach>
			
		</div>
	</div>

	<div id="footer">
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>