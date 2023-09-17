//2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.

public class MyClass {
    public static void main(String args[]) {

    int media897 = (8 + 9 + 7)/3;
    int media456 = (4 + 5 + 6)/3;

    float somaDasMedias = (media897 + media456);
    float mediaDasMedias = (media897 + media456)/2.0f;

    System.out.println("A soma das duas médias é " + somaDasMedias);
    System.out.println("A medias das duas médias é " + mediaDasMedias);
    }
}