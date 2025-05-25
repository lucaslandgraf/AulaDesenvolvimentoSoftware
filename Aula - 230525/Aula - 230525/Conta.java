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

    // Método para sacar
    public boolean sacar(double valorDeSaque) {
        boolean isOk = false;
        try {
            // Verifica se o valor do saque é válido (não negativo e menor ou igual ao saldo)
            if (valorDeSaque <= 0) {
                throw new IllegalArgumentException("Valor de saque deve ser positivo.");
            }
            if (valorDeSaque > saldo) {
                throw new IllegalArgumentException("Saldo insuficiente.");
            }

            // Realiza o saque
            saldo -= valorDeSaque;
            isOk = true;

        } catch (IllegalArgumentException e) {
            // Trata a exceção
            System.out.println("Erro no saque: " + e.getMessage());
        } catch (Exception e) {
            // Captura qualquer outro tipo de exceção
            System.out.println("Ocorreu um erro inesperado no saque.");
        }
        return isOk;
    }

    // Método para depositar
    public boolean depositar(double valorDeposito) {
        boolean isOk = false;
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            isOk = true;
        }
        return isOk;
    }

    // Método para atualizar o saldo com base na taxa
    public boolean atualizaSaldo(double taxa) {
        boolean isOk = false;
        if (taxa >= 1 && taxa <= 100) {
            this.saldo += this.saldo * (taxa / 100);
            isOk = true;
        }
        return isOk;
    }
}
