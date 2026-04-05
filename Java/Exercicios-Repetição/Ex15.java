import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resposta;

        System.out.print("Digite 'sim' para continuar: ");
        resposta = scanner.next();

        while (!resposta.equalsIgnoreCase("sim")) {
            System.out.print("Resposta inválida. Digite 'sim': ");
            resposta = scanner.next();
        }

        System.out.println("Resposta válida!");
    }
}