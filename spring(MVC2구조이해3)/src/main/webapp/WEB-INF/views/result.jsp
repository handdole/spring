<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>당신이 등록한 제품</h2>
<ul>
	<li>제품 id : ${productDTO.id}</li>
	<li>제품명 : ${productDTO.name}</li>
	<li>제품 설명 : ${productDTO.content}</li>
	<li>제품 가격 : ${productDTO.price}</li>
</ul>
</body>
</html>