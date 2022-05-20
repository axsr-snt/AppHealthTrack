package br.app.fiap.healthtrack.usuario;

/**
 * Classe abstrai o perfil de atividades fisicas que o usuário deseja ter
 * @author salex
 * @version 1.0
 */
public class PerfilAtividadeFisica {

	/**
	 * Item atividade física que o usuário deve realizar
	 */
	private String atividadeFisca;
	
	/**
	 * Tempo ou series de atividade que o usuário deve realizar
	 */
	private double parametro;

	/**
	 * Método para retornar a atividade física que o usuário deve realizar
	 * @return
	 */
	public String getAtividadeFisca() {
		return atividadeFisca;
	}

	/**
	 * Método para definir a atividade física que o usuário deve realizar
	 * @param atividadeFisca
	 */
	public void setAtividadeFisca(String atividadeFisca) {
		this.atividadeFisca = atividadeFisca;
	}
	
	/**
	 *  Método para retornar tempo ou series de atividade que o usuário deve realizar
	 * @return
	 */
	public double getParametro() {
		return parametro;
	}

	/**
	 *  Método para definir o tempo ou series de atividade que o usuário deve realizar
	 * @param parametro
	 */
	public void setParametro(double parametro) {
		this.parametro = parametro;
	}
	
	
	
}
