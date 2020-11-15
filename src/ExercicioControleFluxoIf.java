public class ExercicioControleFluxoIf {

    /*
    * Receba uma idade
    * se idade mair que 18 imprima "Adulto"
    * se idade menor que 18 imprima "Ainda não é aduldo"
    * */
    public static void main(String[] args) {

        int idade = 18;

        if (idade != 18) {
            System.out.println("A idade é diferente de 18");
        }
        if (idade == 18) {
            System.out.println("A idade é igual de 18");
        }


        if (idade > 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda não é adulto");
        }




    }
}
