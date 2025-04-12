package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	/** Módulo de Conexão **/
	// Parametros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbcontroleEstoque?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "199720123";

	// Metodo de conexão
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/* CRUD CREATE */
	public void inserirMaterial(JavaBeans material) {
		String create = "insert into materiais (nome, quantidade, peso) values " + "(?, ?, ?);";
		try {
			// abrir conexão com o BD
			Connection con = conectar();
			// preparar a query para execução no banco de dados
			PreparedStatement pst = con.prepareStatement(create);
			// subsittuir os parametros (?, ?, ?) pelo conteúdo das variáveis JavaBeans
			pst.setString(1, material.getNome());
			pst.setString(2, material.getQuantidade());
			pst.setString(3, material.getPeso());
			// Executar a query
			pst.executeUpdate();
			// encerrando conexão com o bd
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/* CRUD READ */
	public ArrayList<JavaBeans> listarMateriais() {
		// Criando objeto para acessar a classe JavaBeans
		ArrayList<JavaBeans> materiais = new ArrayList<>();
		String read = "select * from materiais order by nome";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			// o laço abaixo será executado enquanto houver contatos
			while (rs.next()) {
				// variáveis de apoio que recebem os dados do banco
				String idcon = rs.getString(1);
				String nome = rs.getString(2);
				String quantidade = rs.getString(3);
				String peso = rs.getString(4);
				// populando o ArrayList
				materiais.add(new JavaBeans(idcon, nome, quantidade, peso));
			}
			// encerrando conexao com banco
			con.close();
			return materiais;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	// Teste de conexão com o BD
	/*
	 * public void testeConexao() { try { Connection con = conectar();
	 * System.out.println("Conectou com o BD"); con.close(); } catch (Exception e) {
	 * System.out.println(e); } }
	 */
}
