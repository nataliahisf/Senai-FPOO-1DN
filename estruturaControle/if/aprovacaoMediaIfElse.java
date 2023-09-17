public class MyClass {
    public static void main(String args[]) {

    int nota1 = 4;
    int nota2 = 4;

    double media = (nota1 + nota2) / 2;
    System.out.println("Sua média é " + media);

    if(media <= 4){
        System.out.println("Aprovado");
    } else {

          if(media >= 5) {
        System.out.println("Aprovado");
    } else {
        System.out.println("Recuperação");
            }
        }
    }
}
