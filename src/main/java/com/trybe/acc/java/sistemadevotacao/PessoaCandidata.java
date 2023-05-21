package com.trybe.acc.java.sistemadevotacao;

public class PessoaCandidata {
	private String name;
	private int number;
	private int numberOfVotes;

	public PessoaCandidata(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void oneMoreVote() {
		this.numberOfVotes += 1;
	}

	public int getNumberOfVotes() {
		return numberOfVotes;
	}
}
