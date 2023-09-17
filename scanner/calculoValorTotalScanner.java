//4. Escrever um algoritmo que lê:
//- a porcentagem do IPI a ser acrescido no valor das peças
//- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//- o código da peça 2, valor unitário da peça 2, quantidade de peças

//2 O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

public class MyClass {
    public static void main(String args[]) {

    float porcentagemAPI = x.xf;
    int codPeca1 = x;
    float valorPeca1 = x.xf;
    int qtdPeca1 = x;

    int codPeca2 = x;
    int valorPeca2 = x.xf;
    int qtdPeca2 = x;

    System.out.println("Valor total: " + valorTotal);
    }
}

//----------CORRIGIDO PELO CHATGPT----------

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a porcentagem do IPI a ser acrescido: ");
        float porcentagemIPI = entrada.nextFloat();

        System.out.println("Digite o código da peça 1: ");
        int codPeca1 = entrada.nextInt();

        System.out.println("Digite o valor unitário da peça 1: ");
        float valorPeca1 = entrada.nextFloat();

        System.out.println("Digite a quantidade de peças 1: ");
        int qtdPeca1 = entrada.nextInt();

        System.out.println("Digite o código da peça 2: ");
        int codPeca2 = entrada.nextInt();

        System.out.println("Digite o valor unitário da peça 2: ");
        float valorPeca2 = entrada.nextFloat();

        System.out.println("Digite a quantidade de peças 2: ");
        int qtdPeca2 = entrada.nextInt();

        float valorTotal = (valorPeca1 * qtdPeca1 + valorPeca2 * qtdPeca2) * (porcentagemIPI / 100 + 1);

        System.out.println("Valor total: " + valorTotal);
    }
}
