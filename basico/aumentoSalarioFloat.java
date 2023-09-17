public class MyClass {
    public static void main(String args[]) {
      float salario = 1320.00f;
      float aumento = 25/100f;
      float aumentoRecebido = salario*(aumento);
      float novoSalario = aumentoRecebido+salario;

        System.out.println(novoSalario);
    }
}