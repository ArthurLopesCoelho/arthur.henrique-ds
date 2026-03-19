import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();

        int h = total / 3600;
        int r = total % 3600;

        int m = r / 60;
        int s = r % 60;

        System.out.println(h + "h " + m + "m " + s + "s");
    }
}