import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n >= 10 && n <= 50) {
            System.out.println("Dentro");
        } else {
            System.out.println("Fora");
        }
    }
}