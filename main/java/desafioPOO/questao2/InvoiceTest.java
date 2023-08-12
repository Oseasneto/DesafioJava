package desafioPOO.questao2;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos itens deseja cadastrar? ");
        int qtd = entrada.nextInt();

        Invoice[] invoices = new Invoice[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o número do item faturado: ");
            int numItemFaturado = entrada.nextInt();

            System.out.println("Digite a descrição do item: ");
            String descricaoItem = entrada.next();

            System.out.println("Digite a quantidade de itens: ");
            int qtdComprada = entrada.nextInt();

            System.out.println("Digite o Preço unitário do Item: ");
            double precoUnitarioItem = entrada.nextDouble();

            invoices [i]  = new Invoice(numItemFaturado, descricaoItem, qtdComprada, precoUnitarioItem);
        }

        for (Invoice invoice : invoices){
            invoice.exibirInformacoes();
        }
        entrada.close();
    }
}
