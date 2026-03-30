 import java.util.Scanner;

public class Ex5{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero do dia da semana");int numero=scanner.nextInt();
        
        switch(numero){
            case 1:
                System.out.println("Hoje é Domingo");
                break;
            case 2:
                System.out.println("Hoje é Segunda");
                break;
            case 3:
                System.out.println("Hoje é Terça");
                break;
            case 4:
                System.out.println("Hoje é Quarta");
                break;
            case 5:
                System.out.println("Hoje é Quinta");
                break;
            case 6:
                System.out.println("Hoje é Sexta");
                break;
            case 7:
                System.out.println("Hoje é Sábado");
                break;
            case 8:
                System.out.println("Nao existe");
                break;
        }
        
    }
    
}