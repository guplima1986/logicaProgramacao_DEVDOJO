package aulas;

import java.util.Scanner;

public class DiasDaSemana {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor correspondente ao dia da semana:");
        System.out.println("1 = Domingo");
        System.out.println("2 = Segunda");
        System.out.println("3 = Terça");
        System.out.println("4 = Quarta");
        System.out.println("5 = Quinta");
        System.out.println("6 = Sexta");
        System.out.println("7 = Sabado");
        System.out.println("");
        int number = scanner.nextInt();

        System.out.println("USANDO IF ELSE");
        if (number == 1) {
            System.out.println("Domingo");
        } else  if (number == 2) {
            System.out.println("Segunda-feira");
        } else  if (number == 3) {
            System.out.println("Terça-feira");
        } else  if (number == 4) {
            System.out.println("Quarta-feira");
        } else  if (number == 5) {
            System.out.println("Quinta-feira");
        } else  if (number == 6) {
            System.out.println("Sexta-feira");
        } else  if (number == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Número digitado é inválido");
        }
        System.out.println("");

        System.out.println("USANDO SWITCH CASE");

        switch (number){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Número digitado é inválido");
                break;
        }




    }
}
