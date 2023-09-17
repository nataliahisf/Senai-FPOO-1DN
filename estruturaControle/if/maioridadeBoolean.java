public class MyClass {
    public static void main(String args[]) {
      int idade = 17;

      boolean maiorDeIdade = (idade >= 18);

      if(maiorDeIdade){
          //SEMPRE VERDADEIRO
          System.out.println("É maior de idade");
      } else {
//SEMPRE FALSO
           System.out.println("É menor de idade");
      }
    }
}