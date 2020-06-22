<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insert2.do">
<table style="width: 500px; height: 60px;">
	<tr>
		<td>제품 id : </td>
		<td>
		<input type="text" name="id">
		</td>
	</tr>
	<tr>
		<td>제품명 : </td>
		<td>
		<input type="text" name="name">
		</td>
	</tr>
	<tr>
		<td>제품 설명 :</td>
		<td>
		<input type="text" name="content">
		</td>
	</tr>
	<tr>
		<td>가격 :</td>
		<td>
		<input type="text" name="price">
		</td>
	</tr>
	<tr>
		<td><button>상품 등록</button></td>
	</tr>
</table>
</form>
</body>
</html>