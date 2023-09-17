import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o valor1: ");
    int valor1 = entrada.nextInt();

    System.out.println("Digite o valor2: ");
    int valor2 = entrada.nextInt();

    int maior = valor1;
    int menor = valor1;

    if(valor2 > maior) {
        maior = valor2;
    }
    if (valor2 < menor) {
        menor = valor2;
        }
    int diferenca = maior - menor;

    System.out.println("A diferença do maior para o menor é " + diferenca);
    }
}