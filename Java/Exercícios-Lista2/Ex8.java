import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double parcela = scanner.nextDouble();

        if (parcela <= salario * 0.3) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Negado");
        }
    }
}