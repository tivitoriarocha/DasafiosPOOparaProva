package Desafio1;

import java.lang.Math;

public class Circulo extends Forma{

    private double raio;
    Double pi =  Math.PI;

    public Circulo(String nome, double raio) {
        super("Circulo");
        this.raio = raio;
    }

    //Lembrete Círculo: Área = π x raio², Perímetro = 2 x π x raio.

    @Override
    public double calcularArea() {
        System.out.println("A Área do Círculo é:");
        return (raio*raio)*pi;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("O Perímetro é: ");
        return 2*pi*raio;
    }
}
