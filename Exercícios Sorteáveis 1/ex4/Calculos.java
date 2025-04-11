public class Calculos {
    private Pessoa[] pessoas = new Pessoa[100]; // Limite de 100 habitantes
    private int quantidade = 0;

    public void adicionarPessoa(Pessoa p) {
        if (quantidade < pessoas.length) {
            pessoas[quantidade] = p;
            quantidade++;
        } else {
            System.out.println("Limite de pessoas atingido.");
        }
    }

    public float mediaSalario() {
        if (quantidade == 0) return 0;
        float soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma += pessoas[i].getRenda();
        }
        return soma / quantidade;
    }

    public int maiorIdade() {
        int maior = 0;
        for (int i = 0; i < quantidade; i++) {
            if (pessoas[i].getIdade() > maior) {
                maior = pessoas[i].getIdade();
            }
        }
        return maior;
    }

    public int menorIdade() {
        if (quantidade == 0) return 0;
        int menor = pessoas[0].getIdade();
        for (int i = 1; i < quantidade; i++) {
            if (pessoas[i].getIdade() < menor) {
                menor = pessoas[i].getIdade();
            }
        }
        return menor;
    }

    public int homensComSalarioAteMil() {
        int cont = 0;
        for (int i = 0; i < quantidade; i++) {
            if (pessoas[i].getGenero().equals("M") && pessoas[i].getRenda() <= 1000) {
                cont++;
            }
        }
        return cont;
    }

    public int quantidadeMulheres() {
        int cont = 0;
        for (int i = 0; i < quantidade; i++) {
            if (pessoas[i].getGenero().equals("F")) {
                cont++;
            }
        }
        return cont;
    }
}
