import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner leitorzinho = new Scanner(System.in);

        System.out.println("Digite a base do triangulo: ");
        int base = leitorzinho.nextInt();

        System.out.println("Digite a altura do triangulo");
        int altura = leitorzinho.nextInt();

        double area = (base*altura)/2.0;

     // float base = 30;
     // float altura = 70;
    //  double area = (base * altura) / 2;


      System.out.println("A área do triangulo é = " + area);
    }
}