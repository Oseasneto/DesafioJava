package desafioJavaBasico;
/* 5) Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM =
R$788,00)*/

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o seu salário: ");
    double salario = entrada.nextDouble();
    double sm = 788.00;

        System.out.printf("Com o salário mínimo no valor de R$788,00 " +
                "você ganha %.2f salários mínimos.", salario/sm);

        entrada.close();
    }
}
