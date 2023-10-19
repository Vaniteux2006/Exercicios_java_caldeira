import java.util.*;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um dia da semana (DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO): ");
        String input = scanner.nextLine();

        try {
            DiaDaSemana dia = DiaDaSemana.valueOf(input.toUpperCase()); // Converte a entrada em maiúsculas
            switch (dia) {
                case DOMINGO:
                    System.out.println("Domingo! Hoje é um dia de descanso =w=");
                    break;
                case SEGUNDA:
                    System.out.println("Segunda Feira... É o início da semana de trabalho ;w;");
                    break;
                case TERCA:
                    System.out.println("Terca Feira, recém estamos no comeco da semana, é cansativo :( ");
                    break;
                case QUARTA:
                    System.out.println("Quarta Feira, Meio da semana útil, continue trabalhando, as férias vem :)");
                case QUINTA:
                    System.out.println("Quinta Feira, Meio da semana, continue trabalhando.");
                    break;
                case SEXTA:
                    System.out.println("Sexta feira! O fim de semana está chegando! :D");
                    break;
                case SABADO:
                    System.out.println("SABADOOOO! Hoje é um ótimo dia para relaxar. OwO");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Dia da semana inválido. Certifique-se de digitar um dia válido em maiúsculas.");
        }
    }

}

enum DiaDaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}