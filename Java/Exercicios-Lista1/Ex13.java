    import java.util.Scanner;

public class Ex13{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma nota");int nota = scanner.nextInt();
        
        if(nota<0 || nota>10)
        {
            System.out.println("nota inválida");
        }
        else{
            System.out.println("nota válida");
        }
        
    }
    
}