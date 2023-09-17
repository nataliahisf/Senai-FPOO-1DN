//Faça um programa que cadastre o nome de 5 colegas.
//Versão SEM VETOR

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    Scanner leia = new Scanner(System.in);

    System.out.println("Digite seu nome, amigo: ");
    String amiguinho1 = leia.nextLine();
        System.out.println("Digite seu nome, amigo: ");
    String amiguinho2 = leia.nextLine();
        System.out.println("Digite seu nome, amigo: ");
    String amiguinho3 = leia.nextLine();
        System.out.println("Digite seu nome, amigo: ");
    String amiguinho4 = leia.nextLine();
        System.out.println("Digite seu nome, amigo: ");
    String amiguinho5 = leia.nextLine();

    System.out.println(amiguinho1);
    System.out.println(amiguinho2);
    System.out.println(amiguinho3);
    System.out.println(amiguinho4);
    System.out.println(amiguinho5);
    }
}