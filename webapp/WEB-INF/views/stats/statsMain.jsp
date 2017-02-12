<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<Link rel="stylesheet" 	href="${pageContext.request.contextPath}/assets/css/main.css">
<Link rel="stylesheet" 	href="${pageContext.request.contextPath}/assets/css/user.css" >
<title>Model Stats </title>
<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/jquery/jquery-1.9.0.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>	
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript" src="plugins/jqplot.pieRenderer.min.js"></script>
<script>
		google.load("visualization", "1", {packages:["corechart"]});
		google.setOnLoadCallback(drawChart);
		function drawChart() {
			var data = new google.visualization.Datatable([
			            ['gender','count'],
						<c:forEach items="${genderlist}" var="genderlist">
			            	["${genderlist.gender}", "${genderlist.count}"]
			            </c:forEach>
			            ]);
			            
			var options = {       
				title: '가입  남 & 여 ?'    
			};     
			
			new google.visualization.PieChart(       
					document.getElementById('my_chart1')).draw(data, options);   

			}
		
		$(function(){
			drawChart();
		});
	</script>
</head>
<body>
	<div id="container">
		<div id="header">
			<c:import url="/WEB-INF/views/includes/header.jsp" />
		</div>
		<div id="wrapper">

			<div id="navigation">
				<c:import url="/WEB-INF/views/includes/navigation.jsp">
				<c:param name="menu" value="user"/>
				</c:import>
			</div>
		</div>
		<div id="content">

			<h2>총 가입자 : <fmt:formatNumber value="${usercount }" pattern="###,###,###"/>명 </h2><br>


				<div id="my_chart1" style="width: 500px; height: 300px"> </div>

			
			<h3>남여 통계</h3>
			<c:forEach items="${genderlist }" var="vo">
				 <tr>
					 <td> ${vo.gender }</td>
					 <td> ${vo.count }</td>
				 </tr>
			</c:forEach>
			<h3>나이별 통계</h3>
			<c:forEach items="${agelist }" var="agevo">
				 <tr>
					 <td> ${agevo.age}</td>
					 <td> ${agevo.count }</td>
				 </tr>
			</c:forEach>
	
		</div>
	</div>


	<div id="footer">
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>