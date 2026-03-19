 import java.util.Scanner;

public class Ex5{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");int idade = scanner.nextInt();

        if (idade>17)
        {System.out.println("Já é maior de idade");}
        
        else{
            System.out.println("Não é maior de idade");
        }
    }
    
}