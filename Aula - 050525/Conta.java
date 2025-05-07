
public class Conta {
	private double saldo;
	private double taxa;
	
	public Conta() {}
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", taxa=" + taxa + "]";
	}

	// Sacar
	
	public boolean sacar(double valorDeSaque) {
		boolean isOk = false;
		if(valorDeSaque <= saldo) {
			saldo -= valorDeSaque;
			isOk = true;
		}
		return isOk;
	}
	
	
	// Depositar
	
	public boolean depositar(double valorDeposito) {
		boolean isOk = false;
		if(valorDeposito > 0) {
			this.saldo += valorDeposito;
			isOk = true;
		}
		return isOk;
	}
	
	// Atualiza Saldo
	
	public boolean atualizaSaldo(double taxa) {
		boolean isOk = false;
		if(taxa >= 1 && taxa <= 100) {
			this.saldo += this.saldo * (taxa/100);
			isOk = true;
		}
		return isOk;
	}
	
}
