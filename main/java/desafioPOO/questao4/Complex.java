package desafioPOO.questao4;

/*
4) Cria uma classe chamada Complex para representar números complexos e escreva um
programa para testá-la.
1. Escolha uma representação para os números complexos, usando a forma retangular
ou a forma polar.
2. Forneça três construtores que permitam que objetos dessa classe sejam inicializados
ao serem alocados na memória:
• um construtor sem parâmetros que inicializa o objeto como zero
• um construtor com um parâmetro representando a parte real; a parte
imaginária será zero
• um construtor com dois parâmetros representando as partes real e imaginária
3. Defina operações para obter a parte real, a parte imaginária, o módulo (valor absoluto)
e o ângulo de um número complexo.
4. Forneça a operação para determinar o inverso aditivo de um número complexo.
5. Forneça as operações aritméticas básicas com números complexos: adição, subtração,
multiplicação e divisão.
6. Forneça as operações relacionais que permitem comparar dois números complexos.
7. Defina a operação toString para converter um número complexo em string. Utilize o
formato (a; b), onde a é a parte real e b é a parte imaginária.
8. Escreva um aplicativo de teste que demonstra as capacidades da classe Complex. */

public class Complex {
    private double parteReal, parteImaginaria, modulo;

    public Complex (){

    }

    public Complex (double parteReal){
        this.parteReal = parteReal;
    }
    public Complex(double parteReal, double parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public double moduloComplexo(double parteReal, double parteImaginaria){
        double z = Math.sqrt(Math.pow(parteReal, 2) + Math.pow(parteImaginaria, 2));
        if(z<0){
            setModulo(z*(-1));
        } else {
            setModulo(z);
        }
        return getModulo();
    }

    public double valorAguloSeno(double parteImaginaria){
        double seno = parteImaginaria/modulo;
        double senoRadiano = Math.asin(seno);
        double senoGraus = Math.toDegrees(senoRadiano);

        return senoGraus;
    }
    public double valorAguloCosseno(double parteReal){
        double cosseno = parteReal/modulo;
        double cossenoRadiano = Math.acos(cosseno);
        double cossenoGraus = Math.toDegrees(cossenoRadiano);

        return cossenoGraus;
    }
    public Complex adicao(Complex outro) {
        double novoReal = this.parteReal + outro.parteReal;
        double novoImaginario = this.parteImaginaria + outro.parteImaginaria;
        return new Complex(novoReal, novoImaginario);
    }
    public Complex subtracao(Complex outro) {
        double novoReal = this.parteReal - outro.parteReal;
        double novoImaginario = this.parteImaginaria - outro.parteImaginaria;
        return new Complex(novoReal, novoImaginario);
    }
    public Complex multiplicacao(Complex outro) {
        double novoReal = this.parteReal * outro.parteReal;
        double novoImaginario = this.parteImaginaria * outro.parteImaginaria;
        return new Complex(novoReal, novoImaginario);
    }
    public Complex divisao(Complex outro) {
        double novoReal = this.parteReal / outro.parteReal;
        double novoImaginario = this.parteImaginaria / outro.parteImaginaria;
        return new Complex(novoReal, novoImaginario);
    }
    public Complex inversoAditivo() {
        double novoReal = this.parteReal*(-1);
        double novoImaginario = this.parteImaginaria*(-1);
        return new Complex(novoReal, novoImaginario);
    }
    public Complex compararNumerosComplexos(Complex outro){
        double novoReal = this.parteReal;
        double novoImaginario = this.parteImaginaria;

        if(novoReal == parteReal & novoImaginario == parteImaginaria) {
            System.out.println("Os números complexos são iguais.");
        }
        return new Complex(novoReal, novoImaginario);
    }
    public String toString() {
        if (parteImaginaria>=0){
            return parteReal + " + " + parteImaginaria +"i";
        } else {
            return parteReal + " - " + parteImaginaria +"i";
        }
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    public double getModulo() {
        return modulo;
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
    }
}
