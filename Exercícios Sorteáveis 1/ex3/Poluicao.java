public class Poluicao {
    private float indice;

    public Poluicao() {}

    public Poluicao(float indice) {
        this.indice = indice;
    }

    public float getIndice() {
        return this.indice;
    }

    public void setIndice(float indice) {
        this.indice = indice;
    }

    public String verificarAviso() {
        if (indice >= 0.5) {
            return "Todos os grupos devem ser notificados a paralisarem suas atividades.";
        } else if (indice >= 0.4) {
            return "As indústrias do 1º e 2º grupo devem suspender suas atividades.";
        } else if (indice >= 0.25) {
            return "As indústrias do 1º grupo devem reduzir 50% de suas atividades.";
        } else if (indice >= 0.06 && indice <= 0.16) {
            return "Índice aceitável.";
        } else {
            return "Índice fora dos parâmetros estabelecidos.";
        }
    }
}
