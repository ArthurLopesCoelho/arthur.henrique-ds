 import java.util.Scanner;

public class Ex1{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para contagem");int cont = scanner.nextInt();
        int numero=0;
        while(numero<=cont)
        {System.out.println(numero);
            numero=numero + 1;
        }
    }
    
}