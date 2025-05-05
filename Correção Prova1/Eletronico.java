public class Eletronico extends Produto {
    private int voltagem;
    private String fonteDeEnergia;
    
    public int getVoltagem() {
        return voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    public String getFonteDeEnergia() {
        return fonteDeEnergia;
    }
    public void setFonteDeEnergia(String fonteDeEnergia) {
        this.fonteDeEnergia = fonteDeEnergia;
    }
    
    public String toString() {
        return super.toString() + " Voltagem: " + this.voltagem + " Fonte de Energia: " + this.fonteDeEnergia;
    }
}
