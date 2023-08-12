package desafioJavaBasico;
//3) Fazer um programa que informa um saldo e imprimir o saldo com reajuste de 1%.

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o seu saldo? ");
        double saldo = entrada.nextDouble();
        double reajuste = 1.01*saldo;

        System.out.println("o saldo informado foi: " + saldo);
        System.out.println("seu saldo com reajuste de 1% é: " + reajuste);

        entrada.close();
    }
}
