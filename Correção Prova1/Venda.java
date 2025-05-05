import java.util.ArrayList;

public class Venda {
    private int notaFiscal;
    private String nomeCliente;
    private ArrayList<Produto> produtos;
    
    public Venda() {
    }

    public int getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public String toString() {
        return "Venda \n NF: " + this.notaFiscal + " Cliente: " + this.nomeCliente + " Produtos: " + this.produtos;
    }
}
