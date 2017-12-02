/**
 * 
 */
package br.com.projetoendrigo.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.projetoendrigo.molde.Pessoa;

/**
 * @author alunofg
 * 
 */
public class PessoaDAO {

	List<Pessoa> users;

	public PessoaDAO() {
		this.users = new ArrayList<>();
	}

	public void addPessoa(Pessoa pessoa) {
		this.users.add(pessoa);
	}

	public void removePessoa(Pessoa pessoa) {
		this.users.remove(pessoa);
	}

	public List<Pessoa> listPessoas() {
		return this.users;
	}

	public boolean isEmpty() {
		return this.users.isEmpty();
	}

	public int sizePessoas() {
		return this.users.size();

	}

	public Pessoa getByCpf(String cpf) {
		for (Pessoa pessoa : users) {
			if (pessoa.getCpf().equals(cpf)) {
				return pessoa;
			}
		}
		return null;
	}
}
