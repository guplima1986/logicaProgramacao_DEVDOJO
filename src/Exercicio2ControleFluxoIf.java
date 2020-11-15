public class Exercicio2ControleFluxoIf {

    /*
    * Dado um determinado salario
    * se o salario for maior que 4500 imprima 30% do valor
    * senao imprima 15% do valor
    * */
    public static void main(String[] args) {

        double salario = 4500;

        double resultado;

        if (salario > 4500) {
           resultado = salario * 0.3;
        } else {
            resultado = salario * 0.15;
        }

        System.out.println("Resultado : " + resultado);
    }
}
