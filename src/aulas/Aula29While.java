package aulas;

import java.util.Scanner;

public class Aula29While {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero;
        int repeticao = 0;
        System.out.println("DIGITE UM NÚMERO:");
        numero = leitor.nextInt();

        while (repeticao <= numero) {
            System.out.println(repeticao);
            repeticao = repeticao +1;
        }



    }
}
