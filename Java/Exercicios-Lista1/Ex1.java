    import java.util.Scanner;

public class Ex1{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        if (numero%2==0)
        {System.out.println("O numero "+numero+" e par");}
        else
        {System.out.println("O numero "+numero+" e ímpar");}
    }
    
}