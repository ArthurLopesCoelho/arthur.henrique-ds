import java.util.Scanner;

public class Ex7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Até qual numero devem ir os pares?");int numero=scanner.nextInt();
        
        for(int i=0;i<=numero;i=i + 2)
        {System.out.println(i);}
    }
}