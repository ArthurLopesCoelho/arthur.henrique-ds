import java.util.Scanner;
import java.util.ArrayList;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você quer digitar? ");
        int quantidade = scanner.nextInt();

        ArrayList<Integer> numeropar = new ArrayList<>();
        ArrayList<Integer> numeroimpar = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o número " + (i + 1));
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                numeropar.add(numero);
            } else {
                numeroimpar.add(numero);
            }
        }
        
        System.out.println("Os números pares são: ");
        for (int i = 0; i < numeropar.size(); i++) {
            System.out.println(numeropar.get(i));
        }

        System.out.println("Os números ímpares são: ");
        for (int i = 0; i < numeroimpar.size(); i++) {
            System.out.println(numeroimpar.get(i));
        }
    }
}