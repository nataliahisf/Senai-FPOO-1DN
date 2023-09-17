//3. Informar um saldo e imprimir o saldo com reajuste de 1%.

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe um saldo: ");
    double saldo  = entrada.nextInt();

    double saldoReajuste = saldo+(saldo*0.01);
    System.out.println("O saldo com 1% de reajudeste é " + saldoReajuste);
    }
}