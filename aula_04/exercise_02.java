package aula_04;

import java.util.ArrayList;
import java.util.List;

public class exercise_02 {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();

        formas.add(new Retangulo(5.0, 10.0));
        formas.add(new Circulo(3.0));
        formas.add(new Triangulo(4.0, 6.0));
        formas.add(new Quadrado(4.0));
        formas.add(new Losango(6.0, 8.0));

        for (FormaGeometrica forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }

        //no looping, ele cria uma variável temporária "forma", da classe Forma Geométrica, que percorre cada elemento do array e, usando ele, imprime com o Sysout.
    }
}

abstract class FormaGeometrica {
    public abstract double calcularArea();
}

class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
}

class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Losango extends FormaGeometrica {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2.0;
    }
}

