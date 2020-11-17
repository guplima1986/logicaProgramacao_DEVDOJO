package aulas;

import java.util.Scanner;

public class Aula31While {

    public static void main(String[] args) {

        final String login = "GUPLIMA";
        final String pass = "Teste123";
        boolean exibirLogin = true;
        Scanner scanner = new Scanner(System.in);

        while (exibirLogin) {
            String loginDigitado;
            String passwordDigitado;

            System.out.println("Digite o usuário");
            loginDigitado = scanner.next();

            System.out.println("Digite a senha");
            passwordDigitado = scanner.next();

            if (loginDigitado.equals(login) && passwordDigitado.equals(pass)) {
                System.out.println("Acesso concedido");
                exibirLogin = false;
                break;
            }

            System.out.println("Acesso negado");

        }

    }



}
