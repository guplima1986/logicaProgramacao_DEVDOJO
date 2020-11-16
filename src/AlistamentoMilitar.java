import java.util.Scanner;

public class AlistamentoMilitar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sexo;
        int idade;

        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();
        System.out.println("Escolha o sexo:");
        System.out.println("M para masculino");
        System.out.println("F para feminino");
        sexo = scanner.next();

        if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
            System.out.println("O sexo escolhido é inválido, digite M ou F:");
            System.out.println("M para masculino");
            System.out.println("F para feminino");
            sexo = scanner.next();
        }


        if (sexo.equalsIgnoreCase("M") && idade >= 18) {
            System.out.println("Alistamento militar obrigatorio");
        } else if (sexo.equalsIgnoreCase("M") && idade < 18) {
            System.out.println("Alistamento militar não permitido");
        } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.println("Deseja se alistar?");
            System.out.println("S para sim");
            System.out.println("N para não");
        }  else if (sexo.equalsIgnoreCase("F") && idade < 18) {
            System.out.println("Alistamento militar não permitido");
        }





    }
}
