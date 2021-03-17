<%@page import="com.lalalala.s1.member.MemberDTO"%>
<%@page import="com.lalalala.s1.member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Login Test JSP Page</h1>
	
	<%
		// java 코드를 먼저 실행하고 html이 출력됨
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		memberDTO.setPw(pw);
		memberDTO = memberDAO.memberLogin(memberDTO);
		
		String result = "로그인 실패";
		
		if(memberDTO != null) {
			result = "로그인 성공";
		}
	%>
	
	<h3><%= id %></h3>
	<h3><%= pw %></h3>
	<h3><%= result %></h3>


</body>
</html>