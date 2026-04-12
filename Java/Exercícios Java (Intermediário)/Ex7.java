import java.util.Scanner;
public class Ex7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        double total = 0;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Arroz (R$ 10)");
            System.out.println("2 - Feijão (R$ 8)");
            System.out.println("3 - Carne (R$ 25)");
            System.out.println("4 - Leite (R$ 6)");
            System.out.println("0 - Finalizar compra");
            System.out.print("Escolha um produto: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    total += 10;
                    break;
                case 2:
                    total += 8;
                    break;
                case 3:
                    total += 25;
                    break;
                case 4:
                    total += 6;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("\nTotal da compra: R$ " + total);
    }
}