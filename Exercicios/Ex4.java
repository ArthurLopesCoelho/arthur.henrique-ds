    import java.util.Scanner;

public class Ex4{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota");float numero1 = scanner.nextFloat();
        System.out.println("Digite a segunda nota");float numero2 = scanner.nextFloat();
        System.out.println("Digite a terceira nota");float numero3 = scanner.nextFloat();
        
        float media= (numero1+numero2+numero3)/3;
        
        if (media >= 7)
        {System.out.println("Aprovado");}
        if (media>=5 && media<7 )
        {System.out.println("Recuperação");}
        else if (media<5) 
        {System.out.println("Reprovado");}
    }
    
}