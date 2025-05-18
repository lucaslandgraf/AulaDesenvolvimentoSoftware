public abstract class Forma2D {
    private double altura;
    private double largura;
    private String nome;

    // Construtor com parâmetros
    public Forma2D(double altura, double largura, String nome) {
        this.altura = altura;
        this.largura = largura;
        this.nome = nome;
    }

    // Métodos getter
    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public String getNome() {
        return nome;
    }

    // Método setter para altura
    protected void setAltura(double altura) {
        this.altura = altura;
    }

    // Método abstrato
    public abstract double calculaArea();

    @Override
    public String toString() {
        return "Nome: " + nome + "\nAltura: " + altura + "\nLargura: " + largura;
    }
}
