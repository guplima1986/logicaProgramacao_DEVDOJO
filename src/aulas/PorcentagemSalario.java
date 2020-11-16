package aulas;

public class PorcentagemSalario {


    public static void main(String[] args) {

        float valorSalario = 5000F;
        float porcentagem = 30F;

        float porcentagemSalario;

        porcentagemSalario = valorSalario * porcentagem / 100;

        System.out.println("O salário é R$" + valorSalario + " e a porcentagem foi de " + porcentagem);
        System.out.println("O valor do calculo foi de " + porcentagemSalario);

        porcentagem = 15;
        porcentagemSalario = valorSalario * porcentagem / 100;

        System.out.println("O salário é R$" + valorSalario + " e a porcentagem foi de " + porcentagem);
        System.out.println("O valor do calculo foi de " + porcentagemSalario);

        porcentagem = 5;
        porcentagemSalario = valorSalario * porcentagem / 100;

        System.out.println("O salário é R$" + valorSalario + " e a porcentagem foi de " + porcentagem);
        System.out.println("O valor do calculo foi de " + porcentagemSalario);




    }
}
