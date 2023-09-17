//Criar 3 vetores onde:
//	O primeiro vetor armazenará o nome do usuário;
//	O segundo a idade;
//	O terceiro o endereço.

//Receber em um laço todos os valores destacados nos itens.
//Após receber todos os itens exibir na tela as informações: Nome, idade e endereço de cada usuário “cadastrado.

//Exemplo:
//1º, João, 18, R. das Rosas;
//2º, Maria, 19, R. das Tulipas;

----------------------------------------VERSÃO QUE PENSEI-----------------------------------------

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        String[] nome = new String[10];
        Scanner entradaNome = new Scanner(System.in);

        int[] idade = new int[10];
        Scanner entradaIdade = new Scanner(System.in);

        String[] endereco = new String[10];
        Scanner entradaEndereco = new Scanner(System.in);

    //for para armazenar
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite seu nome: ");
            nome[i] = entradaNome.nextLine();

            System.out.println("Digite sua idade: ");
            idade[i] = entradaIdade.nextInt();

            System.out.println("Digite sua endereço: ");
            endereco[i] = entradaEndereco.nextLine();
        }

    //precisa do segundo for para imprimir os nomes
        System.out.println("Cadastrados: ");
        for (int i = 0; i < 9; i++) {
            System.out.println(nome[i] + ", " + idade[i] + ", " + endereco[i]);
        }
    }
}

//----------------------------------------VERSÃO REFATORADA PELO GPT-----------------------------
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        final int TAMANHO_ARRAY = 10;
        String[] nome = new String[TAMANHO_ARRAY];
        int[] idade = new int[TAMANHO_ARRAY];
        String[] endereco = new String[TAMANHO_ARRAY];
        Scanner entrada = new Scanner(System.in);

        //for para armazenar
        for (int i = 0; i < TAMANHO_ARRAY; i++) {
            System.out.println("Digite seu nome: ");
            nome[i] = entrada.nextLine();

            System.out.println("Digite sua idade: ");
            idade[i] = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Digite seu endereço: ");
            endereco[i] = entrada.nextLine();
        }

        //for para imprimir os cadastros
        System.out.println("Cadastrados: ");
        for (int i = 0; i < TAMANHO_ARRAY; i++) {
            System.out.println(nome[i] + ", " + idade[i] + ", " + endereco[i]);
        }
    }
}