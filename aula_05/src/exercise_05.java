package aula_05;
import java.util.*;

public class exercise_05 {
    public static void main(String[] args) {
        LinkedList<Impressao> filaDeImpressao = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        String key = "Y";
        while (key.equals("Y")) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar documento à fila de impressão");
            System.out.println("2. Imprimir documento da fila de impressão");
            System.out.println("3. Ver fila de impressão");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Nome do documento: ");
                    String nomeDocumento = scanner.nextLine();
                    System.out.println("Número de páginas: ");
                    int numPaginas = scanner.nextInt();
                    Impressao documento = new Impressao(nomeDocumento, numPaginas);
                    filaDeImpressao.add(documento);
                    System.out.println("Documento adicionado à fila de impressão.");
                    break;
                case 2:
                    if (!filaDeImpressao.isEmpty()) {
                        Impressao documentoImpresso = filaDeImpressao.poll();
                        System.out.println("Imprimindo documento: " + documentoImpresso);
                    } else {
                        System.out.println("Fila de impressão vazia.");
                    }
                    break;
                case 3:
                    if (!filaDeImpressao.isEmpty()) {
                        System.out.println("Fila de Impressão:");
                        for (Impressao doc : filaDeImpressao) {
                            System.out.println(doc);
                        }
                    } else {
                        System.out.println("Fila de impressão vazia.");
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

class Impressao {
    private String nomeDocumento;
    private int numPaginas;

    public Impressao(String nomeDocumento, int numPaginas) {
        this.nomeDocumento = nomeDocumento;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Documento: " + nomeDocumento + ", Páginas: " + numPaginas;
    }
}
