import java.util.Scanner;

public class Rep10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva uma frase: ");
        String frase = scanner.nextLine();
        
        String copia = "";
        
           for (int i = 0; i < frase.length(); i++) {
            copia += frase.charAt(i);
        }

        System.out.println("Cópia: " + copia);

        
        scanner.close();
        
    }
}