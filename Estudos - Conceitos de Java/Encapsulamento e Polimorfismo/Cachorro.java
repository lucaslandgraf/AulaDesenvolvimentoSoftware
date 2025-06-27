package exercigt;

public class Cachorro extends Animal{
	
	public Cachorro(String nome) {
		super(nome);
	}
	
	@Override
	String fazerSom() {
		return "AU AU AU";
	}
	
	String exibirNome() {
		return "O nome do cão é: "+ nome;
	}
}	
