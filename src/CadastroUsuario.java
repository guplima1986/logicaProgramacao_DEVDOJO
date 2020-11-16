import java.util.Scanner;

public class CadastroUsuario {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome;


        System.out.println("Digite o nome do usuário");
        nome = scanner.next();

        if (nome.equalsIgnoreCase("admin")
                || nome.equalsIgnoreCase("administrador")
                || nome.isEmpty()) {

            System.out.println("Usuário inválido");

        } else {
            System.out.println(nome + " cadastrado com sucesso.");
        }





    }
}
