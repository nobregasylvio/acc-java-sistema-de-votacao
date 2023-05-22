package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao {
	private ArrayList<PessoaCandidata> arrayCandidatos;

	public GerenciamentoVotacao() {
		this.arrayCandidatos = new ArrayList<>();
	}

	public void cadastrarPessoaCandidata(String nome, int numero) {
		PessoaCandidata candidato = new PessoaCandidata(nome, numero);
		arrayCandidatos.add(candidato);
	}

	public void cadastrarPessoaEleitora(String nome, String cpf) {

	}

	public void votar(String cpf, int numero) {

	}

	public void mostrarResultado() {

	}
}
