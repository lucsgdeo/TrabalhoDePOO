import java.util.Scanner;

public class Main { // Classe principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        int opcao = 0;
        while (opcao != 5) { //Opcoes de esolhas
            System.out.println("\n--- Menu Cofrinho ---");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total convertido para Real");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        adicionarMoeda(scanner, cofrinho);
                        break;
                    case 2:
                        removerMoeda(scanner, cofrinho);
                        break;
                    case 3:
                        cofrinho.listagemMoedas();
                        break;
                    case 4:
                        double total = cofrinho.totalConvertido();
                        System.out.printf("Total no cofrinho (convertido para Real): R$ %.2f\n", total);
                        break;
                    case 5:
                        System.out.println("Saindo do programa. Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();
                opcao = 0;
            }
        }
        scanner.close();
    }

    private static void adicionarMoeda(Scanner scanner, Cofrinho cofrinho) { // metodo de adicionar moendas
        System.out.println("\n--- Adicionar Moeda ---");
        System.out.println("1. Dólar");
        System.out.println("2. Euro");
        System.out.println("3. Real");
        System.out.print("Escolha o tipo de moeda: ");
        int tipoMoeda = scanner.nextInt();

        System.out.print("Digite o valor da moeda: ");
        double valor = scanner.nextDouble();

        Moeda novaMoeda = null;
        switch (tipoMoeda) {
            case 1:
                novaMoeda = new Dolar(valor);
                break;
            case 2:
                novaMoeda = new Euro(valor);
                break;
            case 3:
                novaMoeda = new Real(valor);
                break;
            default:
                System.out.println("Tipo de moeda inválido.");
                return;
        }
        cofrinho.adicionar(novaMoeda);
    }
    
    private static void removerMoeda(Scanner scanner, Cofrinho cofrinho) { //metodo de remover moendas
        System.out.println("\n--- Remover Moeda ---");
        System.out.println("1. Dólar");
        System.out.println("2. Euro");
        System.out.println("3. Real");
        System.out.print("Escolha o tipo de moeda a ser removida: ");
        int tipoMoeda = scanner.nextInt();

        System.out.print("Digite o valor da moeda a ser removida: ");
        double valor = scanner.nextDouble();

        Moeda moedaParaRemover = null;
        switch (tipoMoeda) {
            case 1:
                moedaParaRemover = new Dolar(valor);
                break;
            case 2:
                moedaParaRemover = new Euro(valor);
                break;
            case 3:
                moedaParaRemover = new Real(valor);
                break;
            default:
                System.out.println("Tipo de moeda inválido.");
                return;
        }
        cofrinho.remover(moedaParaRemover);
    }
}