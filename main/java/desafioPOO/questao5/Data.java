package desafioPOO.questao5;

import java.util.Calendar;
import java.util.Scanner;

/* 5) Crie uma classe para representar datas.
        1. Represente uma data usando três atributos: o dia, o mês, e o ano.
        2. Sua classe deve ter um construtor que inicializa os três atributos e verifica a validade
        dos valores fornecidos.
        3. Forneça um construtor sem parâmetros que inicializa a data com a data atual
        fornecida pelo sistema operacional.
        4. Forneça um método set um get para cada atributo.
        5. Forneça o método toString para retornar uma representação da data como string.
        Considere que a data deve ser formatada mostrando o dia, o mês e o ano separados
        por barra (/).
        6. Forneça uma operação para avançar uma data para o dia seguinte.
        7. Escreva um aplicativo de teste que demonstra as capacidades da classe.
        Garanta que uma instância desta classe sempre esteja em um estado consistente. */
public class Data {
    //para o desafio foi usado padrão ano com 365 dias e o mês com 30.
    private int dia, mes, ano;
    Scanner entrada = new Scanner(System.in);

    public Data (int dia, int mes, int ano) {
        verificarDiaValido(dia);
        verificarMesValido(mes);
        verificarAnoValido(ano);

    }
    public int verificarDiaValido(int dia){
        while (dia < 1 || dia>30){
            System.out.println("Digite um dia válido: ");
            dia = entrada.nextInt();
        }
            return this.dia = dia;
    }
    public int verificarMesValido(int mes){
        while (mes < 1 || mes>12){
            System.out.println("Digite um mês válido: ");
            mes = entrada.nextInt();
        }
        return this.mes = mes;
    }
    public int verificarAnoValido(int ano){
        while (ano < 1){
            System.out.println("Digite um ano válido: ");
            ano = entrada.nextInt();
        }
        return this.ano = ano;
    }
    //construtor que inicializa a data atual fornecida pelo sistema
    public Data() {
        Calendar cal = Calendar.getInstance();
        this.dia = cal.get(Calendar.DAY_OF_MONTH);
        this.mes = cal.get(Calendar.MONTH) + 1; // Mês em Calendar começa em 0
        this.ano = cal.get(Calendar.YEAR);
    }
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    public void avancarUmDia() {
        if(dia>=30){
            if (mes>=12){
                dia =1;
                mes = 1;
                ano++;
            } else {
            dia = 1;
            mes++;
            }
        } else {
            dia++;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
