    import java.util.Scanner;

public class Ex9{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");int numero1 = scanner.nextInt();
        System.out.println("Digite um numero");int numero2 = scanner.nextInt();
        
        if(numero1%numero2==0)
        {
            System.out.println(numero1+" é multiplo de "+numero2);
        }
        else
        {
            System.out.println(numero1+" não é multiplo de "+numero2);
        }
    }
    
}