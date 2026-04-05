
import java.util.Scanner;

public class Ex6 {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int op = 0;
        
        while (op != 3){
            
            System.out.println("MENU");
            System.out.println("1 - Dizer Oi ");
            System.out.println("2 - Dizer Tchau ");
            System.out.println("3 - Parar ");
            System.out.println("Escolha uma opção: ");
            op = scanner.nextInt();
            
            
       
        switch (op){
            
            case 1 :
                System.out.println("Oi bonzão.");
                break;
            case 2 : 
                System.out.println("Tchau seu But.");
                break;
            case 3 :
                System.out.println("Parando...");
                break;

            
        }
    }
        
    }
    
}
