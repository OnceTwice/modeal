<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>mysite</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/guestbook.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/jquery/jquery-1.9.0.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	
	<script type="text/javascript" src="https://www.google.com/jsapi"></script>
	<script>
		google.load("visualization", "1", {packages:["corechart"]});
		google.setOnLoadCallback(drawChart);
		function drawChart() {
			var data = google.visualization.arrayToDataTable([
			['Flavour', 'Percent'],
			['Apple', 17.36],
			['Strawberry Rhubarb', 15.62],
			['Pumpkin', 13.63],
			['Cherry', 11.25],
			['Blueberry', 7.53],
			['Lemon Meringue', 6.45],
			['Chocolate', 3.97],
			['Chess', 1.46],
			['Other', 7.09]
			]);
			
			var options = {       
				title: 'What is your favorite pie flavor?'    
			};     
			
			new google.visualization.PieChart(       
				document.getElementById('my_chart1')).draw(data, options);   
			
			new google.visualization.BarChart(       
					document.getElementById('my_chart2')).draw(data, options);
			
			new google.visualization.LineChart(       
					document.getElementById('my_chart3')).draw(data, options);
			}
		
		$(function(){
			drawChart();
		});
	</script>
	
</head>
<body>
	<div id="container">
		<c:import url="/WEB-INF/views/includes/header.jsp" />
		<div id="content">
			<div id="guestbook">
				<div id="my_chart1" style="width: 500px; height: 300px"> </div>
				<div id="my_chart2" style="width: 500px; height: 300px"> </div>
				<div id="my_chart3" style="width: 500px; height: 300px"> </div>
			</div>
		</div>
				<h2> 통계 페이지</h2> 
		<h3>남여 통계</h3>
			<c:forEach items="${genderlist }" var="vo">
				 <tr>
					 <td> ${vo.gender }</td>
					 <td> ${vo.count }</td>
				 </tr>
			</c:forEach>

		<h3>나이별 통계</h3>
			<c:forEach items="${locationlist }" var="vo">
				 <tr>
					 <td> ${vo.gender }</td>
					 <td> ${vo.count }</td>
				 </tr>
			</c:forEach>
			
		<c:import url="/WEB-INF/views/includes/navigation.jsp">
			<c:param name="menu" value="guestbook-ajax"/>
		</c:import>
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>



