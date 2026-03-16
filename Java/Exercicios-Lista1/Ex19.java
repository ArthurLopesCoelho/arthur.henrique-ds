 import java.util.Scanner;

public class Ex19{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");int numero1 = scanner.nextInt();
        System.out.println("Digite um numero");int numero2 = scanner.nextInt();
        System.out.println("Digite um numero");int numero3 = scanner.nextInt();
    
        int minimo= Math.min(numero1,Math.min(numero2,numero3));
        
            System.out.println("O menor numero é "+minimo);
        
    }
    
}