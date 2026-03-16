 import java.util.Scanner;

public class Ex20{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um lado");int lado1 = scanner.nextInt();
        System.out.println("Digite outro lado");int lado2 = scanner.nextInt();
        System.out.println("Digite o ultimo lado");int lado3 = scanner.nextInt();
    
        int ladomax= Math.max(lado1,Math.max(lado2,lado3));
        int soma= (lado1+lado2+lado3)-ladomax;
        
        if(ladomax>soma)
        {System.out.println("Não forma triangulo");}
        
        
        else if (lado1==lado2 && lado2==lado3)
        {System.out.println("O triangulo é equilátero");}
        
        else if(lado1==lado2||lado1==lado3||lado2==lado3)
        {System.out.println("É um triangulo isósceles");}
        
        else{
            System.out.println("O triangulo é escaleno");
        }
        
        
    }
    
}