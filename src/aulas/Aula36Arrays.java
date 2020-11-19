package aulas;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Aula36Arrays {


    public static void main(String[] args) {

        double nota1 = 7.5;
        double nota2 = 8;
        double nota3 = 3;
        double nota4 = 6;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média : " + media);


        double[] notasArray = new double[4];

        System.out.println(notasArray[0]);
        System.out.println(notasArray[1]);
        System.out.println(notasArray[2]);
        System.out.println(notasArray[3]);


        notasArray[0] = 5;
        notasArray[1] = 15;
        notasArray[2] = 25;
        notasArray[3] = 35;
        System.out.println(notasArray[0]);
        System.out.println(notasArray[1]);
        System.out.println(notasArray[2]);
        System.out.println(notasArray[3]);

        for (int i = 0; i < notasArray.length; i++){
            System.out.println("Notas na posição " + i + " é " + notasArray[i]);
        }

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notasArray.length; i++){
            System.out.println("Alterando as notas no array");
            System.out.println("Notas na posição " + i + " é " + notasArray[i]);
            System.out.println("Digite a nova nota:");
            notasArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < notasArray.length; i++) {
            System.out.println("Nova nota na posição " + i + " é " + notasArray[i]);
        }



    }
}
