
public class Carro implements Veiculo {
	
	private String modelo;
	
	public Carro() {}
	
	public Carro(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public void acelerar() {
		System.out.println("Vrum Vrum");
	}
	
	@Override
	public void frear() {
		System.out.println("Freiando. . .");
	}
	
	@Override
	public String obterTipo() {
		return "Carro";
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String toString() {
		return "\nCarro - \nModelo:"+this.modelo;
	}
	
}
