
public class Pessoa {
	private String nome = "João";
	private int idade = 14;
	private double altura = 1.67;
	
	
	// Get pega
	public String GetNome() {
		return nome;
	}
	
	// Set modifica
	public void SetNome(String nome) {
		this.nome = nome;
	}
	
	public int GetIdade() {
		return idade;
	}
	
	public void SetIdade(int idade) {
		this.idade = idade;
	}
	
	public double GetAltura() {
		return altura;
	}
	
	public void SetAltura(double altura) {
		this.altura = altura;
	}
}
