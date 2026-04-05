import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra sem espaços");
        String palavra = scanner.next();

        int letras2 = 0;

        for (int i = 0; i < palavra.length(); i++) {
            letras2++; 
        }

        System.out.println("A quantidade de letras da palavra é " + letras2);
    }
}