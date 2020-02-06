<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<style>

.start
{
font-size:30px;
font-weight:bolder;
}


.jumbotron
{
  text-align: center;
}

.jumbotron p
{
margin-bottom:-1em;
margin-top:-2.1em;
font-size:30px;
font-weight:bolder;
text-align: center;

}

.hello
{
font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
  }
  
 .hello th
 {
 padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04a6e2;
  color: white;
 }
 
 .hello tr:nth-child(even){background-color: #f2f2f2;}
 
 .hello tr:hover {background-color: #ddd;}
 
 .hello td,.hello th{
 border: 1px solid #ddd;
  padding: 8px;
}  


.topnav {
  overflow: hidden;
  background-color: #04a6e2;
    color: white;
}

.topnav a {
  float: left;
  margin-left:104em;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}


</style>


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

			<div class="start">
			<img src="https://www.latestlaws.com/media/2019/05/india-logo1.png">
			 <p style="margin-left:22em; margin-top:-1.5em">Ministry Of Social Justice and Empowerment</p>
				</div>
				 
				 <div class="topnav">
				  <a href="/logout-user">Logout</a>
</div>
				
				<div class="jumbotron">
				<h2>All DISTRICTS DATA</h2>
								<marquee direction="right" behavior="alternate" style="font-size:22px; color:#B33028; font-weight:900;" onmouseover="this.stop();" onmouseout="this.start();">District wise no. of students under Post Matric Scholarship Scheme for SC</marquee>
				
				</div>
				
				<div class="table-responsive">
					<table class="hello">
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
							</tr>
						</thead>
						<tbody>
							<c:forEach var="districtWiseDataSC" items="${districtWiseDataSCs}">
								<tr>
									<td>${districtWiseDataSC.id}</td>
									<td>${districtWiseDataSC.districtName}</td>
									<td>${districtWiseDataSC.totalRecord}</td>
									<td>${districtWiseDataSC.totalRecordMale}</td>
									<td>${districtWiseDataSC.totalRecordFemale}</td>
                                    <td>${districtWiseDataSC.totalRecordTransgender}</td>
                                    <td>${districtWiseDataSC.totalRecordFresh}</td>
                                    <td>${districtWiseDataSC.totalRecordRenewal}</td>
                                    <td>${districtWiseDataSC.totalScholarship}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
		

</body>
</html>