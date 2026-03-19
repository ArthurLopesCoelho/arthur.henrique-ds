import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double reais = scanner.nextDouble();
        double cotacao = scanner.nextDouble();

        double dolares = reais / cotacao;

        System.out.println(dolares);
    }
}