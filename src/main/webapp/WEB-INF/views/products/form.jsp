<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Casa do Código</title>
</head>
<body>
	
	<form:form action="${spring:mvcUrl('PC#save').build() }" method="post" commandName="product">
		<div>
			<label for="title">Título</label>
			<form:input path="title" id="title" />
			<form:errors path="title" />
		</div>
		<div>
	        <label for="description">Descrição</label>
			<form:textarea path="description" rows="10" cols="20" id="description"/>
	        <form:errors path="description" />
		</div>
		<div>
			<label for="numberOfPages">Números de Páginas</label>
			<form:input path="numberOfPages" id="numberOfPages" />
	        <form:errors path="numberOfPages" />
		</div>
		<c:forEach items="${types}" var="booktype" varStatus="status">
			<div>
				<label for="price_${booktype}">${booktype}</label>
				<input type="text" name="prices[${status.index}].value" id="prices[${bookType}" />
				<input type="hidden" name="prices[${status.index}].booktype" value="${booktype}"/>
			</div>
		</c:forEach>
		
	
		<div>
			<label for="releaseDate">Data de lançamento</label>
			<form:input path="releaseDate" type="date" id="releaseDate" />
	        <form:errors path="releaseDate" />
		</div>
		
		

		<input type="submit" value="Enviar">
	</form:form>
</body>
</html>