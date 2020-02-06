<%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);
 
 %> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>tecno-tab | home</title>
<title>StateWiseDataSC List</title>

<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">

<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>
<body>

			<div class="jumbotron">
<img src="https://www.latestlaws.com/media/2019/05/india-logo1.png">
        <p style="text-align:center">Ministry Of Social Justice and Empowerment</p>
        </div>
        <div role="navigation">
<div class="navbar navbar-inverse">
			
		
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
				                        <li style="font-size:20px"><a href="/after-login">Home</a></li>
				                        
                                        <li style="font-size:20px;float:left"><a href="/logout-user">Logout</a><li>
				</ul>
			</div>
		</div>
	</div>
        
				<h2 style="text-align:center; margin-top:0em">ALL STATE DATA</h2>
				<marquee direction="right" behavior="alternate" style="font-size:22px; color:#B33028; font-weight:900;" onmouseover="this.stop();" onmouseout="this.start();">State wise no. of students under Post Matric Scholarship Scheme for SC</marquee>
				
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>State Name</th>
								<th>Total Record</th>
								<th>Total Record Male</th>
								<th>Total Record Female</th>
								<th>Total Record Transgender</th>
								<th>Total Record Fresh</th>
								<th>Total Record Renewal</th>
								<th>Total Scholarship</th>
								<th>Is Active</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="stateWiseDataSC" items="${stateWiseDataSCs}">
								<tr>
									<td>${stateWiseDataSC.id}</td>
									<td> <a href="/report-district/${stateWiseDataSC.id}"</a>${stateWiseDataSC.stateName}</a></td>
									<td>${stateWiseDataSC.totalRecord}</td>
									<td>${stateWiseDataSC.totalRecordMale}</td>
									<td>${stateWiseDataSC.totalRecordFemale}</td>
                                    <td>${stateWiseDataSC.totalRecordTransgender}</td>
                                    <td>${stateWiseDataSC.totalRecordFresh}</td>
                                    <td>${stateWiseDataSC.totalRecordRenewal}</td>
                                    <td>${stateWiseDataSC.totalScholarship}</td>
                                    <td>${stateWiseDataSC.isActive}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					</div>
</div>
			

</body>
</html>