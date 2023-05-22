package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao {
	private ArrayList<PessoaCandidata> pessoasCandidatas;
	private ArrayList<PessoaEleitora> pessoasEleitoras;

	public GerenciamentoVotacao() {
		this.pessoasCandidatas = new ArrayList<>();
		this.pessoasEleitoras = new ArrayList<>();
	}

	public void cadastrarPessoaCandidata(String nome, int numero) {
		for (PessoaCandidata pessoa : pessoasCandidatas) {
			if (pessoa.getNome().equals(nome) || pessoa.getNumero() == numero) {
				System.out.println("Número pessoa candidata já utilizado!");
				return;
			}
		}

		PessoaCandidata candidato = new PessoaCandidata(nome, numero);
		pessoasCandidatas.add(candidato);
	}

	public void cadastrarPessoaEleitora(String nome, String cpf) {
		for (PessoaEleitora pessoa : pessoasEleitoras) {
			if (pessoa.getNome().equals(nome) || pessoa.getCpf().equals(cpf)) {
				System.out.println("Pessoa eleitora já cadastrada!");
				return;
			}
		}

		PessoaEleitora candidato = new PessoaEleitora(nome, cpf);
		pessoasEleitoras.add(candidato);
	}

	public void votar(String cpf, int numero) {

	}

	public void mostrarResultado() {

	}
}
