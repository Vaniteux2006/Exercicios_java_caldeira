public class exercise_3 {
    public static void main(String[] args) {
        int one = 12;
        int two = 24;
        int three = 36;

        int maior = Math.max(Math.max(one, two), three);
        int menor = Math.min(Math.min(one, two), three);
        double media = (one + two + three) / 3.0;


        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média aritmética é: " + media);
    }
}

//Notas de programador:
// Não sou muito fã de matemática, mas confesso que me senti bem inteligente colocando pra pegar o máximo de "1" e "2" antes de comparar com "3"



