package com.trybe.acc.java.sistemadevotacao;

/**
 * Método abstrato de Pessoa.
 */
public abstract class Pessoa {
  protected String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
