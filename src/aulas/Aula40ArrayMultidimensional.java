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

    }
}
