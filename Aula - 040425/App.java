import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		ArrayList<Animal> listaAnimais = new ArrayList<>();
		listaAnimais.add(Menu.cadastraAnimal());
		
		
		
		// ------------------------------------------------------------------------------ //
		
		Scanner scan = new Scanner(System.in);
		Ave ave1 = new Ave();
		System.out.println("Digite o nome da ave");
		ave1.setNome(scan.next());
		System.out.println("Digite o peso da ave");
		ave1.setPeso(scan.nextFloat());
		System.out.println("Digite o numero do recinto da ave: ");
		ave1.setRecinto(scan.nextInt());
		System.out.println("Digite o local nativo da ave: ");
		ave1.setLocal(scan.next());
		System.out.println("A ave " + ave1.getNome() + " migra? Digite sim ou não");
		String migra = scan.next();
		if(migra.equalsIgnoreCase("sim")) {
			ave1.setMigracao(true);
		}else if(migra.equalsIgnoreCase("não")){
			ave1.setMigracao(false);
		}else{
			System.out.println("Valor inválido, migração foi editado como não");
			ave1.setMigracao(false);
		}
		
		System.out.println("Quantas vezes deseja emitir o som da ave?");
		ave1.emitirSom(scan.nextInt());
		
 
		scan.close();
	}
}
