
public class App {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.SetNome("Bob Esponja");
		pessoa.SetIdade(16);
		pessoa.SetAltura(1.74);
		
		
		System.out.println(pessoa.GetNome());
		System.out.println(pessoa.GetIdade());
		System.out.println(pessoa.GetAltura());
		
	}
}
