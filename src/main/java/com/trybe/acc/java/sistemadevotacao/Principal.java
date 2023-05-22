package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Boolean isRegisterCandidate = true;
    Boolean isRegisterVoter = true;
    Scanner sc = new Scanner(System.in);
    
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
      } else {
        isRegisterVoter = false;
      }

    }

    sc.close();
  }

}
