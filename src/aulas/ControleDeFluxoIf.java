package aulas;

public class ControleDeFluxoIf {

    public static void main(String[] args) {

        System.out.println("Antes do IF");

        if (true) {
            System.out.println("Se TRUE faz esse trecho");
        }

        System.out.println("Depois do IF");
        System.out.println("");

        System.out.println("Antes do IF 2");
        if (false) {
            System.out.println("Se TRUE faz esse trecho");
        }
        System.out.println("Depois do IF 2");

        System.out.println("");

        System.out.println("Antes do IF 3");
        boolean condicao = false;
        System.out.println("A condição é "+condicao);
        if (condicao) {
            System.out.println("Dentro IF 3");
        } else {
            System.out.println("Dentro ELSE 3");
        }
        System.out.println("Depois do IF 3");


    }
}
