package br.com.projetoendrigo.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.projetoendrigo.molde.Funcionario;
import br.com.projetoendrigo.molde.Pessoa;

/**
 * @author alunofg
 * 
 */
public class FuncionarioDAO {

	List<Funcionario> funcionarios;

	public FuncionarioDAO() {
		this.funcionarios = new ArrayList<>();
	}

	public void addFuncionario(Funcionario f) {
		this.funcionarios.add(f);
	}

	public void removeFuncionario(Funcionario f) {
		this.funcionarios.remove(f);
	}

	public List<Funcionario> listFuncionario() {
		return this.funcionarios;
	}

	public boolean isEmpty() {
		return this.funcionarios.isEmpty();
	}

	public int sizeFuncionario() {
		return this.funcionarios.size();

	}

	public Pessoa getByCpf(String cpf) {
		for (Pessoa pessoa : funcionarios) {
			if (pessoa.getCpf().equals(cpf)) {
				return pessoa;
			}
		}
		return null;
	}
}
