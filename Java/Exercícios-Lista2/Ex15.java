import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco = scanner.nextDouble();
        double desc;

        if (preco < 50) {
            desc = preco * 0.05;
        } else if (preco <= 100) {
            desc = preco * 0.10;
        } else {
            desc = preco * 0.15;
        }

        System.out.println(preco - desc);
    }
}