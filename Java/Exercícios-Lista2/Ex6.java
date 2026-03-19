 import java.util.Scanner;

public class Ex6{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número"); double numero = scanner.nextDouble();

        if (numero%2==0)
        {System.out.println("O número é par");}
        
        else{
            System.out.println("O número é impar");
        }
        if(numero%5==0)
            {System.out.println("O número é divisível por 5");}
    }
    
}