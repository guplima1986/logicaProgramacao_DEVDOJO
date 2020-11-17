package aulas;

public class Aula28While {

    public static void main(String[] args) {

        boolean valor = true;

        while (valor) {
            System.out.println("WHILE");
            valor = false;
        }

        valor = true;

        do {
            System.out.println("DO WHILE");
            valor = false;
        } while (valor);


    }
}
