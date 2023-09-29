
package aula_05;

import java.util.Scanner;

public class exercise_03 {
    public static void main(String args[]) {
        String[] lista = new String[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Listinha de Tarefas do DEV!");

        // Parte 1 - A Interface
        while (true) {
            System.out.println("Escolha uma opção:\n1. Adicionar tarefa\n2. Remover tarefa\n3. Sair\n4. Mostrar a lista");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Parte 1.1 - Adicionar tarefa
                    System.out.println("Digite a tarefa (Use _ para espaços):");
                    String tarefa = scanner.next();
                    adicionarTarefa(lista, tarefa);
                    limpaTela();
                    break;
                case 2:
                    // Parte 1.2 - Remover tarefa
                    System.out.println("Digite o número da tarefa que deseja remover:");
                    int numeroTarefa = scanner.nextInt();
                    removerTarefa(lista, numeroTarefa);
                    limpaTela();
                    break;
                case 3:
                    // Parte 1.3 - Sair
                    System.out.println("Saindo da Listinha de Tarefas do DEV.");
                    scanner.close();
                    System.exit(0);
                case 4:
                    // Parte 1.4 - Mostrar a lista de tarefas
                    System.out.println("Tarefas na lista:");
                    checklist(lista);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void limpaTela() { //Menção honrosa: Código para limpar a tela.
        try {
            String osName = System.getProperty("os.name").toLowerCase();

            if (osName.contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (osName.contains("mac") || osName.contains("linux")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //foi bem aqui que os Bugs abriram uma cafeteria. 
    }

    // Parte 2 - O Adicionador
    public static void adicionarTarefa(String[] lista, String tarefa) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {// Se o espaço estiver nulo, coloca a tarefa, caso não, o loop dá 1 passo
                lista[i] = tarefa; // Ele atribui o espaço "i" para a tarefa
                System.out.println("Tarefa adicionada com sucesso!");
                return;
            }
        }
        System.out.println("A lista de tarefas está cheia. Não é possível adicionar mais tarefas.");
        // Esse aqui imprime somente, e só semente, "i" > lista.length
    }

    // Parte 3 - O Removedor
    public static void removerTarefa(String[] lista, int numeroTarefa) {
        // Definido "numeroTarefa - 1" como a posição da lista
        if (numeroTarefa >= 1 && numeroTarefa <= lista.length && lista[numeroTarefa - 1] != null) {
            // se numeroTarefa fornecido for maior ou igual a 1, menor ou igual ao
            // número total de tarefas na lista e a tarefa correspondente a esse número
            // (subtraindo 1) não for nula (3 condições)
            System.out.println("Removendo tarefa: " + lista[numeroTarefa - 1]);
            lista[numeroTarefa - 1] = null;
            // Princípio básico: Toda tarefa para nós, para o computador é -1.
        } else {
            System.out.println("Número de tarefa inválido.");
        }
    }

    // Parte 4 - O Impressor
    public static void checklist(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) { // Enquanto que o espaço da lista não for nulo
                System.out.println(i + 1 + ". " + lista[i]); // Ele imprime o que estiver ali
            }
        }
    }
}
