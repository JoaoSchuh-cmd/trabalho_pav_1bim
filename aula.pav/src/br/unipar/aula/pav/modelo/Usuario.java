package br.unipar.aula.pav.modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1;
	
	private Long id;
	private String cadastroUsuario;
	private String nome;
	private String senha;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCadastroUsuario() {
		return cadastroUsuario;
	}
	
	public void setCadastroUsuario(String usuario) {
		this.cadastroUsuario = usuario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
