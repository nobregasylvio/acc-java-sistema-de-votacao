package com.trybe.acc.java.sistemadevotacao;

public class PessoaEleitora extends Pessoa {
	private String cpf;

	public PessoaEleitora(String name, String cpf) {
		super.name = name;
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
}
