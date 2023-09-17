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

    System.out.println("Digite o valor3: ");
    int valor3 = entrada.nextInt();

    if(valor3 > maior) {
        maior = valor3;
    }
    if (valor3 < menor) {
        menor = valor3;
    }

    System.out.println("Digite o valor4: ");
    int valor4 = entrada.nextInt();

    if(valor4 > maior) {
        maior = valor4;
    }
    if (valor4 < menor) {
        menor = valor4;
    }

    System.out.println("Digite o valor5: ");
    int valor5 = entrada.nextInt();

    if(valor5 > maior) {
        maior = valor5;
    }
    if (valor5 < menor) {
        menor = valor5;
    }
        System.out.println("O Maior é " + maior);
        System.out.println("O Menor é " + menor);
    }
}