    import java.util.Scanner;

public class Ex3{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");int numero1 = scanner.nextInt();
        if (numero1==0)
        {System.out.println("O número é igual a 0");}
        if (numero1>0)
        {System.out.println("O numero "+numero1+" é positivo");}
        else if (numero1<0) 
        {System.out.println("O numero "+numero1+" é negativo");}
    }
    
}