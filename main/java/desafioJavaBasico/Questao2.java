package desafioJavaBasico;
/* 2) Fazer um programa que imprima a média aritmética dos números8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.*/

public class Questao2 {
    public static void main(String[] args) {

        int media1 = (8+9+7)/3;
        int media2 = (4+5+6)/3;
        double somaMedia = media1+media2;
        double mediaDasMedias = somaMedia/2;

        System.out.println("a média dos números 8, 9, e 7 é: " + media1 );
        System.out.println("A média dos números 4, 5, 6 é: " + media2 );
        System.out.println("A soma das duas médias é: " + somaMedia);
        System.out.printf("A média das médias é %.2f", mediaDasMedias);

    }
}
