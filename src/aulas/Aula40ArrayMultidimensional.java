package aulas;

public class Aula40ArrayMultidimensional {


    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][2];

        System.out.println(arrayMulti[0][0]);
        System.out.println(arrayMulti[0][1]);
        System.out.println(arrayMulti[1][0]);
        System.out.println(arrayMulti[1][1]);

        arrayMulti[0][0] = 123;
        arrayMulti[0][1] = 321;
        arrayMulti[1][0] = 456;
        arrayMulti[1][1] = 654;

        System.out.println(arrayMulti[0][0]);
        System.out.println(arrayMulti[0][1]);
        System.out.println(arrayMulti[1][0]);
        System.out.println(arrayMulti[1][1]);


        String[][] textos = new String[3][4];
        textos[0][0] = "Posição 0 0";
        textos[0][1] = "Posição 0 1";
        textos[0][2] = "Posição 0 2";
        textos[0][3] = "Posição 0 3";
        textos[1][0] = "Posição 1 0";
        textos[1][1] = "Posição 1 1";
        textos[1][2] = "Posição 1 2";
        textos[1][3] = "Posição 1 3";
        textos[2][0] = "Posição 2 0";
        textos[2][1] = "Posição 2 1";
        textos[2][2] = "Posição 2 2";
        textos[2][3] = "Posição 2 3";

        for (int i = 0; i < textos.length; i++){
            for (int j = 0; j < textos[i].length; j++){
                System.out.println(textos[i][j]);
            }
        }



    }
}
