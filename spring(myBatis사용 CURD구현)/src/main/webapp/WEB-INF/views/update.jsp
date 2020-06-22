<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>당신의 UPDATE 정보</h2> 
<hr>
<!-- 표현식(Expression) => 표현언어(Expression Language : EL) -->
<ul>
	<li>id : ${memberDTO.id}</li>
	<li>pw : ${memberDTO.pw}</li>
	<li>name : ${memberDTO.name}</li>
	<li>tel : ${memberDTO.tel}</li>
</ul>
</body>
</html>