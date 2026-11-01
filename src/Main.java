import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionar(descricao);
                    break;
                case 2:
                    gerenciador.listar();
                    break;
                case 3:
                    System.out.print("Id da tarefa: ");
                    try {
                        int idConcluir = Integer.parseInt(scanner.nextLine());
                        gerenciador.concluir(idConcluir);
                    } catch (NumberFormatException e) {
                        System.out.println("Digite apenas números.");
                    }
                    break;
                case 4:
                    System.out.print("Id da tarefa: ");
                    try {
                        int idRemover = Integer.parseInt(scanner.nextLine());
                        gerenciador.remover(idRemover);
                    } catch (NumberFormatException e) {
                        System.out.println("Digite apenas números.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;

            }
        }
        scanner.close();
    }
}
