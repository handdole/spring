<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><c:forEach items="${list}" var="dto">
평가번호 : ${dto.id}<br>
평가 내용 : ${dto.content}<br>
작성 일시 : ${dto.date}<br><hr>
</c:forEach>
