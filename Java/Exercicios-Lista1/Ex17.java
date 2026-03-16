    import java.util.Scanner;

public class Ex17{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota");double nota = scanner.nextDouble();
        System.out.println("Digite a frequencia");int frequencia = scanner.nextInt();
    
        if(nota>=7 && frequencia>=75)
        {System.out.println("Aprovado");}
        else{
            System.out.println("Negado");
        }
    }
    
}