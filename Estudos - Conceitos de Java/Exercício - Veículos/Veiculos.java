
public class Veiculos {
	protected String modelo;
	protected double preco;
	
	public Veiculos(String modelo, double preco) {
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void printDados() {
		System.out.println("O modelo é: "+ modelo);
		System.out.println("O preco é: "+ preco);
	}
}
