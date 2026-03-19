 import java.util.Scanner;

public class Ex4{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço do produto");double preço = scanner.nextDouble();

        double resultado = preço * 1.12;
        
        System.out.println("O novo preço com os impostos é " + resultado);
        
    }
    
}