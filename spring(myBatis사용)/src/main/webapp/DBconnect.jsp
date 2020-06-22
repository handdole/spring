<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String driver = "oracle.jdbc.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "root";
	String password = "1234";
	
	Class.forName(driver);
	out.print("1.드라이버 로딩 성공 ... !! <br>");
	
	Connection con = DriverManager.getConnection(url, user, password);
	out.print("2. DB연결 성공!!<br>");
	
	String sql = "insert into member Values('sol','sol','sol','sol')";
	PreparedStatement ps = con.prepareStatement(sql);
	out.print("3.SQL문 객체화 성공!<br>");
	
	ps.executeUpdate();
	out.print("4. SQL전송 완료<br>");
	
%>
</body>
</html>