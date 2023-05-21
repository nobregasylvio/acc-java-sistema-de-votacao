package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Boolean registerCandidate = true;
    Scanner sc = new Scanner(System.in);

    while (registerCandidate) {
      System.out.println("Cadastrar pessoa candidata?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada:");

      short responseRegisterCandidate = sc.nextShort();

      if (responseRegisterCandidate == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String name = sc.next();

        System.out.println("Entre com o número da pessoa candidata:");
        int number = sc.nextInt();

      } else {
        registerCandidate = false;
      }
    }

    sc.close();
  }

}
