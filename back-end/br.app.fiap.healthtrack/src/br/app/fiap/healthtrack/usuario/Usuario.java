package br.app.fiap.healthtrack.usuario;

/**
 * Classe que abstrai o usuário
 * @author salex
 * @version 1.0
 */

public class Usuario {
	
	/**
	 * Nome do usuário
	 */
	private String nomeUsuario;
	
	/**
	 * E-mail do usuário
	 */
	private String emailUsuario;
	
	/**
	 * Senha do usuario
	 */
	private String senhaUsuario;
	
	/**
	 * Método para retornar o nome do usuário
	 * @return Nome do Usuário
	 */
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	/**
	 * Método para definir o nome do usuário
	 * @param nomeUsuario
	 */
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	/**
	 * Método para retornar o e-mail do usuário
	 * @return E-mail do Usuário
	 */
	public String getEmailUsuario() {
		return emailUsuario;
	}

	/**
	 * Método para definir o e-mail do usuário
	 * @param emailUsuario
	 */

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	/**
	 * Método para retornar a senha do usuário
	 * @return Senha do Usuário
	 */
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	
	/**
	 * Método para definir a senha do usuário
	 * @param senhaUsuario
	 */

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}


	/**
	 * Construtor padrão da classe Usuário
	 */
	public Usuario() {
		
	}
	
	/**
	 * Construtor para capturar os dados do usuário
	 * @param nomeUsuario
	 * @param emailUsuario
	 * @param senhaUsuario
	 */
	public Usuario(String nomeUsuario, String emailUsuario, String senhaUsuario) {
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
	}
	
	
	
}
