import java.util.Scanner;

public class Menu {

	
	public static Animal cadastraAnimal() {
		Scanner scan = new Scanner(System.in);
		Animal animal1 = new Animal();
		System.out.println("Digite o nome do animal");
		animal1.setNome(scan.next());
		System.out.println("Digite o peso do animal");
		animal1.setPeso(scan.nextFloat());
		System.out.println("Digite o numero do recinto do animal");
		animal1.setRecinto(scan.nextInt());
		System.out.println("Quantas vezes deseja emitir o som do animal?");
		animal1.emitirSom(scan.nextInt());
		System.out.println(animal1.toString());
		scan.close();
		return animal1;
	}
}
