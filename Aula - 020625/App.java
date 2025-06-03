
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File arquivo = new File(); 
		String nome = "sair";
		do{
			Pessoa p1 = new Pessoa();
			System.out.println("Digite o nome da Pessoa ou 'sair' para encerrar");
			nome = sc.nextLine();
			if(!nome.equals("sair")){
				p1.setNome(nome);
				System.out.println("Digite o e-mail da Pessoa:");
				p1.setEmail(sc.nextLine());
				arquivo.writeInsertStatement(p1.toStringSql());
			}
		}

		while(nome.equals("sair"));
		sc.close();
	}
}
