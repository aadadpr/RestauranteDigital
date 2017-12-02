package br.com.projetoendrigo.principal;

import java.util.Scanner;

public class Executar {

	public static void main(String[] args) {

		boolean continui = true;
		Scanner scan = new Scanner(System.in);

		System.out.println("iniciando Cadastro ou Login");
		do {

			System.out.println("Qual operação");
			System.out.println("1 - cadastrar\n2 - logar\n3 - sair");
			String inputUser = scan.next();

			if(inputUser.equals("3") || inputUser.equals("sair")){
				break;
			}
			switch (inputUser) {
			case "1":
				System.out.println("entrou com valor 1");
				//cadastrar
				
				
				
				
				
				
				
				break;
			case "2":
				System.out.println(" entrou com valor 2");
				//logar
				
				
				
				
				break;
			default:
				System.out.println("Valor invalido");
				break;
			}

			System.out.println("Deseja finalar o programa ?");
			System.out.println("1 - sim \n2- nao");
			String sair = scan.next();
			if (sair.equals("1") || sair.equals("sim")) {
				continui = false;
			}
		} while (continui);
		System.out.println("finalizando...");
		System.out.println("finalizado");

	}
}
