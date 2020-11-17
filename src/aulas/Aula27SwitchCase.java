package aulas;

import java.util.Scanner;

public class Aula27SwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de conta desejado:");
        System.out.println("1 - CONTA_POUPANCA");
        System.out.println("2 - CONTA_CORRENTE");
        System.out.println("3 - CONTA_INVESTIMENTO");
        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("0.05%");
                break;
            case 2:
                System.out.println("0.02%");
                break;
            case 3:
                System.out.println("0.1%");
                break;
            default:
                System.out.println("Escolha errada");
                break;
        }

    }
}
