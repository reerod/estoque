package model;

public class JavaBeans {
	private String idcon;
	private String nome;
	private String quantidade;
	private String peso;

	
	// Constructors
	public JavaBeans() {
		super();
	}

	public JavaBeans(String idcon, String nome, String quantidade, String peso) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.quantidade = quantidade;
		this.peso = peso;
	}

	// GETTERS & SETTERS
	public String getIdcon() {
		return idcon;
	}

	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

}
