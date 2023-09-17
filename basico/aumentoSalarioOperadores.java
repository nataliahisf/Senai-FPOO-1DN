public class MyClass {
    public static void main(String args[]) {
      float salario = 1320.00f;
      float aumentoRecebido = salario*25/100f;
      float novoSalario = aumentoRecebido+salario;

        System.out.println("Aumento recebido: " + aumentoRecebido);
        System.out.println("Novo salário com aumento: " + novoSalario);
    }
}