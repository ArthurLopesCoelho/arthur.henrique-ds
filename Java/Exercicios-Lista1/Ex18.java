    import java.util.Scanner;

public class Ex18{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o consumo em kWh");int consumo = scanner.nextInt();
    
        if(consumo<100)
        {double conta= 0.2*consumo;
            System.out.println("A conta é de "+conta);}
        else{double conta= 0.25*consumo;
            System.out.println("A conta é de "+conta);
        }
    }
    
}