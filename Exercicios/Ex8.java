    import java.util.Scanner;

public class Ex8{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço do produto");int preço = scanner.nextInt();
        
        if(preço>100)
        {double preço1=preço*0.8;
            System.out.println("O preço com desconto é " +preço1);
        }
        else
        {double preço2=preço*0.9;
            System.out.println("O preço com desconto é " +preço2);
        }
    }
    
}