import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite A: ");
    int A = entrada.nextInt();

    System.out.println("Digite B: ");
    int B = entrada.nextInt();

    System.out.println("Digite C: ");
    int C = entrada.nextInt();

    if(C <= B && C < A && B < A) {
        System.out.println("A ordem crescente é " + C + "," + B + "," + A);
        }

    if(B <= C && C < A && B < A) {
        System.out.println("A ordem crescente é " + B + "," + C + "," + A);
        }

    if(A <= C && A < B && C <= B) {
        System.out.println("A ordem crescente é " + A + "," + C + "," + B);
        }

    if(C <= A && A <= B && C < B) {
        System.out.println("A ordem crescente é " + C + "," + A + "," + B);
        }

    if(B < A && A <= C && B < C) {
        System.out.println("A ordem crescente é " + B + "," + A + "," + C);
        }

    if(A < C && A <= B && B <= C) {
        System.out.println("A ordem crescente é " + A + "," + B + "," + C);
        }
    }
}