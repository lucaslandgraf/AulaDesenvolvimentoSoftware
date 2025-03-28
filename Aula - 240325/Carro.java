public class Carro {
	private String tipo;
	private String cor;
	private String	placa;
	private int num_portas;
	
	// Get e Set
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;                                                  
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getnum_portas() {
		return this.num_portas;
	}
	
	public void setnum_portas(int string) {
		this.num_portas = string;
	}
	
	public void ligar() {
		System.out.println("Carro ligado!");
	}
	
	public void desligar() {
		System.out.println("Carro desligado");
	}
	
	public void acelerar() {
		System.out.println("Carro Acelerando");
		
	}
	
	public void frear() {
		System.out.println("Carro freando");
	}
}                                                    

