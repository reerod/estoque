package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.DAO;

@WebServlet(urlPatterns = { "/Controller", "/main" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			menu(request, response);
		}
	}

	// Menu
	protected void menu(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("menu-estoque.jsp");
	}
	
	// Listar materiais
	/*
	 * protected void materiais(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * response.sendRedirect("menu-estoque.jsp"); }
	 */
}
