import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();

        String maior = a;

        if (b.length() > maior.length()) {
            maior = b;
        }
        if (c.length() > maior.length()) {
            maior = c;
        }

        System.out.println(maior);
    }
}