    import java.util.Scanner;

public class Ex10{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura");double altura = scanner.nextDouble();
        System.out.println("Digite seu sexo (Homem/Mulher)");String sexo = scanner.next();
        
        if(sexo=="Homem")
        {double valor= (72.7 * altura) - 58;
            System.out.println("seu peso ideal é de "+valor);
        }
        else
        {double valor= (62.1 * altura) - 44.7;
            System.out.println("seu peso ideal é de "+valor);
        }
    }
    
}