 import java.util.Scanner;

public class Ex7{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância da viagem em km"); double distancia = scanner.nextDouble();
        System.out.println("Digite a velocidade média em km/h"); double velocidade = scanner.nextDouble();

        double tempo= distancia/velocidade;
        
        System.out.println("O tempo estimado da viagem é de "+tempo);
    }
    
}