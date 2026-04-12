import java.util.Scanner;
public class Ex3{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String senha = "senha";
        String login = "login";
        System.out.println("Digite seu login");String login1=scanner.next();
        System.out.println("Digite sua senha"); String senha1=scanner.next();

        int i=0;
        while (i<2){
            if (senha.equals(senha1) && login.equals(login1)){
                break;
            }
            else{
                System.out.println("Senha inválida");
                System.out.println("Digite seu login: ");login1=scanner.next();
                System.out.println("Digite sua senha: ");senha1=scanner.next();
                i++;
            }
        }

        if (senha.equals(senha1) && login.equals(login1)){
            System.out.println("Acesso liberado");
        }
        else{
            System.out.println("Número máximo de tentativas erradas. ACESSO NEGADO");
        }
    }
}