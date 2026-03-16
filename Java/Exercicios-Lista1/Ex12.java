    import java.util.Scanner;

public class Ex12{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");int numero1 = scanner.nextInt();
        System.out.println("Digite um número");int numero2 = scanner.nextInt();
        System.out.println("Digite um operador (+, -, *, /)");String operador = scanner.next();
        
        if(operador.equals("+"))
        {
            System.out.println(numero1+numero2);
        }
        if(operador.equals("-"))
        {
            System.out.println(numero1-numero2);
        }
        if(operador.equals("*"))
        {
            System.out.println(numero1*numero2);
        }
        if(operador.equals("/"))
        {
            System.out.println(numero1/numero2);
        }
        
    }
    
}