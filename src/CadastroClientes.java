import java.util.ArrayList;
import java.util.Scanner;


public class SistemaCadastroClientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Remover cliente");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade do cliente: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();  // Limpar o buffer
                    System.out.print("Digite o email do cliente: ");
                    String email = scanner.nextLine();
                    clientes.add(new Cliente(nome, idade, email));
                    System.out.println("Cliente adicionado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("Clientes cadastrados:");
                    for (Cliente cliente : clientes) {
                        System.out.println("Nome: " + cliente.nome + ", Idade: " + cliente.idade + ", Email: " + cliente.email);
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Digite o nome do cliente a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    clientes.removeIf(cliente -> cliente.nome.equalsIgnoreCase(nomeRemover));
                    System.out.println("Cliente removido com sucesso!\n");
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}