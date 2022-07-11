<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Eleição</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Cadastro de eleição </h2>
    
	  <form action="/eleicao/incluir" method="post">
	    <div class="mb-3 mt-3">
			
	      <label>Descrição:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome" 
	      		name="nome" value="${eleitor.nome}">
	      		
	    </div>


	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>

</div>

</body>
</html>