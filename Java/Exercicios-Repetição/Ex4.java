 import java.util.Scanner;

public class Ex4{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para tabuada");int numero=scanner.nextInt();
        for(int i=0; i<=10;i++)
        {
            System.out.println(numero*i);
        }
    }
    
}