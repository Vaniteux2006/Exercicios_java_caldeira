import java.util.*;

public class exercise_02 {
    public static void main(String[] args) {
        Map<String, Integer> Pessoa = new HashMap<String, Integer>();
        Pessoa.put("Enzo", 6);
        Pessoa.put("Ana", 11);
        Pessoa.put("Lucas", 17);
        Pessoa.put("Sofia", 20);
        Pessoa.put("Pedro", 24);
        Pessoa.put("Maria", 35);
        Pessoa.put("Joao", 46);
        Pessoa.put("Miguel", 51);
        Pessoa.put("Laura", 71);
        Pessoa.put("Beatriz", 80);

        //imprimir idade
        for (Map.Entry<String, Integer> be : Pessoa.entrySet()) {

            System.out.println("Nome: " + be.getKey() + "; Idade: " + be.getValue());
        }


        System.out.println("Deseja ver a idade de alguem? Y/N");
        Scanner scanner = new Scanner(System.in);
        String choise = scanner.next();

        if (choise.equals("Y") || choise.equals("y")) {
            System.out.println("Escreva o nome da pessoa");
            String nome = scanner.next();

            while (true) {
                if (Pessoa.containsKey(nome)) {
                    int age = getIdades(Pessoa, nome);
                    System.out.println(nome + " tem exatamente " + age + " Anos");
                    break;
                } else {
                    System.err.println("Insira o nome de alguem presente na lista");
                    nome = scanner.next();
                }
            }
        } else {
            System.out.println("ok.");
        }

        System.out.println("Quer ver quais pessoas sao da terceira idade? Y/N");
        String choise2 = scanner.next();

        if (choise2.equals("Y")) {
            for (Map.Entry<String, Integer> be : Pessoa.entrySet()) {
                int idade = be.getValue();
                if (idade >= 60) {
                    System.out.println("Nome: " + be.getKey() + "; Idade: " + be.getValue());
                }
            }
        } else {
            System.out.println("ok.");
            // Os bugs criaram uma cafeteria e agora estão servindo café quente! ☕🐞
        }

    }

    public static Integer getIdades(Map<String, Integer> mapa, String Name) {
        if (mapa.containsKey(Name)) {
            return mapa.get(Name);
        } else {
            return 0;
        }
        //se o nome estiver na lista fornecida, retornar o numero de idade
    }
}


//Notas de programador:
// Feito no Mac tambem. o cafe ta frio