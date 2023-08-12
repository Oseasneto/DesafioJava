package desafioJavaBasico;

/* 1) Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dia se
mostre-a expressa em dias.
Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias =
1170 dias.)
*/

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia atual: ");
        int diaAtual = entrada.nextInt();
        while (diaAtual<1 || diaAtual>31){
            System.out.println("Digite um dia Válido: ");
            diaAtual = entrada.nextInt();
        }

        System.out.println("Digite o mês atual (em número): ");
        int mesAtual = entrada.nextInt();
        while (mesAtual<1 || mesAtual>12){
            System.out.println("Digite um mês Válido: ");
            mesAtual = entrada.nextInt();
        }

        System.out.println("Digite o ano de nascimento: ");
        int anoAtual = entrada.nextInt();
        while (anoAtual<1){
            System.out.println("Digite um ano Válido: ");
            anoAtual = entrada.nextInt();
        }

        System.out.println("Digite o dia do seu nascimento: ");
        int diaNasc = entrada.nextInt();
        while (diaNasc<1 || diaNasc>31){
            System.out.println("Digite um dia Válido: ");
            diaNasc = entrada.nextInt();
        }

        System.out.println("Digite o mês do seu nascimento (em número): ");
        int mesNasc = entrada.nextInt();
        while (mesNasc<1 || mesNasc>12){
            System.out.println("Digite um mês Válido: ");
            mesNasc = entrada.nextInt();
        }

        System.out.println("Digite o ano de nascimento: ");
        int anoNasc = entrada.nextInt();
        while (anoNasc<1){
            System.out.println("Digite um ano Válido: ");
            anoNasc = entrada.nextInt();
        }

        int diasTotalAtual = (anoAtual*365) + (mesAtual*30) + diaAtual;
        int diasTotalNasc = (anoNasc*365) + (mesNasc*30) + diaNasc;

        int diasTotais = diasTotalAtual-diasTotalNasc;

        System.out.println("Já se passaram "  + diasTotais + "dias desde a data do seu nascimento.");

        entrada.close();
    }
}

