<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/car.css">
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function () {
	$("#b1").click(function() {
		$.ajax({
			url : "text.mega",
			data : {
				text : $("#text").val()
			},
			success : function (result) { //view아래에 있는 jsp파일의 실행결과를 받아온다.
				$("div").append(result + "<br>")
			}
		})
	})
	$("#b2").click(function() {
		$.ajax({
			url : "img.mega",
			success : function (result) { //view아래에 있는 jsp파일의 실행결과를 받아온다.
				$("div").append(result + "<br>")
			}
		})
	})
})
</script>
</head>
<body>
데이터 : <input type="text" name = "text" id="text">
<button id="b1">텍스트 추가</button>
<button id="b2">이미지 추가</button>
<div></div>
</body>
</html>