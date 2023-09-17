public class MyClass {
    public static void main(String args[]) {
    float peso = 60.0f;
    float altura = 1.56f;
    float IMC = peso/(altura*altura);
    boolean pesoIdeal = (IMC <= 24.0);

    if(pesoIdeal) {
        System.out.println(IMC + " seu peso está ideal");
    } else {
        System.out.println(IMC + " seu peso não está legal");
         }
    }
}