    import java.util.Scanner;

public class Ex5{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario");float salario = scanner.nextFloat();
        
        if (salario < 2000)
        {double salario1=salario*1.1;
        System.out.println("O novo salário é "+salario1);}
        if (salario>=2000 && salario<=4000)
        {double salario2=salario*1.07;
        System.out.println("O novo salário é "+salario2);}
        else if (salario>4000) 
        {double salario3=salario*1.05;
        System.out.println("O novo salário é "+salario3);}
    }
    
}