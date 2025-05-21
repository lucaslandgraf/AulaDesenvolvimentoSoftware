
public class Bicicleta implements Veiculo{

private String ambiente;
	
	public Bicicleta() {}
	
	public Bicicleta(String ambiente) {
		this.ambiente = ambiente;
	}
	
	@Override
	public void acelerar() {
		System.out.println("Clept Clept");
	}
	
	@Override
	public void frear() {
		System.out.println("Frei. And . o");
	}
	
	@Override
	public String obterTipo() {
		return "Bicicleta";
	}
	

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public String toString() {
		return "\nBicicleta - \nAmbiente:"+this.ambiente;
	}
	
}
