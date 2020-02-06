<!DOCTYPE html >
<%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);
 %> 
  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>tecno-tab | home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">

      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

<div class="jumbotron">
<img src="https://www.latestlaws.com/media/2019/05/india-logo1.png">
        <p style="text-align:center" >Ministry Of Social Justice and Empowerment</p>
</div>


</head>
<body>


<div role="navigation">
<div class="navbar navbar-inverse">
			
		
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					                    <li style="font-size:20px"><a href="/report-state">State Data</a></li>
					                    <li style="font-size:20px"><a href="/links">Report</a></li>
					                    <li style="font-size:20px"><a href="/contact-us">Contact us</a></li>
                                        <li style="font-size:20px"><a href="/logout-user">Logout</a><li>
                                 
				</ul>
			</div>
		</div>
	</div>




	

	<div class="container" id="homediv">
		<div class="jumbotron text-center">
			<h1>Welcome to PMS-DASHBOARD</h1>
			<h3>NIC</h3>
		</div>
	</div>

	
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>