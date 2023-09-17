public class MyClass {
    public static void main(String args[]) {
    float peso = 59.3f;
    float altura = 1.56f;
    float IMC = peso/(altura*altura);

      System.out.println("O seu IMC é: " + IMC);
    }
}

//colocamos o f em frente ao valor para que ele considere como float e não como double