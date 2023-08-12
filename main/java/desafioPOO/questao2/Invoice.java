package desafioPOO.questao2;
/* 2) Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de
informática para representar uma fatura de um item vendido na loja. Uma fatura deve incluir
as seguintes informações como atributos:
• o número do item faturado,
• a descrição do item,
• a quantidade comprada do item e
• o preço unitário do item.

Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for
positiva, ela deve ser configurada como 0. Se o preço por item não for positivo ele deve ser
configurado como 0.0. Forneça um método set e um método get para cada variável de
instância. Além disso, forneça um método chamado getInvoiceAmount que calcula o valor da
fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um
double. Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.*/
public class Invoice {
    private int numItemFaturado;
    private String descricaoitem;
    private int qtdComprada;
    private double precoUnitarioItem;

    public Invoice(int numItemFaturado, String descricaoitem, int qtdComprada, double precoUnitarioItem){

        verificarQtdPositiva(qtdComprada);
        verificarPrecoPositivo(precoUnitarioItem);
        this.descricaoitem = descricaoitem;
        this.numItemFaturado = numItemFaturado;
    }
    public double verificarPrecoPositivo(double precoUnitarioItem) {
        if (precoUnitarioItem<0){
            return this.precoUnitarioItem = 0;
        } else {
            return this.precoUnitarioItem = precoUnitarioItem;
        }
    }
    public int verificarQtdPositiva(int qtdComprada){
        if(qtdComprada<0){
           return this.qtdComprada = 0;
        } else {
            return this.qtdComprada = qtdComprada;
        }
    }
    public void exibirInformacoes(){
        System.out.println("O número do item é: " + this.numItemFaturado);
        System.out.println("esse item é: " + this.descricaoitem);
        System.out.println("a quantidade comprada foi: \n" + this.qtdComprada);
        System.out.printf("O preço do item é: %.2f \n", this.precoUnitarioItem);;
        System.out.printf("O valor total da fatura foi: %.2f",getInvoiceAmount());
    }

    public double getInvoiceAmount(){
        return this.precoUnitarioItem * this.qtdComprada;
    }

    public int getNumItemFaturado() {
        return numItemFaturado;
    }

    public void setNumItemFaturado(int numItemFaturado) {
        this.numItemFaturado = numItemFaturado;
    }

    public String getDescricaoitem() {
        return descricaoitem;
    }

    public void setDescricaoitem(String descricaoitem) {
        this.descricaoitem = descricaoitem;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    //colocar o código if em um método e chamar o método.
    public void setQtdComprada(int qtdComprada) {
        verificarQtdPositiva(qtdComprada);
    }

    public double getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        verificarPrecoPositivo(precoUnitarioItem);
    }
}
