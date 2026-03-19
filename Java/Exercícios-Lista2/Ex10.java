import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int dif = a - b;

        if (dif < 0) {
            dif = -dif;
        }

        System.out.println(dif);
    }
}