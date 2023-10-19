public class Exercise_01 {
    public static void main(String[] args) {
        Desenhavel circulo = new Circulo();
        Desenhavel quadrado = new Quadrado();

        circulo.desenhar();
        quadrado.desenhar();
    }
}

interface Desenhavel {
    void desenhar();
}

class Circulo implements Desenhavel {
    @Override
    public void desenhar() {
        System.out.println("Vou desenhar o círculo");
    }
}

class Quadrado implements Desenhavel {
    @Override
    public void desenhar() {
        System.out.println("Vou desenhar o quadrado");
    }
}