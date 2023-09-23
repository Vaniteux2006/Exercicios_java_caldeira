package aula_04;

public class exercise_01 {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Ford", "Ka", 1997);
        Veiculo moto = new Moto("Honda", "Civic", 2006);
        Veiculo onibus = new Onibus("Mercedes-Benz", "O500", 2009, "Linha 627", 4.8);

        int distancia = 100;

        double custoCarro = carro.calcularCustoViagem(distancia);
        double custoMoto = moto.calcularCustoViagem(distancia);
        double custoOnibus = onibus.calcularCustoViagem(distancia);

        System.out.println("Distância a se percorrer: " + distancia + "km");
        System.out.println("Custo da viagem de carro: R$" + custoCarro);
        System.out.println("Custo da viagem de moto: R$" + custoMoto);
        System.out.println("Custo da viagem de ônibus: R$" + custoOnibus);
    }

    public static abstract class Veiculo {
        private String marca;
        private String modelo;
        private int ano;

        public Veiculo(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
        }

        public abstract double calcularCustoViagem(int distancia);

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }
    }

    public static class Carro extends Veiculo {
        public Carro(String marca, String modelo, int ano) {
            super(marca, modelo, ano);
        }

        @Override
        public double calcularCustoViagem(int distancia) {
            return distancia * 0.20;
        }
    }

    public static class Moto extends Veiculo {
        public Moto(String marca, String modelo, int ano) {
            super(marca, modelo, ano);
        }

        @Override
        public double calcularCustoViagem(int distancia) {
            return distancia * 0.15;
        }
    }

    public static class Onibus extends Veiculo {
        private String linha;
        private double valorPassagem;

        public Onibus(String marca, String modelo, int ano, String linha, double valorPassagem) {
            super(marca, modelo, ano);
            this.linha = linha;
            this.valorPassagem = valorPassagem;
        }

        @Override
        public double calcularCustoViagem(int distancia) {
            return (distancia/10) * valorPassagem;
        }

        public String getLinha() {
            return linha;
        }

        public void setLinha(String linha) {
            this.linha = linha;
        }

        public double getValorPassagem() {
            return valorPassagem;
        }

        public void setValorPassagem(double valorPassagem) {
            this.valorPassagem = valorPassagem;
        }
    }
}
