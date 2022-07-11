<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Lista de Eleições</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Lista de Eleições</h2>


    <hr>

        <h3>Total de Eleições: ${lista.size()}</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>id</th>
                <th>data</th>
                <th>descrição</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="e" items="${lista}">
                <tr>
                    <td>${e.id}</td>
                    <td>${e.data}</td>
                    <td>${e.descricao}</td>
                    <td><a href="/eleicao/${e.id}/excluir">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        
        <form action="/eleicao" method="get">
       		<button type="submit" class="btn btn-primary">Novo</button>
		</form>	
</div>
</body>
</html>