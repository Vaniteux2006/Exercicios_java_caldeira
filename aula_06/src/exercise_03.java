package aula_06;
import java.util.*;

public class exercise_03 {
    public static void main(String[] args) {
        TreeMap<String, Contato> agenda = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);


        String key = "Y";
        while (key.equals("Y")) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos em ordem alfabética");
            System.out.println("3. Listar contatos por localidade");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Número de telefone: ");
                    String numeroTelefone = scanner.nextLine();
                    System.out.println("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.println("Local da cidade (norte, sul, centro, leste, oeste): ");
                    String localidade = scanner.nextLine();
                    
                    Contato contato = new Contato(nome, numeroTelefone, endereco, localidade);
                    agenda.put(nome, contato);
                    System.out.println("Contato adicionado à agenda.");
                    break;
                case 2:
                    System.out.println("Lista de Contatos em Ordem Alfabética:");
                    for (Map.Entry<String, Contato> entrada : agenda.entrySet()) {
                        Contato contato2 = entrada.getValue();
                        System.out.println(contato2);
                    }
                    break;
                case 3:
                    System.out.println("Localidade (norte, sul, centro, leste, oeste): ");
                    String localidadeBusca = scanner.nextLine();
                    System.out.println("Contatos na Localidade " + localidadeBusca + ":");
                    for (Map.Entry<String, Contato> entrada : agenda.entrySet()) {
                        Contato contact = entrada.getValue();
                        if (contact.getLocalidade().equalsIgnoreCase(localidadeBusca)) {
                            System.out.println(contact);
                        }
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

class Contato {
    private String nome;
    private String numeroTelefone;
    private String endereco;
    private String localidade;

    public Contato(String nome, String numeroTelefone, String endereco, String localidade) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.endereco = endereco;
        this.localidade = localidade;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLocalidade() {
        return localidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Número de Telefone: " + numeroTelefone + ", Endereço: " + endereco + ", Localidade: " + localidade;
    }
}