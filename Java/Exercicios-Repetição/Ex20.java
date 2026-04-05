import java.util.Scanner;

public class Ex20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma opção:");
        System.out.println("1 - Falar com Vendas");
        System.out.println("2 - Suporte Técnico");
        System.out.println("3 - Financeiro");
        System.out.println("4 - Cancelamento");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você foi direcionado para o setor de Vendas.");
                break;

            case 2:
                System.out.println("Você foi direcionado para o Suporte Técnico.");
                break;

            case 3:
                System.out.println("Você foi direcionado para o Financeiro.");
                break;

            case 4:
                System.out.println("Você foi direcionado para Cancelamento.");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}