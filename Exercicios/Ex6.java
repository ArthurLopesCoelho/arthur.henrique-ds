    import java.util.Scanner;

public class Ex6{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");int idade = scanner.nextInt();
        
        if (idade < 16)
        {System.out.println("Não votar");}
        if (idade==16 || idade==17 || idade>69)
        {System.out.println("Voto opcional");}
        else if (idade>17 && idade<70) 
        {System.out.println("voto obrigatório");}
    }
    
}