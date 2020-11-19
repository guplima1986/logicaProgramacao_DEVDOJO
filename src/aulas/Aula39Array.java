package aulas;

import java.util.Scanner;

public class Aula39Array {


    public static void main(String[] args) {

        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner leitor = new Scanner(System.in);
        String texto = "";

        for (int i =0; i< array1.length; i++){
            System.out.println("Vetor 1 posição " + i + ". Digite o primeiro numero");
            array1[i] = leitor.nextInt();
            System.out.println("Vetor 2 posição " + i + ". Digite o primeiro numero");
            array2[i] = leitor.nextInt();
            array3[i] = array1[i] * array2[i];

            texto = texto + array3[i] + " ";


            System.out.println(texto);
        }

    }
}
