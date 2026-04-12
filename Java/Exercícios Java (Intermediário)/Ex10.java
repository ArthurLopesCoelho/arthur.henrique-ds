import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] produtos = {"Arroz", "Feijão", "Macarrão"};
        int[] estoque = {10, 5, 8};

        int opcao;

        do {
            System.out.println("\n--- MENU ESTOQUE ---");
            System.out.println("1 - Ver estoque");
            System.out.println("2 - Adicionar produto");
            System.out.println("3 - Remover produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nEstoque atual:");
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println(produtos[i] + ": " + estoque[i]);
                    }
                    break;

                case 2:
                    System.out.print("Qual produto (0-Arroz, 1-Feijão, 2-Macarrão)? ");
                    int add = scanner.nextInt();
                    System.out.print("Quantidade para adicionar: ");
                    int qtdAdd = scanner.nextInt();

                    estoque[add] += qtdAdd;
                    System.out.println("Produto atualizado!");
                    break;

                case 3:
                    System.out.print("Qual produto (0-Arroz, 1-Feijão, 2-Macarrão)? ");
                    int rem = scanner.nextInt();
                    System.out.print("Quantidade para remover: ");
                    int qtdRem = scanner.nextInt();

                    if (estoque[rem] >= qtdRem) {
                        estoque[rem] -= qtdRem;
                        System.out.println("Produto atualizado!");
                    } else {
                        System.out.println("Estoque insuficiente!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}