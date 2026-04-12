import java.util.Scanner;

public class Ex5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");

        int quantidade = palavras.length;

        System.out.println("Quantidade de palavras: " + quantidade);
    }
}