<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Lista de Eleitores</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Lista de Eleitores</h2>


    <hr>

        <h3>Total de Eleitores: ${lista.size()}</h3>

        <table class="table table-striped">
            <thead>
            <tr>
            	<th>Id</th>
                <th>Nome</th>
                <th>Email</th>
                <th>Telefone</th>
                <th>Token</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="m" items="${lista}">
                <tr>
                    <td>${m.id}</td>
                    <td>${m.nome}</td>
                    <td>${m.email}</td>
                    <td>${m.telefone}</td>
                    <td>${m.token}</td>
                    <td><a href="/eleitor/${m.id}/excluir">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        
        <form action="/eleitor" method="get">
       		<button type="submit" class="btn btn-primary">Novo</button>
		</form>	
</div>
</body>
</html>