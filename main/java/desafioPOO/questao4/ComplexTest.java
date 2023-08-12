package desafioPOO.questao4;

import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("qual a parte real: ");
        double real = entrada.nextDouble();

        System.out.println("Qual a parte imaginária: ");
        double imaginario = entrada.nextDouble();

        Complex complexozero = new Complex();
        complexozero.toString();

        Complex complexoApenasReal = new Complex(real);
        complexoApenasReal.toString();

        Complex complexoRealImaginario = new Complex(real, imaginario);
        complexoRealImaginario.toString();

        System.out.println(complexoRealImaginario.moduloComplexo(real, imaginario));
        System.out.println(complexoRealImaginario.valorAguloSeno(imaginario));
        System.out.println(complexoRealImaginario.valorAguloCosseno(real));
        System.out.println(complexoRealImaginario.adicao(complexoRealImaginario));
        System.out.println(complexoRealImaginario.multiplicacao(complexoRealImaginario));
        System.out.println(complexoRealImaginario.subtracao(complexoRealImaginario));
        System.out.println(complexoRealImaginario.divisao(complexoRealImaginario));
        System.out.println(complexoRealImaginario.inversoAditivo());
        System.out.println(complexoRealImaginario.compararNumerosComplexos(complexoRealImaginario));


    }
}
