package br.app.fiap.healthtrack.usuario;

/**
 * Classe abstrai o perfil de alimenta��o que o usu�rio deseja ter
 * @author salex
 * @version 1.0
 */
public class PerfilAlimentacao {
	
	/**
	 * Item da dieta que o usu�rio deve consumir
	 */
	private String itemConsumir;
	
	/**
	 * Quantidade que deve ser consumida do item
	 */
	private double parametro;

	/**
	 * M�todo para retornar o item que o usu�rio deve consumir
	 * @return
	 */
	public String getItemConsumir() {
		return itemConsumir;
	}

	/**
	 * M�todo para definir o item que o usu�rio deve consumir
	 * @param itemConsumir
	 */
	public void setItemConsumir(String itemConsumir) {
		this.itemConsumir = itemConsumir;
	}

	/**
	 * M�todo para retornar a quantidade que o usu�rio deve consumir
	 * @return
	 */
	public double getParametro() {
		return parametro;
	}

	/**
	 * M�todo para definir a quantidade que o usu�rio deve consumir
	 * @param parametro
	 */
	public void setParametro(double parametro) {
		this.parametro = parametro;
	}
	
	
	
}
