package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Boolean isRegisterCandidate = true;
    Boolean isRegisterVoter = true;

    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();

    while (isRegisterCandidate) {
      System.out.println("Cadastrar pessoa candidata?\n"
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
      System.out.println("Cadastrar pessoa eleitora?\n"
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

    sc.close();
  }

}
