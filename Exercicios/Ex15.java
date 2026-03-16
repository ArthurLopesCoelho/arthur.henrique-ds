    import java.util.Scanner;

public class Ex15{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade");int idade = scanner.nextInt();
    
        if(idade>0 && idade<13)
        {System.out.println("Criança");}
        if(idade>12 && idade<18)
        {System.out.println("Adolescente");}        
        if(idade>17 && idade<60)
        {System.out.println("Adulto");}
        if(idade>59)
        {System.out.println("Idoso");}
    }
    
}