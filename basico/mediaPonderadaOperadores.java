public class MyClass {
    public static void main(String args[]) {
      int nota1 = 70;
      int nota2 = 30;
      int nota3 = 70;

      int peso1 = 1;
      int peso2 = 1;
      int peso3 = 10;
      float peso = ((nota1*peso1)*(nota2*peso2)*(nota3*peso3)) / peso1+peso2+peso3;
      boolean passouDeANo = (peso >= 70.0);

      if(passouDeANo){
          System.out.println("Passou de ano!");
      } else {
           System.out.println("Estude mais!");
        }
    }
}