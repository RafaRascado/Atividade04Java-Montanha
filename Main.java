// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Olá, informe qual foi a primeira nota do aluno: ");
    Scanner primeiraNotaTeclado = new Scanner(System.in);
    float primeiraNota = primeiraNotaTeclado.nextFloat();

    while (primeiraNota < 0 || primeiraNota > 10) {
      System.out.println("Por gentileza, confira se digitou a nota correta");
      Scanner primeiraNotaTecladoNovamente = new Scanner(System.in);
      primeiraNota = primeiraNotaTecladoNovamente.nextFloat();
    }

    System.out.println("Olá, informe qual foi a segunda nota do aluno: ");
    Scanner segundaNotaTeclado = new Scanner(System.in);
    float segundaNota = segundaNotaTeclado.nextFloat();

    while (segundaNota < 0 || segundaNota > 10) {
      System.out.println("Por gentileza, confira se digitou a nota correta");
      Scanner segundaNotaTecladoNovamente = new Scanner(System.in);
      segundaNota = segundaNotaTecladoNovamente.nextFloat();
    }

    System.out.println("Olá, informe qual foi a terceira nota do aluno: ");
    Scanner terceiraNotaTeclado = new Scanner(System.in);
    float terceiraNota = terceiraNotaTeclado.nextFloat();

    while (terceiraNota < 0 || terceiraNota > 10) {
      System.out.println("Por gentileza, confira se digitou a nota correta");
      Scanner terceiraNotaTecladoNovamente = new Scanner(System.in);
      terceiraNota = terceiraNotaTecladoNovamente.nextFloat();
    }

    System.out.println("Olá, informe qual foi a quarta nota do aluno: ");
    Scanner quartaNotaTeclado = new Scanner(System.in);
    float quartaNota = quartaNotaTeclado.nextFloat();

    while (quartaNota < 0 || quartaNota > 10) {
      System.out.println("Por gentileza, confira se digitou a nota correta");
      Scanner quartaNotaTecladoNovamente = new Scanner(System.in);
      terceiraNota = quartaNotaTecladoNovamente.nextFloat();
    }

    float media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

    System.out.println("A média do aluno é: " + media);
  }
}