public class Exercicio2ControleFluxoIf {

    /*
    * Dado um determinado salario
    * se o salario for maior que 4500 imprima 30% do valor
    * senao imprima 15% do valor
    * */
    public static void main(String[] args) {

        double salario = 4501;

        if (salario > 4500) {
            System.out.println("30% do salário é R$" + salario * 30 /100);
        } else {
            System.out.println("15% do salário é R$" + salario * 30 /100);
        }

    }
}
