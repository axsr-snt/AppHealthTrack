package br.app.fiap.healthtrack.usuario;

import java.util.Scanner;

public class Teste {
	public static void main(String[] Arg) {
	
		
		Scanner leitor = new Scanner(System.in);
		Usuario user = new Usuario();
		Perfil profile = new Perfil();
		PerfilAlimentacao PA = new PerfilAlimentacao();
		PerfilAtividadeFisica PAF = new PerfilAtividadeFisica();  
		String string;
		float varFloat;
		
		
		//CLASSE USUARIO
		
		/*		
		System.out.println("Olá, digite seu nome: ");
		string = leitor.nextLine();
		user.setNomeUsuario(string);
		System.out.println("Bem vindo, " + user.getNomeUsuario());
		
		System.out.println("Digite seu e-mail: ");
		string = leitor.next();
		user.setEmailUsuario(string);
	
		System.out.println("Crie uma senha para acesso: ");
		string = leitor.next();
		user.setSenhaUsuario(string);
		
		System.out.println("Seu e-mail é: " + user.getEmailUsuario() + "\nSua senha é: " + user.getSenhaUsuario());
		 */	

		//CLASSE PERFIL
		
		/*
		System.out.println("Digite sua altura (m): ");
		varFloat = leitor.nextFloat();
		profile.setAltura(varFloat);
		
		System.out.println("Digite seu peso (kg): ");
		varFloat = leitor.nextFloat();
		profile.setPeso(varFloat);
		
		System.out.println("Digite sua pressão arterial: ");
		string = leitor.next();
		
		System.out.println("Sua altura é: " + profile.getAltura() + " m\n" + "Seu peso é: " + profile.getPeso() + " kg\n" + "Sua pressão é: " + profile.getPressaoArterial());
		*/
		
		// CLASSE PERFIL ATIVIDADE FISICA
		
		/*
		System.out.println("Digite a atividade fisica que fará parte do seu perfil: ");
		string =leitor.nextLine();
		PAF.setAtividadeFisca(string);
		
		System.out.println("Digite o tempo de duração para a atividade: " + PAF.getAtividadeFisca());
		varFloat = leitor.nextFloat();
		PAF.setParametro(varFloat);
		
		System.out.println("Você deve realizar a atividade " + PAF.getAtividadeFisca() + " por " + PAF.getParametro() + " minutos");
		*/
		
		// CLASSE PERFIL ALIMENTACAO
		
		/*
		System.out.println("Digite o nutriente para formar seu perfil de alimentação: ");
		string = leitor.nextLine();
		PA.setItemConsumir(string);
		
		System.out.println("Digite a quantidade do item " + PA.getItemConsumir() + " que deverá ser consumida");
		varFloat = leitor.nextFloat();
		PA.setParametro(varFloat);
		
		System.out.println("Você deve consumir " + PA.getParametro() + " gramas do item " + PA.getItemConsumir());
		*/
		
	}
}
