import java.util.Scanner;

public class Rep8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int senha = 1234;
        
        System.out.println("Digite a senha : ");
        int dig = scanner.nextInt();
        
        if (dig == senha){
            
            System.out.println("A senha está correta.");
            
        }
        
        else{
            
            System.out.println("A senha está incorreta.");
            
        }

        
        scanner.close();
        
    }
}