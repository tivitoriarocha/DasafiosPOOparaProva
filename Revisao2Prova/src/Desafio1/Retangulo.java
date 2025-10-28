package Desafio1;

public class Retangulo extends Forma{

    private double largura, altura;

    public Retangulo(String nome, double largura, double altura) {
        super("Retângulo");
        this.altura = altura;
        this.largura = largura;
    }

    //Lembrete Retângulo: Área = largura x altura, Perímetro = 2 x (largura + altura)


    @Override
    public double calcularArea() {
        System.out.println("A Área total é: ");
        return largura* altura;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("O Perímetro é: ");
        return 2*(largura*altura);
    }
}
