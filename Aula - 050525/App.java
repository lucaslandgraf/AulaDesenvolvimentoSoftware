import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Contas!!");
		
		Conta c1 = new Conta(100.0);
		ContaCorrente c2 = new ContaCorrente(100.0);
		
		c1.depositar(100);
		c1.atualizaSaldo(10);
		
		c2.depositar(100);
		c2.atualizaSaldo(10);
		
		System.out.println("Saldo em C1 é: " + c1.getSaldo());
		System.out.println("Saldo em C2 é: " + c2.getSaldo());
	}
	
}
