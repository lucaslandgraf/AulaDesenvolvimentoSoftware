public class Circulo extends Forma2D {

    public Circulo() {
        super();
    }

    public Circulo(double raio, String nome) {
        // altura e largura iguais para um círculo, representando o raio
        super(raio, raio, nome);
    }

    @Override
    public double calculaArea() {
        return 3.14 * Math.pow(getLargura(), 2); // largura = raio
    }
}
