package br.app.fiap.healthtrack.usuario;

/**
 * Classe abstrai o perfil de alimentação que o usuário deseja ter
 * @author salex
 * @version 1.0
 */
public class PerfilAlimentacao {
	
	/**
	 * Item da dieta que o usuário deve consumir
	 */
	private String itemConsumir;
	
	/**
	 * Quantidade que deve ser consumida do item
	 */
	private double parametro;

	/**
	 * Método para retornar o item que o usuário deve consumir
	 * @return
	 */
	public String getItemConsumir() {
		return itemConsumir;
	}

	/**
	 * Método para definir o item que o usuário deve consumir
	 * @param itemConsumir
	 */
	public void setItemConsumir(String itemConsumir) {
		this.itemConsumir = itemConsumir;
	}

	/**
	 * Método para retornar a quantidade que o usuário deve consumir
	 * @return
	 */
	public double getParametro() {
		return parametro;
	}

	/**
	 * Método para definir a quantidade que o usuário deve consumir
	 * @param parametro
	 */
	public void setParametro(double parametro) {
		this.parametro = parametro;
	}
	
	
	
}
