<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/login.css">
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function () {
	$("button").click(function() {
		$.ajax({
			url : "check.do",
			data : {
				id : $("#id").val(),
				pw : $("#pw").val()
			},
			success : function (result) { //view�Ʒ��� �ִ� jsp������ �������� �޾ƿ´�.
				$("div").append(result + "<br>")
			}
		})
	})
})
</script>
</head>
<body>
<table style="width: 500px; height: 60px;">
	<tr>
		<td>���̵� : </td>
		<td>
		<input type="text" name="id" id="id">
		</td>
	</tr>
	<tr>
		<td>��й�ȣ : </td>
		<td>
		<input type="text" name="pw" id="pw">
		</td>
	</tr>
	<tr>
		<td><button>�α��� Ȯ��</button></td>
	</tr>
</table>
<div></div>
</body>
</html>