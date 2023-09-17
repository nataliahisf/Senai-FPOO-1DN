//1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
//Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

    //anos = 360 dias
    //mês = 30 dias
    //dias = 1 dia

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

   Scanner entrada = new Scanner(System.in);

    System.out.println("Informe em forma númerica os dados a seguir:");
    System.out.println("Quantos anos você tem? [anos]");
    int anos = entrada.nextInt();

    System.out.println("Há quantos meses você fez aniversário? (considerado 30 dias) [meses]");
    int meses = entrada.nextInt();

    System.out.println("Quantos dias do mês atual se passaram desde o dia em que você faz aniversário? (Ex: aniversário dia 02 e hoje é dia 05, faz 3 dias) [dias]");
    int dias = entrada.nextInt();

    int idadeEmDias = (anos*365) + (meses*30) + (dias);

        System.out.println("A sua idade em dias é de " + idadeEmDias);
    }
}