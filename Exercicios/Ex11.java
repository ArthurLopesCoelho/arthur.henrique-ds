    import java.util.Scanner;

public class Ex11{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano");int ano = scanner.nextInt();
        
        if(ano%4==0)
        {
            System.out.println("o ano digitado é bissexto");
        }
        else
        {
            System.out.println("o ano digitado não é bissexto");
        }
    }
    
}