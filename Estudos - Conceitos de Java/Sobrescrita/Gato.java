
public class Gato extends Animal {
	
	
	// OBS - SEM ESSA SOBRESCRITA DE METODO OVERRIDE O TEXTO NA MAIN SERIA "Som Genérico"
	@Override
	public void emitirSom() {
		System.out.println("MIAU MIAU MIAU");
	}
	
}
