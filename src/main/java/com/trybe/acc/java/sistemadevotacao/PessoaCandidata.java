package com.trybe.acc.java.sistemadevotacao;

/**
 * Pessoa Candidata.
 */
public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /**
   * Pessoa Candidata.
   *
   * @param nome   nome da pessoa candidata.
   * @param numero numero da pessoa candidata.
   */
  public PessoaCandidata(String nome, int numero) {
    super.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public int getVotos() {
    return votos;
  }

  public void receberVotos() {
    this.votos += 1;
  }
}
