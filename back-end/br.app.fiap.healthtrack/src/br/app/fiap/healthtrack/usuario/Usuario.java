package br.app.fiap.healthtrack.usuario;

/**
 * Classe que abstrai o usu�rio
 * @author salex
 * @version 1.0
 */

public class Usuario {
	
	/**
	 * Nome do usu�rio
	 */
	private String nomeUsuario;
	
	/**
	 * E-mail do usu�rio
	 */
	private String emailUsuario;
	
	/**
	 * Senha do usuario
	 */
	private String senhaUsuario;
	
	/**
	 * M�todo para retornar o nome do usu�rio
	 * @return Nome do Usu�rio
	 */
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	/**
	 * M�todo para definir o nome do usu�rio
	 * @param nomeUsuario
	 */
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	/**
	 * M�todo para retornar o e-mail do usu�rio
	 * @return E-mail do Usu�rio
	 */
	public String getEmailUsuario() {
		return emailUsuario;
	}

	/**
	 * M�todo para definir o e-mail do usu�rio
	 * @param emailUsuario
	 */

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	/**
	 * M�todo para retornar a senha do usu�rio
	 * @return Senha do Usu�rio
	 */
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	
	/**
	 * M�todo para definir a senha do usu�rio
	 * @param senhaUsuario
	 */

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}


	/**
	 * Construtor padr�o da classe Usu�rio
	 */
	public Usuario() {
		
	}
	
	/**
	 * Construtor para capturar os dados do usu�rio
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
