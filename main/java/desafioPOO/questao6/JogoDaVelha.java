package desafioPOO.questao6;
/* Escreva um programa completo para jogar o jogo da velha. Para tanto crie uma classe
        JogoDaVelha:
        • a classe deve conter como dados privados um array bidimensional 3x3 para
        representar a grade do jogo crie uma enumeração para representar as possibilidades
        de ocupação de uma casa na grade (vazia, jogador 1 ou jogador 2)
        • o construtor deve inicializar a grade como vazia forneça um método para exibir a
        grade
        • permita dois jogadores humanos
        • forneça um método para jogar o jogo; todo movimento deve ocorrer em uma casa
        vazia; depois de cada movimento, determine se houve uma derrota ou um empate.*/

import java.util.Scanner;

public class JogoDaVelha {
    private enum Casa {
        VAZIA, JOGADOR1, JOGADOR2
    }

    private Casa[][] grade;
    private Casa jogadorAtual;

    public JogoDaVelha() {
        grade = new Casa[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grade[i][j] = Casa.VAZIA;
            }
        }
        jogadorAtual = Casa.JOGADOR1;
    }

    public void exibirGrade() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grade[i][j] == Casa.JOGADOR1) {
                    System.out.print("X");
                } else if (grade[i][j] == Casa.JOGADOR2) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
        System.out.println();
    }

    public boolean verificarVitoria(Casa jogador) {
        for (int i = 0; i < 3; i++) {
            if (grade[i][0] == jogador && grade[i][1] == jogador && grade[i][2] == jogador) {
                return true; // Linhas
            }
            if (grade[0][i] == jogador && grade[1][i] == jogador && grade[2][i] == jogador) {
                return true; // Colunas
            }
        }
        if (grade[0][0] == jogador && grade[1][1] == jogador && grade[2][2] == jogador) {
            return true; // Diagonal principal
        }
        if (grade[0][2] == jogador && grade[1][1] == jogador && grade[2][0] == jogador) {
            return true; // Diagonal secundária
        }
        return false;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            exibirGrade();
            System.out.print("Jogador " + (jogadorAtual == Casa.JOGADOR1 ? "X" : "O") + ": Digite a linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Jogador " + (jogadorAtual == Casa.JOGADOR1 ? "X" : "O") + ": Digite a coluna (0-2): ");
            int coluna = scanner.nextInt();

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && grade[linha][coluna] == Casa.VAZIA) {
                grade[linha][coluna] = jogadorAtual;
                if (verificarVitoria(jogadorAtual)) {
                    exibirGrade();
                    System.out.println("Jogador " + (jogadorAtual == Casa.JOGADOR1 ? "X" : "O") + " venceu!");
                    break;
                } else if (jogadaDisponivel()) {
                    jogadorAtual = (jogadorAtual == Casa.JOGADOR1) ? Casa.JOGADOR2 : Casa.JOGADOR1;
                } else {
                    exibirGrade();
                    System.out.println("Empate!");
                    break;
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private boolean jogadaDisponivel() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grade[i][j] == Casa.VAZIA) {
                    return true;
                }
            }
        }
        return false;
    }
}
