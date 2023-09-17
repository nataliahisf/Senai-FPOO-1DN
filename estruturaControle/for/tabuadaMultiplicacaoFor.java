//Faça um programa que calcula a tabuada dos números 2 a 9;

public class MyClass {
    public static void main(String args[]) {
      for(int tabuada = 2; tabuada <= 9; tabuada = tabuada + 1){
       for (int cont = 0; cont <= 10; cont = cont + 1) {
        System.out.println(tabuada + " x " + cont + " = " + (tabuada * cont));
        }
      }
    }
}