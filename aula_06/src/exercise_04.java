package aula_06;
import java.util.*;

public class exercise_04 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> mapaDeProdutos = new LinkedHashMap<>();

        // Inserir produtos e seus preços no mapa
        mapaDeProdutos.put("Batatas Pringles", 10.99);
        mapaDeProdutos.put("Chocolate Nestlé", 5.49);
        mapaDeProdutos.put("Coca-Cola 2L", 7.99);
        mapaDeProdutos.put("Salgadinho Doritos", 12.99);

        // Imprimir a lista de produtos na ordem de inserção
        System.out.println("Lista de Produtos na Ordem de Inserção:");
        for (Map.Entry<String, Double> entry : mapaDeProdutos.entrySet()) {
            String produto = entry.getKey();
            double preco = entry.getValue();
            System.out.println("Produto: " + produto + ", Preço: " + preco);
        }
    }
}