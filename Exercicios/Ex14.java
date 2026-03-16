    import java.util.Scanner;

public class Ex14{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância");int distancia = scanner.nextInt();
        System.out.println("Digite o consumo do carro (km/L)");double consumo = scanner.nextDouble();
        
    double litros= distancia/consumo;
    
    System.out.println("Serão gastos "+litros+" litros na viagem");
        
    }
    
}
