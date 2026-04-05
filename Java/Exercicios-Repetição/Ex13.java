import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPar = 0;
        int somaImpar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                somaPar += num;
            } else {
                somaImpar += num;
            }
        }

        System.out.println("Soma dos pares: " + somaPar);
        System.out.println("Soma dos ímpares: " + somaImpar);
    }
}