package desafioPOO.questao3;

import java.util.Scanner;

public class EmpregadoTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos empregados deseja cadastrar? ");
        int qtdEmpregados = entrada.nextInt();

        Empregado[] empregados = new Empregado[qtdEmpregados];

        for (int i = 0; i < qtdEmpregados; i++) {
            System.out.println("Digite o nome do empregado " + (i+1) + ": " );
            String nome = entrada.next();

            System.out.println("Digite o sobrenome do empregado " + (i+1) + ": ");
            String sobrenome = entrada.next();

            System.out.println("Digite o salário do empregado " + (i+1) + ": ");
            double salario = entrada.nextDouble();

            empregados[i] = new Empregado(nome, sobrenome, salario);
        }

        //empregados cadastros no sistema
        for (Empregado empregado : empregados){
            empregado.exibirDados();
        }
        //empregados com aumento de 10% no salário.
        for (Empregado empregado : empregados){
            System.out.println("Qual o aumento de salário do empregado " + empregado.getNome() +
                    " " + empregado.getSobrenome() + ": ");
            double aumento = entrada.nextDouble();
            empregado.aumentarSalario(aumento);
            empregado.exibirDadosComAumento();
        }
        entrada.close();
    }
}
