package aulas;

import java.util.Scanner;

public class Aula30While {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;


        while (escolha != 3) {
            System.out.println("DIGITE A OPÇÃO DESEJADA");
            System.out.println("1. Calular imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");

            escolha = scanner.nextInt();

            if (escolha != 1 && escolha != 2 && escolha != 3) {
                System.out.println("Opção inválida. Tente novamente!");
            }


        }


    }
}
