 import java.util.Scanner;

public class Ex3{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para somar");int cont = scanner.nextInt();
        int numero=0;
        while(cont != 0)
        { numero = numero+cont;
            System.out.println("Digite um numero para somar");cont = scanner.nextInt();
            
        }
        System.out.println("A soma é "+ numero);
    }
    
}