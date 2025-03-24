import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Cria leitor de input padrão (teclado)
		int option = 0;
		System.out.println("Digite sua opção:  1, 2 ou 3: ");
		option = scan.nextInt(); // Ler inteiro digitado
		switch(option) {
		case 1:
			System.out.println("Bom dia");
			break;
		case 2:
			System.out.println("Boa tarde");
			break;
		case 3:
			System.out.println("Boa noite");
			break;
		default:
			System.out.println("Número inválido");
				
		}
	}
}
