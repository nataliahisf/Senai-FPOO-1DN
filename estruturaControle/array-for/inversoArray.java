//Receber 10 números inteiros do usuário.
//Mostrar os números de forma inversa do inserido.

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

        int[] numeros = new int[10];
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número: ");
            numeros[i] = leia.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}