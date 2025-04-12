package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/cadastro", "/insert", "/listar" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans material = new JavaBeans();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/cadastro")) {
			cadastroMaterial(request, response);
		} else if (action.equals("/insert")) {
			novoMaterial(request, response);
		} else if(action.equals("/listar")) {
			listaMaterial(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}
	
	// abre a pagina do formulario de cadastro de material
	protected void cadastroMaterial(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("cadastro-material.jsp");
	}

	// Listar materiais
	  protected void listaMaterial(HttpServletRequest request, HttpServletResponse
	  response) throws ServletException, IOException {
		  // criando objeto que irá receber os dados do JavaBeans
		  ArrayList<JavaBeans> lista = dao.listarMateriais();
		  // teste de recebimento da lista
		  for (int i = 0; i < lista.size(); i++) {
			  System.out.println(lista.get(i).getIdcon());
			  System.out.println(lista.get(i).getNome());
			  System.out.println(lista.get(i).getQuantidade());
			  System.out.println(lista.get(i).getPeso());
		  }
		  // Encaminhar a lista ao documento listar-material.jsp [parte 2 da aula]
	  }

	
	// Método para enviar material [botão Adicionar] cadastrado para o JavaBeans
	protected void novoMaterial(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// setar as variaveis JavaBeans
		material.setNome(request.getParameter("nome"));
		material.setQuantidade(request.getParameter("quantidade"));
		material.setPeso(request.getParameter("peso"));
		// invocar o método inserirMaterial passando o  objeto material
		dao.inserirMaterial(material);
		// redirecionar para menu-estoque.html após clicar no botao "Adicionar" do formulario
		response.sendRedirect("menu-estoque.html");
	}

}
