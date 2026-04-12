import java.util.Scanner;
public class Ex4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor no caixa: ");
        int valor = scanner.nextInt();
        
        int n100 = valor / 100;
        valor = valor % 100;

        int n50 = valor / 50;
        valor = valor % 50;

        int n20 = valor / 20;
        valor = valor % 20;
        
        int n10 = valor / 10;
        valor = valor % 10;

        int n5 = valor / 5;
        valor = valor % 5;

        int n2 = valor / 2;
        valor = valor % 2;

        int valortotal=n100+n50+n20+n10+n5+n2;
        
        System.out.println("O total de notas no caixa é "+valortotal);

    
    }
}