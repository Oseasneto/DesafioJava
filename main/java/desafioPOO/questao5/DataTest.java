package desafioPOO.questao5;

import java.util.Scanner;

public class DataTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = entrada.nextInt();

        System.out.println("Digite o mês: ");
        int mes = entrada.nextInt();

        System.out.println("Digite o ano: ");
        int ano = entrada.nextInt();

        Data data = new Data(dia, mes, ano);
        System.out.println("a data digitada foi: " + data.toString());

        data.avancarUmDia();
        System.out.println("A data avançando um dia é: "+ data.toString());

        Data data1 = new Data();
        System.out.println("a data atual é: " + data1.toString());

        entrada.close();
    }
}
