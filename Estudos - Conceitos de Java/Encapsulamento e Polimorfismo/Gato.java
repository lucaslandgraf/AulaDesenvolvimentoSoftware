package exercigt;

public class Gato extends Animal {
	
	public Gato(String nome) {
		super(nome);
	}

	@Override
	String fazerSom() {
		return "MIAU MIAU MIAU";
	}
	
	String exibirNome() {
		return "O nome do gato é: "+ nome;
	}
}
