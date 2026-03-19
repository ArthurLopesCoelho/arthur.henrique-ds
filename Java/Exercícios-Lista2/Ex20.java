import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double venda = scanner.nextDouble();
        double comissao;

        if (venda < 1000) {
            comissao = venda * 0.04;
        } else if (venda <= 5000) {
            comissao = venda * 0.06;
        } else {
            comissao = venda * 0.08;
        }

        System.out.println(comissao);
    }
}