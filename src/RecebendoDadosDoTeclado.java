import java.util.Scanner;

public class RecebendoDadosDoTeclado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("DIGITE SEU NOME:");
        nome = scanner.next();
        System.out.println("O NOME DIGITADO FOI: " + nome);
        System.out.println("DIGITE SUA IDADE:");
        idade = scanner.nextInt();
        System.out.println("O IDADE DIGITADO FOI: " + idade);


    }
}
