    import java.util.Scanner;

public class Ex2{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");int numero1 = scanner.nextInt();
        System.out.println("Digite um numero"); int numero2 = scanner.nextInt();
        if (numero1==numero2)
        {System.out.println("Os dois numeros digitados são iguais");}
        if (numero1>numero2)
        {System.out.println("O numero "+numero1+" é maior que o numero "+numero2);}
        else if (numero2>numero1) 
        {System.out.println("O numero "+numero2+" é maior que o numero "+numero1);}
    }
    
}