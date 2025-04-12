<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("materiais");
	if (lista != null) {
	    for (int i = 0; i < lista.size(); i++) {
	        out.println(lista.get(i).getIdcon());
	        out.println(lista.get(i).getNome());
	        out.println(lista.get(i).getQuantidade());
	    }
	} else {
	    out.println("Nenhum material encontrado ou lista não carregada.");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" href="imagens/favicon.png">
<title>Controle de Estoque</title>
</head>
<body>

</body>
</html> --%>