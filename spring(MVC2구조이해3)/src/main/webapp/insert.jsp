<%@page import="com.mega.mvc04.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 클라이언트로부터 받은 데이터를 dto에 넣어두었음. Controller -->
<jsp:useBean id="dto" class="com.mega.mvc04.MemberDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>

<!-- dto의 정보를 dao model을 통해서 db에 저장 처리 Model 사용-->
<%
	MemberDAO dao = new MemberDAO();
	dao.insert(dto);
%>
<!-- 가입한 정보를 출력 View-->
<h2>당신의 가입 정보</h2> 
<hr>
id : <%=dto.getId() %>
pw : <%=dto.getPw() %>
tel : <%=dto.getTel() %>
name : <%=dto.getName() %>

</body>
</html>