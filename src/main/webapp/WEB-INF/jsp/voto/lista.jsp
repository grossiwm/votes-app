<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Lista de Votos</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Lista de Votos</h2>


    <hr>

        <h3>Total de Votos: ${lista.size()}</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>id</th>
                <th>data</th>
                <th>localizacao</th>
                <th>eleitor</th>
                <th>eleicao</th>
                <th>candidato</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="m" items="${lista}">
                <tr>
                    <td>${m.id}</td>
                    <td>${m.data}</td>
                    <td>${m.localizacao}</td>
                    <td>${m.eleitor.nome}</td>
                    <td>${m.eleicao.descricao}</td>
                    <td>${m.candidato.nome}</td>
                    <td><a href="/voto/${m.id}/excluir">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        
        <form action="/voto" method="get">
       		<button type="submit" class="btn btn-primary">Novo</button>
		</form>	
</div>
</body>
</html>