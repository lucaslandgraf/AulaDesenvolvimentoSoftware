
public class Animal {
	private String nome;
	private float peso;
	private int recinto;
	
	//Construtores
	
	public Animal(String nome, float peso, int recinto) {
		this.nome = nome;
		this.peso = peso;
		this.recinto = recinto;
	}
	
	public Animal() {}
	
	
	//Getters e Setters
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
	}



	public int getRecinto() {
		return recinto;
	}



	public void setRecinto(int recinto) {
		this.recinto = recinto;
	}

		
		public void emitirSom(int quantidade) {
			for(int i = 1; i <= quantidade; i++) {
				System.out.print("muuuuu ");
			}
			System.out.println("");
		}
	
		@Override
		public String toString() {
			return "Nome: " + this.nome + "\n"+ "Peso: " + this.peso + "\n" + "Recinto: " + this.recinto;
		}
}
