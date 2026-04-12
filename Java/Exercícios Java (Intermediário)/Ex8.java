import java.util.Scanner;
import java.util.Random;

public class Ex8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt(100);
        
        System.out.println("Digite um número de 1 a 100: ");int numero1= scanner.nextInt();
        
        do{
            if (numero1>numero){
                System.out.println("Digite um número menor");numero1=scanner.nextInt();
            }
            if (numero1<numero){
                System.out.println("Digite um número maior");numero1=scanner.nextInt();
            }
            else{
                System.out.println("Você acertou!!!");
                break;
            }
        }while(numero1!=numero);
    }
}