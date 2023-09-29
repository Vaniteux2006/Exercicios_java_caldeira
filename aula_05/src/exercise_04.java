package aula_05;

import java.util.*;

public class exercise_04 {
    public static void main(String[] args) {
        ArrayList<Compra> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String key = "Y";
        while (key.equals("Y")) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar item à lista");
            System.out.println("2. Remover item da lista");
            System.out.println("3. Exibir lista de compras");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.println("Data de validade: ");
                    String dataValidade = scanner.nextLine();
                    Compra compra = new Compra(nome, dataValidade);
                    listaDeCompras.add(compra);
                    System.out.println("Item adicionado à lista.");
                    break;
                case 2:
                    System.out.print("Digite o índice do item a ser removido: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < listaDeCompras.size()) {
                        Compra itemRemovido = listaDeCompras.remove(indice);
                        System.out.println("Item removido da lista: " + itemRemovido);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println(i + ". " + listaDeCompras.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    key = "N";
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

}

class Compra {
    private String nome;
    private String dataValidade;

    public Compra(String nome, String dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Data de Validade: " + dataValidade;
    }
}