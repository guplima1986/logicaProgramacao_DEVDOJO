package aulas;

public class CalculadoraDiferencaIdade {


    public static void main(String[] args) {

        minhaSolucao(35, 15);
        System.out.println("Primeiro teste: "+ minhaSolucao(35, 15));
        System.out.println("Usando idade negativa: "+ minhaSolucao(35, -15));

        solucaoWillian();

    }

    private static int minhaSolucao(final int primeiraIdade, final int segundaIdade){

        int diferencaIdade = primeiraIdade - segundaIdade;
        return diferencaIdade;
    }

    private static void solucaoWillian(){

        int primeiraIdade = 30;
        int segundaIdade = 15;
        int diferencaEntreAsIdades = primeiraIdade - segundaIdade;

        System.out.println("Diferença das idades é " + diferencaEntreAsIdades);


    }

}
