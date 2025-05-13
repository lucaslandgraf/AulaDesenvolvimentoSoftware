public abstract class Forma2D {
    private double altura;
    private double largura;
    private String nome;

    // Método abstrato
    public abstract double calculaArea();

    // Construtor vazio
    public Forma2D() {
        this.largura = this.altura = 0.0;
        this.nome = "nada";
    }

    // Construtor com parâmetros
    public Forma2D(double altura, double largura, String nome) {
        this.largura = largura;
        this.altura = altura;
        this.nome = nome;
    }

    // Getters e Setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
	public String toString() {
		return "Nome: " + this.nome + "\n" + "Altura: "+ this.altura + "\n" + "Largura: "+ this.largura;
	}
}
