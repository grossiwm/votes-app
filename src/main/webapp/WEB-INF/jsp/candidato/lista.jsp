<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Lista de Candidatos</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Lista de Candidatos</h2>


    <hr>

        <h3>Total de Candidatos: ${lista.size()}</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>id</th>
                <th>Número</th>
                <th>Nome</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="e" items="${lista}">
                <tr>
                    <td>${e.id}</td>
                    <td>${e.numero}</td>
                    <td>${e.nome}</td>
                    <td><a href="candidato/${e.id}/excluir">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        
        <form action="/candidato" method="get">
       		<button type="submit" class="btn btn-primary">Novo</button>
		</form>	
</div>
</body>
</html>