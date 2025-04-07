public class Rendimento {
    private float[] vendas;
    private int contadorDias;

    public Rendimento() {
        vendas = new float[31]; // Considerando 31 dias no mês
        contadorDias = 0;
    }

    public void adicionarVenda(float valor) {
        if (contadorDias < vendas.length) {
            vendas[contadorDias] = valor;
            contadorDias++;
        } else {
            System.out.println("Limite de dias atingido.");
        }
    }

    public float getMultaTotal() {
        float multa = 0;
        for (int i = 0; i < contadorDias; i++) {
            if (vendas[i] > 500) {
                float excesso = vendas[i] - 500;
                multa += excesso * 0.10f;
            }
        }
        return multa;
    }

    public float getExcessoTotal() {
        float excessoTotal = 0;
        for (int i = 0; i < contadorDias; i++) {
            if (vendas[i] > 500) {
                excessoTotal += vendas[i] - 500;
            }
        }
        return excessoTotal;
    }
}
