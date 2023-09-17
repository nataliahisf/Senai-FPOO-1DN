// Crie um programa que faça a tabuada de um número digitado pelo usuário

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

    Scanner tabuada = new Scanner(System.in);

    System.out.println("Digite um valor: ");
    int valor = tabuada.nextInt();

      for (int cont = 1; cont <= 10; cont = cont + 1) {
        System.out.println(valor + " x " + cont + " = " + (valor * cont));
      }
    }
}