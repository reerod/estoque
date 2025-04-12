<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" href="imagens/favicon.png">
<link rel="stylesheet" href="style.css">
<title>Controle de Estoque</title>
</head>
<body>
	<div class="container">
		<h1>Adicionar novo material</h1>
		<form name="frmMaterial" action="insert">
			<input type="text" name="nome"
				placeholder="Produto (Ex: Farinha de trigo)" class="Caixa1">
			<div class="linha-menor">
				<input type="text" name="quantidade" placeholder="Quantidade"
					class="Caixa2"> <input type="text" name="peso"
					placeholder="Peso" class="Caixa2">
			</div>
			<input type="button" value="Adicionar" class="Botao1"
				onclick="validar()">
		</form>
	</div>
	<script type="text/javascript" src="scripts/validador.js"></script>
</body>
</html>