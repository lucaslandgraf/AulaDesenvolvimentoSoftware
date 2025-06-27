package exercigt;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Animal> animais = new ArrayList<>();
		int i = 0;
		
		while(true) {
			System.out.println("1 - Adicionar cachorro");
			System.out.println("2 - Adicionar Gato");
			System.out.println("3 - Mostrar todos os animais");
			System.out.println("4 - Sair");
			System.out.println("Escolha uma opção");
			
			int opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Qual o nome do animal: ");
				String nomeCao = sc.nextLine();
				animais.add(new Cachorro(nomeCao));
				break;
			case 2:
				System.out.println("Qual o nome do animal: ");
				String nomeGato = sc.nextLine();
				animais.add(new Gato(nomeGato));
				break;
			case 3:
				System.out.println("Lista dos animais: ");
				for(Animal a : animais ) {
					i++;
					System.out.println("Animal de numero "+ i + " Com nome " + a.nome + " disse: " + a.fazerSom());
				}
				break;
			case 4:
				System.out.println("Saindo...");
				sc.close();
				return;
			}
		}

	}
}
