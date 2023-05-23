package com.trybe.acc.java.sistemadevotacao;

/**
 * Pessoa Eleitora.
 */
public class PessoaEleitora extends Pessoa {
  private String cpf;

  /**
   * Pessoa eleitora.
   *
   * @param nome nome da pessoa eleitora.
   * @param cpf  cpf da pessoa eleitora.
   */
  public PessoaEleitora(String nome, String cpf) {
    super.nome = nome;
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}
