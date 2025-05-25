/*
 * Suponha que o método "saca" da classe Conta vai ser rescrito de forma a lançar uma exceção criada por você, 
 * cuja classe é ContaExcecao (extends Exception). A exceção é lançada sempre que o saldo da conta for inferior ao valor sacado. 
 * Implemente a classe ContaExcecao. Implemente o método saca que lança a exceção. 
 * E rescreva o código da caixa com o devido tratamento da exceção.
 */


public class Conta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double saque) {
		if(saque > this.saldo) {
			ContaExcecao ce = new ContaExcecao();
			try {
				ce.saldoInsuficiente();
			}catch(Exception e) {
				System.out.println("Erro! \n" + e);
			}
		}
	}
}
