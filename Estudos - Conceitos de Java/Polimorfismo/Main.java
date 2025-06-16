
public class Main {
	public static void main(String[] args) {
		Animal c1 = new Cachorro();
		Animal g1 = new Gato();
		
		System.out.println("O som do cachorro é: "+ c1.emitirSom());
		System.out.println("O som do gato é: "+ g1.emitirSom());
	}
}
