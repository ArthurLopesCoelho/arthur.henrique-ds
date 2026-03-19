import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double desconto;

        if (salario < 2000) {
            desconto = salario * 0.08;
        } else if (salario <= 3000) {
            desconto = salario * 0.09;
        } else {
            desconto = salario * 0.11;
        }

        double liquido = salario - desconto;

        System.out.println(liquido);
    }
}