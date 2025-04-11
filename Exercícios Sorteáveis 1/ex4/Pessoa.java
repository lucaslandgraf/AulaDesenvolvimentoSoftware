public class Pessoa {
    private int idade;
    private String genero;
    private float renda;

    public Pessoa(int idade, String genero, float renda) {
        this.idade = idade;
        this.genero = genero.toUpperCase(); // Pra padronizar
        this.renda = renda;
    }

    public int getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public float getRenda() {
        return renda;
    }
}
