 import java.util.Scanner;

public class Ex3{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota");double nota1 = scanner.nextDouble();
        System.out.println("Digite o peso da primeira nota");double peso1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota");double nota2 = scanner.nextDouble();
        System.out.println("Digite o peso da segunda nota");double peso2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota");double nota3 = scanner.nextDouble();
        System.out.println("Digite o peso da terceira nota");double peso3 = scanner.nextDouble();
        
        double soma = (nota1*peso1)+(nota2*peso2)+(nota3*peso3);
        double media= soma/(peso1+peso2+peso3);
        System.out.println("A media ponderada é: " + media);
        
    }
    
}