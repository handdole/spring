<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		$("#b1").click(function() {
			var comment = $("#co").val();
			var noValue = "13";
			var writerValue = "sol";
			$.ajax({
				url : "commentinsert.do",
				data : {
					num : ${dto.num},
					comment : $("#co").val()
				},
				success : function () { 
				}
			})
			$("#comment").append("no : " +noValue+"<br>");
			$("#comment").append("댓글 내용 : " +comment+"<br>");
			$("#comment").append("작성자 : " +writerValue+"<br><hr>");
		})
	})
</script>
</head>
<body>
검색된 no : ${dto.num}<br>
검색된 title : ${dto.title}<br>
검색된 content : ${dto.content}<br>
검색된 write : ${dto.write}<br>
댓글 : <input type="text" id="co">
<button id="b1" class="btn btn-primary">댓글 달기</button>
<div id="comment">
<hr>
<c:forEach items="${list}" var="dto2">
	검색된 no : ${dto2.id}<br>
	검색된 댓글 내용 : ${dto2.content}<br>
	검색된 작성자 : ${dto2.writer}<br>
	<hr>
</c:forEach>
</div>
</body>
</html>