package br.app.fiap.healthtrack.usuario;

/**
 * Classe abstrai o perfil de atividades fisicas que o usu�rio deseja ter
 * @author salex
 * @version 1.0
 */
public class PerfilAtividadeFisica {

	/**
	 * Item atividade f�sica que o usu�rio deve realizar
	 */
	private String atividadeFisca;
	
	/**
	 * Tempo ou series de atividade que o usu�rio deve realizar
	 */
	private double parametro;

	/**
	 * M�todo para retornar a atividade f�sica que o usu�rio deve realizar
	 * @return
	 */
	public String getAtividadeFisca() {
		return atividadeFisca;
	}

	/**
	 * M�todo para definir a atividade f�sica que o usu�rio deve realizar
	 * @param atividadeFisca
	 */
	public void setAtividadeFisca(String atividadeFisca) {
		this.atividadeFisca = atividadeFisca;
	}
	
	/**
	 *  M�todo para retornar tempo ou series de atividade que o usu�rio deve realizar
	 * @return
	 */
	public double getParametro() {
		return parametro;
	}

	/**
	 *  M�todo para definir o tempo ou series de atividade que o usu�rio deve realizar
	 * @param parametro
	 */
	public void setParametro(double parametro) {
		this.parametro = parametro;
	}
	
	
	
}
