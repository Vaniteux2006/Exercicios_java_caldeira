import java.util.*;


public class exercise_01 {
    public static void main(String[] args) {
        livro livro1 = new livro("1984", "Narrativo");
        livro livro2 = new livro("Pequeno Principe", "Narrativo");
        livro livro3 = new livro("Cancao do Exilio", "Lirico");
        livro livro4 = new livro("A Maquina do Mundo", "Lirico");

        Stack<livro> pilhaTitulo = new Stack<>();

        pilhaTitulo.push(livro1);
        pilhaTitulo.push(livro2);
        pilhaTitulo.push(livro3);
        pilhaTitulo.push(livro4);
        System.out.println("*******************************************************");
        System.out.println("Livros: ");
        for (int i = 0; i < pilhaTitulo.size(); i++) {
            System.out.println(pilhaTitulo.get(i));
        }
        System.out.println("*******************************************************");
        System.out.println("Livros por categoria 'Narrativo'");

        for (int i = 0; i < pilhaTitulo.size(); i++) {
            if (pilhaTitulo.get(i).Categoria == "Narrativo") {
                System.out.println(pilhaTitulo.get(i));
            }
        }

        System.out.println("*******************************************************");
        System.out.println("Livros por categoria 'Lirico'");

        for (int i = 0; i < pilhaTitulo.size(); i++) {
            if (pilhaTitulo.get(i).Categoria == "Lirico") {
                System.out.println(pilhaTitulo.get(i));
            }
        }
        System.out.println("*******************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja apagar toda a lista? Y/N");
        String choise = scanner.next();

        while (true) {
            if (choise == "Y") {
                pilhaTitulo.clear();
                System.out.println(pilhaTitulo);
                break;
            } else if (choise == "N") {
                break;
            } else {
                System.out.println("Letra nao compreendida. Automaticamente colocado 'N'");
                choise = "N";
            }
        }
    }
    static class livro{
        String Titulo;
        String Categoria;

        public livro(String Titulo, String Categoria) {
            this.Titulo = Titulo;
            this.Categoria = Categoria;
        }

        @Override
        public String toString() {
            return "livro{" +
                    "Titulo='" + Titulo + '\'' +
                    ", Categoria='" + Categoria + '\'' +
                    '}';
        }
    }

}
//Notas do programador:
//Codigo feito no Mac durante o curso. Nunca acreditei tanto em mim mesmo.