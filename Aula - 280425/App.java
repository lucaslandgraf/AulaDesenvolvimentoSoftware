import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		Animal animal1 = new Animal("Gato", 0.2, 0);
		System.out.println(animal1.toString());
		animal1.mover();
		System.out.println(animal1.toString());
		System.out.println("\n\n ----- PEIXE ----- \n\n");
		
		
		Peixe peixe1 = new Peixe("Nemo", 0.1, 5, false);
		System.out.println(peixe1.toString() + "\n");
		peixe1.mover();
		System.out.println(peixe1.toString() + "\n");
		
		System.out.println("\n\n ----- PASSÁRO ----- \n\n");
		Passaro passaro1 = new Passaro("Pica-Pau", 2.1, 7);
		System.out.println(passaro1.toString() + "\n");
		passaro1.mover();
		System.out.println(passaro1.toString() + "\n");
		
		// Lista de animais
		System.out.println("\n \n \n");
		ArrayList<Animal> listAnimais = new ArrayList<>();
		listAnimais.add(animal1);
		listAnimais.add(peixe1);
		listAnimais.add(passaro1);
		
		
		/*
		for(Animal a : listAnimais) {
			if(a instanceof Peixe) {
				Peixe p = (Peixe)a;
				p.nadar();
			}else if(a instanceof Passaro) {
				((Passaro) a).voar();
			}else {
				a.mover();
			}
		}
		*/
		
		// Existe uma maneira uma maneira melhor de gerenciar essa lista?
		// --- POLIMORFISMO --- 
		
		for(Animal a : listAnimais) {
			a.mover();
		}
		
	}
}
