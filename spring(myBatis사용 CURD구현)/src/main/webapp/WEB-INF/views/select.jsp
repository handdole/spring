<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url : "commentall.do",
			data : {
				userid : '${dto.id}',
			},
			success : function (result) { 
				$("#d1").append(result);
			}
		})
		$("#b1").click(function() {
			var idValue = "1001"
			var contentValue = $("#co").val();
			var dateValue = null;
			$.ajax({
				url : "commentadd.do",
				data : {
					id : idValue,
					userid : '${dto.id}',
					content : contentValue,
					date : dateValue
				},
				success : function () { 
				}
			})
			location.reload()
		})
		
	})
	
</script>
</head>
<body>
검색된 id : ${dto.id}<br>
평가 : <input type="text" id="co">
<button id="b1" class="btn btn-primary">댓글 달기</button>
<div id="d1">
<hr>
</div>
</body>
</html>