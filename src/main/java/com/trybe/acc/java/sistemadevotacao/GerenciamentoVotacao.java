package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

/**
 * Gerenciamento de votação.
 */
public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<String> cpfComputado;

  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<>();
    this.pessoasEleitoras = new ArrayList<>();
    this.cpfComputado = new ArrayList<>();
  }

  /**
   * Método que Cadastra a pessoa Candidata.
   *
   * @param nome   O nome da pessoa candata.
   * @param numero O numero da pessoa candidata.
   */
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

  /**
   * Método que cadastra a pessoa eleitora.
   *
   * @param nome O nome da pessoa eleitora.
   * @param cpf  O cpf da pessoa eleitora.
   */
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

  /**
   * Método para verificar se a pessoa eleitora já votou e realizar a votação.
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (String cpf : cpfComputado) {
      if (cpf.equals(cpfPessoaEleitora)) {
        System.out.println("Pessoa eleitora já votou!");
        return;
      }
    }

    for (PessoaCandidata candidato : pessoasCandidatas) {
      if (candidato.getNumero() == numeroPessoaCandidata) {
        candidato.receberVotos();
        cpfComputado.add(cpfPessoaEleitora);
      }
    }
  }

  public void mostrarResultado() {

  }
}
