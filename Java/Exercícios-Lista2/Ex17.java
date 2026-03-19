import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > 0 && b > 0) {
            System.out.println(a + b);
        } else {
            System.out.println("Valores inválidos");
        }
    }
}