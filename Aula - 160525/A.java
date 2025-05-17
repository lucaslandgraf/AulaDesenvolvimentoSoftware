
// final class A { // Impede que outras classes herdam A

public class A {
	public int quantidade;
	
	final void metodo() {
		System.out.println("Método final");	
		
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}


// No 'final' o atributo não pode ser editado, o método não pode ser sobrescrito e na classe impede herança
