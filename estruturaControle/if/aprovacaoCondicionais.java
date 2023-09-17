public class MyClass {
    public static void main(String args[]) {
      int n1 = 70;
      int n2 = 30;
      int n3 = 70;
      float media = (n1 + n2 + n3) / 3;
      boolean passouDeANo = (media >= 70.0);

      if(passouDeANo){
          System.out.println("Passou de ano!");
      } else {
           System.out.println("Estude mais!");
        }
    }
}