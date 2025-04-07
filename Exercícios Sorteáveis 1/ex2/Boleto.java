public class Boleto {
    private float valor;
    private float dias;

    public Boleto() {}

    public Boleto(float valor, float dias) {
        this.valor = valor;
        this.dias = dias;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getDias() {
        return this.dias;
    }

    public void setDias(float dias) {
        this.dias = dias;
    }

    public float calcularMulta() {
        return this.valor * 0.05f; // 5% de multa
    }

    public float calcularValorFinal() {
        float valorComMulta = this.valor + calcularMulta();
        float valorFinal = (float)(valorComMulta * Math.pow(1.01, this.dias)); // juros compostos
        return valorFinal;
    }
}
