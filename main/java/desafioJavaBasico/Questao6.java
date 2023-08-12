package desafioJavaBasico;
//6) Desenvolva um programa em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        System.out.println("O número digitado foi " + numero + " o seu antecessor é: "+
                (numero-1) +" e o seu sucessor é: " + (numero+1));

        entrada.close();
    }
}
