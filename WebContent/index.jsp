<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Index Page</h1>
	<a href="./member/memberLogin.do">Member Login</a>
	
	<!-- id pw를 프론트에서 입력받아서 백엔드로 -->
	<form action="./sub/loginTest.jsp" method="get">
		<input type="text" name="id">
		<input type="password" name="pw">
		<button>Login</button>
	</form>
	
	<h3><a href="./sub/test.jsp?name=iu&age=20">GO Test</a></h3>

</body>
</html>