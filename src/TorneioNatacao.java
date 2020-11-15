import java.util.Scanner;

public class TorneioNatacao {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do participante");
        String name = scanner.next();
        System.out.println("Digite a idade do participante");
        int age = scanner.nextInt();

        if (age <= 10) {
            System.out.println(name + " participará da categoria Infantil");
        } else if (age >= 11 && age <= 15) {
            System.out.println(name + " participará da categoria Juvenil");
        } else if (age >= 16 && age <= 19){
            System.out.println(name + " participará da categoria Pré-adulto");
        } else {
            System.out.println(name + " participará da Adulto");
        }






    }


}
