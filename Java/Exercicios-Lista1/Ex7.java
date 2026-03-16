    import java.util.Scanner;

public class Ex7{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");int celsius = scanner.nextInt();
        
        double farenheit = ((celsius * 1.8) + 32);
        
        System.out.println("A conversão da temperatura para farenheit é igual a "+ farenheit);
    }
    
}