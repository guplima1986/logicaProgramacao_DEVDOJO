package aulas;

import java.util.Scanner;

public class Aula32DoWhile {

    public static void main(String[] args) {
        boolean condicao = false;

        do {
            System.out.println("Executado no DO WHILE");
        } while (condicao);

        while (condicao) {
            System.out.println("Executado no WHILE");
        }


        boolean desejaContinuar = true;
        Scanner scanner = new Scanner(System.in);


        do {

            System.out.println("Player 1: Digite um número");
            int num1 = scanner.nextInt();

            System.out.println("Player 1: Digite um número");
            int num2 = scanner.nextInt();

            System.out.println("Acertou ?" + (num1 == num2));

            System.out.println("Deseja jogar novamente?");
            System.out.println("1 - SIM");
            System.out.println("0 - NÃO");
            int opcao = scanner.nextInt();
            if (opcao == 0) {
                desejaContinuar = false;
            }

        } while (desejaContinuar);

    }

}
