
public class Caminhao implements Veiculo {

private double capacidadeCarga;
	
	public Caminhao() {}
	
	public Caminhao(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
	@Override
	public void acelerar() {
		System.out.println("Vruuum Vruuuum");
	}
	
	@Override
	public void frear() {
		System.out.println("Frando...");
	}
	
	@Override
	public String obterTipo() {
		return "Caminhao";
	}
	

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public String toString() {
		return "\nCaminhão - \nCapacidade:"+this.capacidadeCarga;
	}
	
	
}
