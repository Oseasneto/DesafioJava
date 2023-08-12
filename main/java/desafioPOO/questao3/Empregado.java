package desafioPOO.questao3;

/*
3) A fim de representar empregados em uma firma, crie uma classe chamada Empregado que
inclui as três informações a seguir como atributos:
• um primeiro nome, um sobrenome, e um salário mensal.
Sua classe deve ter um construtor que inicializa os três atributos. Forneça um método set e get
para cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um
aplicativo de teste que demonstra as capacidades da classe. Crie duas instâncias da classe e
exiba o salário anual de cada instância. Então dê a cada empregado um aumento de 10% e
exiba novamente o salário anual de cada empregado. */

public class Empregado {
    private String nome, sobrenome;
    private double salarioMensal;

    public Empregado (String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        verificarSalarioPositivo(salarioMensal);
    }
    public double verificarSalarioPositivo(double salarioMensal){
        if (salarioMensal<0){
           return this.salarioMensal = 0;
        } else {
            return this.salarioMensal = salarioMensal;
        }
    }
    public double salarioAnual(){
        return salarioMensal*12;
    }
    public void exibirDados(){
        System.out.println("O nome do empregado é: " + getNome() + " " + getSobrenome() +
                "\no salário mensal é: " + getSalarioMensal() + "\ne o anual é: " + salarioAnual() );
    }
    public void exibirDadosComAumento(){
        System.out.println("O empregado: " + getNome() + " " + getSobrenome() +
                " recebeu um aumento e seu novo salário mensal é: " + getSalarioMensal() + " e o anual é: " + salarioAnual() );
    }

    public double aumentarSalario(double porcento){
        setSalarioMensal(salarioMensal*((porcento/100)+1));
        return getSalarioMensal();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        verificarSalarioPositivo(salarioMensal);
    }
}
