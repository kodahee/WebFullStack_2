<%@page import="com.lalalala.s1.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String result = (String)request.getAttribute("r");

	MemberDTO memberDTO = (MemberDTO)request.getAttribute("dto");
	/* String id = (String)request.getAttribute("id");
	String pw = (String)request.getAttribute("pw");
	String name = (String)request.getAttribute("name");
	String phone = (String)request.getAttribute("phone");
	String email = (String)request.getAttribute("email"); */
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Member Result Page</h1>
	<h1><%= result %></h1>
	
	<% if(memberDTO != null){ %>
	<h1>ID : <%= memberDTO.getId() %></h1>
	<h1>PW : <%= memberDTO.getPw() %></h1>
	<h1>NAME : <%= memberDTO.getName() %></h1>
	<h1>PHONE : <%= memberDTO.getPhone() %></h1>
	<h1>EMAIL : <%= memberDTO.getEmail() %></h1>
	<%} %>
	
</body>
</html>