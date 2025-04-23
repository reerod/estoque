<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<%
ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("materiais");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<link rel="icon" href="imagens/favicon.png">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
<link rel="stylesheet" href="style.css">
<title>Controle de Estoque</title>
</head>
<body>
	<div class="tabela-container">
		<div class="cabecalho-tabela">
			<h2 class="titulo-tabela">
				<i class="fas fa-clipboard-list"></i> Controle de Estoque
			</h2>
			<div class="campo-pesquisa-wrapper">
				<i class="fas fa-search icone-pesquisa"></i> <input type="text"
					id="pesquisa" placeholder="Pesquisar..." class="campo-pesquisa">
			</div>
		</div>

		<table id="tabela">
			<thead>
				<tr>
					<th>ID</th>
					<th>MATERIAL</th>
					<th>QUANTIDADE</th>
					<th>PESO</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (int i = 0; i < lista.size(); i++) {
				%>
				<tr>
					<td><%=lista.get(i).getIdcon()%></td>
					<td><%=lista.get(i).getNome()%></td>
					<td><%=lista.get(i).getQuantidade()%></td>
					<td><%=lista.get(i).getPeso()%></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
	<script type="text/javascript" src="scripts/pesquisar.js"></script>
</body>
</html>