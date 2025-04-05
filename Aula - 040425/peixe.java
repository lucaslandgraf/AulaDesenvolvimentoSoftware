import java.lang.classfile.Superclass;

public class peixe {
	private String ambiente;
	private int tamanho;
	
	public peixe() {}
	public peixe(String nome, float peso, int recinto, String local, boolean migracao, String ambiente, int tamanho) {
		super(nome, peso, recinto, local, migracao);
		this.ambiente = ambiente;
		this.tamanho = tamanho;
	}
	
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String local) {
		this.ambiente = ambiente;
	}
	public int setTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
