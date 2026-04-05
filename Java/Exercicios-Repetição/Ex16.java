import java.util.Scanner;

public class Ex16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número"); int num1 = scanner.nextInt();
    System.out.println("Digite mais um número"); int num2 = scanner.nextInt();
    
    int i = 0;
    int mult=0;
    while(i<num2)
    {i=i+1;
        mult=mult+num1;
        
    }
    System.out.print("A multiplicação é: "+mult);
    }
}