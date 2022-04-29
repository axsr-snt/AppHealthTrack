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
	 * Press�o arterial do perfil
	 */
	private String pressaoArterial;
	
	/**
	 * Construtor padr�o da classe Perfil
	 */
	public Perfil() {
		
	}
	
	/**
	 * M�todo para retornar a altura do perfil
	 * @return Altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * M�todo para definir a altura do perfil
	 * @param altura
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * M�todo para retornar o peso do perfil
	 * @return Peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * M�todo para definir o peso do perfil
	 * @param peso
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * M�todo para retornar a press�o arterial do perfil
	 * @return Press�o Arterial
	 */
	public String getPressaoArterial() {
		return pressaoArterial;
	}

	/**
	 * M�todo para definir a press�o arterial do perfil
	 * @param pressaoArterial
	 */
	public void setPressaoArterial(String pressaoArterial) {
		this.pressaoArterial = pressaoArterial;
	}
	
	
}
