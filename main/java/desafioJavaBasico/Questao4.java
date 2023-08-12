package desafioJavaBasico;
/* 4) Escrever um programa que lê:
- A porcentagem do IPI a ser acrescido no valor das peças
- O código da peça 1, valor unitário da peça 1, quantidade de peças 1
- O código da peça 2, valor unitário da peça 2, quantidade de peças 2
O programa deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula: (valor1 * quant1 + valor2 * quant2) * (IPI/100 + 1)*/

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o IPI a ser acrescido no valor das peças? ");
        double ipi = entrada.nextDouble();

        System.out.println("Digite o código da peça 1: ");
        int codigoPeca1 = entrada.nextInt();

        System.out.println("Digite o valor unitário da peça 1: ");
        double valorPeca1 = entrada.nextDouble();

        System.out.println("Digite a quantidade de peças 1: ");
        int qtdPecas1 = entrada.nextInt();

        System.out.println("Digite o código da peça 2: ");
        int codigoPeca2 = entrada.nextInt();

        System.out.println("Digite o valor unitário da peça 2: ");
        double valorPeca2 = entrada.nextDouble();

        System.out.println("Digite a quantidade de peças 2: ");
        int qtdPecas2 = entrada.nextInt();

        double total = ((valorPeca1*qtdPecas1) + (valorPeca2*qtdPecas2))*((ipi/100)+1);

        System.out.printf("Valor total a ser pago é R$%.2f ", total);
        entrada.close();
    }
}
