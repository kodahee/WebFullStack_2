<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Page 1-1</a></li>
						<li><a href="#">Page 1-2</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul></li>
				<li><a href="./bankbook/bankbookList.do">BankBook</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="./member/memberJoin.do"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="./member/memberLogin.do"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h3>Right Aligned Navbar</h3>
		<p>The .navbar-right class is used to right-align navigation bar
			buttons.</p>
	</div>


	<!-- 	<h1>Index Page</h1>
	<a href="./member/memberLogin.do">Member Login</a>
	
	id pw를 프론트에서 입력받아서 백엔드로
	<form action="./member/memberLogin.do" method="get">
		<input type="text" name="id">
		<input type="password" name="pw">
		<button>Login</button>
	</form>
	
	<form action="./member/memberJoin.do" method="get">
		<input type="text" name="id">
		<input type="password" name="pw">
		<input type="text" name="name">
		<input type="text" name="phone">
		<input type="text" name="email">
		<button>Join</button>
	</form>
	
	<h3><a href="./sub/test.jsp?name=iu&age=20">GO Test</a></h3> -->

</body>
</html>