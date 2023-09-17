//Faça um programa que cadastre o nome de 5 colegas.

//Versão COM VETOR

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    String[] amiguinhos = new String[5];
    Scanner leia = new Scanner(System.in);

    for(int i = 0; i <5; i++){
        System.out.println("Digite seu nome, amigo: ");
        amiguinhos[i] = leia.nextLine();
    }

    for(int i = 0; i <5; i++){
        System.out.println("Amiguinho = " + amiguinhos[i]);
    }
}
}