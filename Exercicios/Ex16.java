    import java.util.Scanner;

public class Ex16{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o usuário");String user = scanner.nextLine();
        System.out.println("Digite a senha");String senha = scanner.nextLine();
    
        if(user.equals("admin") && senha.equals("1234"))
        {System.out.println("Aprovado");}
        else{
            System.out.println("Negado");
        }
    }
    
}