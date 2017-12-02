package br.com.projetoendrigo.molde;

import java.util.Scanner;


public class Login {
	
	int tamanhoString;
	
	private String checkUsuario;
	private String checkSenha;
	
	private String[] usuario = new String[3+tamanhoString];
	private String[] senha = new String[3+tamanhoString];
	
	
	Scanner input = new Scanner(System.in);
	

	
	public void criandoUsuario() {
		
		System.out.println("CRIE SEU USUARIO E SENHA");
		System.out.print("Usuario: ");
		this.usuario[tamanhoString] = input.next();
		System.out.print("Senha: ");
		this.senha[tamanhoString] = input.next();
		
		
	}//Fim da classe
	
	public boolean realizandoLogin() {
		int contagem = 0;
		boolean verificando = true;
		
		System.out.print("Usuario: ");
		checkUsuario = input.next();
		System.out.print("Senha: ");
		checkSenha = input.next();
		
		for(int i =0; i <= tamanhoString; i++){
			
			System.out.println("V_checkUsuario: "+checkUsuario);
			System.out.println("V_checkSenha: "+checkSenha);
			
			System.out.println("V_usuario: "+ usuario[i]);
			System.out.println("V_senha: "+ senha[i]);
			if(this.usuario[i] == checkUsuario & this.senha[i] == checkSenha) {
				System.out.println("Entrou no if!");
				contagem ++;
			}else {
				System.out.println("Entrou no else!");
				
			}
			if(contagem > 0) {
				verificando = true;
				} else {
					verificando = false;
				}
			
			
		}//FIm for
		

		
		return verificando;
		
	}


	public int getTamanhoString() {
		return tamanhoString;
	}


	public void setTamanhoString(int tamanhoString) {
		this.tamanhoString = tamanhoString;
	}


	public String getUsuario() {
		String a = usuario[tamanhoString];
		return a;
	}


	public void setUsuario(String[] usuario) {
		this.usuario = usuario;
	}


	public String[] getSenha() {
		return senha;
	}


	public void setSenha(String[] senha) {
		this.senha = senha;
	}


}
