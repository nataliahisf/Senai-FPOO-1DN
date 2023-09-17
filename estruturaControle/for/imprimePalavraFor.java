//Faça um programa que leia uma palavra qualquer e a imprima 10 vezes;
import java.util.Scanner;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = entrada.nextLine();

        int n = 0;
        for(n = 0; n <= 9; n = n + 1){
            System.out.println(palavra);
        }
    }
}