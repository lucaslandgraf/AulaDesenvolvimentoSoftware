public class Pessoa {
    private static int qtd;
    private int id;
    private String nome;

    // Construtor sem parâmetros
    public Pessoa() {
        this.qtd++;
        this.id = this.qtd;
        this.nome = "Desconhecido"; // Valor padrão
    }

    // Construtor com um parâmetro
    public Pessoa(String nome) {
        this.qtd++;
        this.id = this.qtd;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa\n [id: " + this.id + " - Nome: " + this.nome + "] \n static qtd: " + this.qtd;
    }
}