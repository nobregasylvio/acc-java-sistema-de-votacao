package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe Principal.
 */
public class Principal {

  /**
   * Método Principal.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Boolean isRegisterCandidate = true;
    Boolean isRegisterVoter = true;
    Boolean isVoter = true;

    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();

    while (isRegisterCandidate) {
      System.out.println("----------- Bem-vindo ao Sistema de Votação -----------\n"
          + "\n"
          + "----------- Cadastre as pessoas candidatas ------------"
          + "\n"
          + "Cadastrar pessoa candidata?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada:");

      short option = sc.nextShort();

      if (option == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = sc.next();

        System.out.println("Entre com o número da pessoa candidata:");
        int numero = sc.nextInt();

        gerenciamento.cadastrarPessoaCandidata(nome, numero);

      } else {
        isRegisterCandidate = false;
      }
    }

    while (isRegisterVoter) {
      System.out.println("----------- Cadastre as pessoas eleitoras -----------"
          + "\n"
          + "Cadastrar pessoa eleitora?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada:");

      short option = sc.nextShort();

      if (option == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = sc.next();

        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = sc.next();

        gerenciamento.cadastrarPessoaEleitora(nome, cpf);

      } else {
        isRegisterVoter = false;
      }

    }

    while (isVoter) {
      System.out.println("----------- Cadastre as pessoas eleitoras -----------\n"
          + "\n"
          + "Entre com o número correspondente à opção desejada:\n"
          + "1 - Votar\n"
          + "2 - Resultado Parcial\n"
          + "3 - Finalizar Votação");

      short option = sc.nextShort();

      if (option == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = sc.next();

        System.out.println("Entre com o número da pessoa candidata:");
        int number = sc.nextInt();

        gerenciamento.votar(cpf, number);
      } else if (option == 2) {
        gerenciamento.mostrarResultado();
      } else {
        gerenciamento.mostrarResultado();
        isVoter = false;
      }

    }

    sc.close();
  }

}
