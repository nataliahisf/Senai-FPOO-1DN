public class MyClass {
    public static void main(String args[]) {

    int nota1 = 4;
    int nota2 = 4;

    double media = (nota1 + nota2) / 2;
    System.out.println("Sua média é " + media);

    if(media <= 4){
        System.out.println("Reprovado DIRETO!");
    } else {

          if(media > 4 && media < 5) {
        System.out.println("Recuperação");
    } else {
        System.out.println("Aprovado");
            }
        }
    }
}