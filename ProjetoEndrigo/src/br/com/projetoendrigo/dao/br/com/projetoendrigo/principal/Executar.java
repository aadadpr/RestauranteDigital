package br.com.projetoendrigo.principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import br.com.projetoendrigo.dao.FuncionarioDAO;
import br.com.projetoendrigo.dao.PessoaDAO;
import br.com.projetoendrigo.molde.Endereco;
import br.com.projetoendrigo.molde.Funcionario;
import br.com.projetoendrigo.molde.Pessoa;

public class Executar {

	public static void main(String[] args) throws ParseException {

		PessoaDAO pDAO = new PessoaDAO();
		FuncionarioDAO fsDAO = new FuncionarioDAO();

		boolean continui = true;
		Scanner scan = new Scanner(System.in);

		System.out.println("iniciando Cadastro ou Login");
		do {

			System.out.println("Qual operação");
			System.out.println("1 - cadastrar\n2 - logar\n3 - sair");
			String inputUser = scan.next();

			if (inputUser.equals("3") || inputUser.equals("sair")) {
				break;
			}
			switch (inputUser) {
			case "1":
				System.out.println("entrou com valor 1");
				// cadastrar

				System.out.println("Informe o nome: ");
				String nome = scan.next();
				System.out.println("info cpf");
				String cpf;
				System.out.println("Informe o endereco: ");
				Endereco endereco;

				System.out.println("Informe dd/MM/yyyy o : ");
				
				String dtPessoa = scan.next();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Calendar cal = Calendar.getInstance();
				cal.setTime(sdf.parse(dtPessoa));
				

				System.out.println("1 - Pessoa\n2 - Funcionario");
				inputUser = scan.next();
				if (inputUser.equals("1") || inputUser.equals("pessoa")) {
					Pessoa p = new Pessoa();
					p.setNome(nome);
					p.setDtNascimente(cal);
					pDAO.addPessoa(p);
				} else {
					String login;
					String senha;
					Funcionario f = new Funcionario();
					f.setNome(nome);
					System.out.println("Informe o login: ");

					System.out.println("1 - Pessoa\n2 - Funcionario");
					fsDAO.addFuncionario(f);
				}
				break;
			case "2":
				System.out.println(" entrou com valor 2");
				// logar

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
