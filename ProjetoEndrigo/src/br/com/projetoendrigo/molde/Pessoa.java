package br.com.projetoendrigo.molde;

import java.util.Calendar;

public class Pessoa {
	
	private String nome;
	
	private String cpf;
	private Endereco endereco;
	private Calendar dtNascimente;
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the dtNascimente
	 */
	public Calendar getDtNascimente() {
		return dtNascimente;
	}
	/**
	 * @param dtNascimente the dtNascimente to set
	 */
	public void setDtNascimente(Calendar dtNascimente) {
		this.dtNascimente = dtNascimente;
	}
}
