<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Candidato</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Cadastro de Candidatos</h2>

	  <form action="/candidato/incluir" method="post">
	    <div class="mb-3 mt-3">
			
	      <label>Número:</label>
	      <input type="text" class="form-control" placeholder="Entre com o número" 
	      		name="numero" value="${candidato.numero}">
	      		
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome" 
	      		name="nome" value="${candidato.nome}">
	      
	      <label>Telefone:</label>
	      <input type="text" class="form-control" placeholder="Entre com o telefone" 
	      		name="senha" value="${candidato.telefone}">
	    </div>
	    

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
</div>

</body>
</html>