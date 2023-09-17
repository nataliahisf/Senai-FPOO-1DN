//Faça um programa que receba dois valores, sendo que o primeiro deve ser menor que //o segundo. O programa de o que apresentar todos os números ímpares contidos nesta //sequência. (Modulo %. Exemplo: 7%2 = 1)

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    Scanner entrada1 = new Scanner(System.in);
    System.out.print("Digite o valor 1: ");
    int valor1 = entrada1.nextInt();

    Scanner entrada2 = new Scanner(System.in);
    System.out.print("Digite o valor 2: ");
    int valor2 = entrada2.nextInt();

    if(valor1 > valor2){
        System.out.print("O primeiro valor deve ser menor que o segundo.");
        } else {
        System.out.print("Número ");
    }

        for (int x = 0; x < 10; x++)

    valor1
    }
}

//----------CORRIGIDO PELO CHATGPT----------

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        int valor1 = entrada.nextInt();

        System.out.print("Digite o valor 2: ");
        int valor2 = entrada.nextInt();

        if (valor1 > valor2) {
            System.out.print("O primeiro valor deve ser menor que o segundo.");
        } else {
            System.out.print("Números ímpares: ");
            for (int x = valor1; x <= valor2; x++) {
                if (x % 2 != 0) {
                    System.out.print(x + " ");
                }
            }
        }
    }
}