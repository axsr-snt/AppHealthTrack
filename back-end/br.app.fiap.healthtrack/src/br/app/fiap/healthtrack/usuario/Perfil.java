package br.app.fiap.healthtrack.usuario;

public class Perfil {
	
	/**
	 * Altura do perfil 
	 */
	private float altura;
	
	/**
	 * Peso do perfil
	 */
	private float peso;
	
	/**
	 * Pressão arterial do perfil
	 */
	private String pressaoArterial;
	
	/**
	 * Construtor padrão da classe Perfil
	 */
	public Perfil() {
		
	}
	
	/**
	 * Método para retornar a altura do perfil
	 * @return Altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * Método para definir a altura do perfil
	 * @param altura
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * Método para retornar o peso do perfil
	 * @return Peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * Método para definir o peso do perfil
	 * @param peso
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * Método para retornar a pressão arterial do perfil
	 * @return Pressão Arterial
	 */
	public String getPressaoArterial() {
		return pressaoArterial;
	}

	/**
	 * Método para definir a pressão arterial do perfil
	 * @param pressaoArterial
	 */
	public void setPressaoArterial(String pressaoArterial) {
		this.pressaoArterial = pressaoArterial;
	}
	
	
}
