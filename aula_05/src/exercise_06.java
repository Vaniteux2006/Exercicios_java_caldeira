package aula_05;
import java.util.*;

public class exercise_06 {
    public static void main(String[] args) {
        List<Reserva> listaDeReservas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        String key = "Y";
        while (key.equals("Y")) {
            System.out.println("Menu:");
            System.out.println("1. Reservar passagem");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Exibir lista de reservas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Nome do passageiro: ");
                    String nomePassageiro = scanner.nextLine();
                    System.out.println("Local de destino: ");
                    String localDestino = scanner.nextLine();
                    System.out.println("CPF do passageiro: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Data de entrada: ");
                    String dataEntrada = scanner.nextLine();
                    System.out.println("Data de saída: ");
                    String dataSaida = scanner.nextLine();
                    
                    Reserva reserva = new Reserva(nomePassageiro, localDestino, cpf, dataEntrada, dataSaida);
                    listaDeReservas.add(reserva);
                    System.out.println("Reserva realizada com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o índice da reserva a ser cancelada: ");
                    int indiceCancelamento = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    if (indiceCancelamento >= 0 && indiceCancelamento < listaDeReservas.size()) {
                        Reserva reservaCancelada = listaDeReservas.remove(indiceCancelamento);
                        System.out.println("Reserva cancelada: " + reservaCancelada);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de Reservas:");
                    for (int i = 0; i < listaDeReservas.size(); i++) {
                        System.out.println(i + ". " + listaDeReservas.get(i));
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

class Reserva {
    private String nomePassageiro;
    private String localDestino;
    private String cpf;
    private String dataEntrada;
    private String dataSaida;

    public Reserva(String nomePassageiro, String localDestino, String cpf, String dataEntrada, String dataSaida) {
        this.nomePassageiro = nomePassageiro;
        this.localDestino = localDestino;
        this.cpf = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return "Nome do Passageiro: " + nomePassageiro +
               ", Local de Destino: " + localDestino +
               ", CPF: " + cpf +
               ", Data de Entrada: " + dataEntrada +
               ", Data de Saída: " + dataSaida;
    }
}