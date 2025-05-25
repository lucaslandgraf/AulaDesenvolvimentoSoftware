
public class ContaExcecao extends Exception {
	
	public void saldoInsuficiente() throws Exception{
		throw new Exception("O saldo é insuficiente para o saque");
		
	}
}
