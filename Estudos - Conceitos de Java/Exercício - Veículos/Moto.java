import java.util.Scanner;

public class Moto extends Veiculos {
	private int ano;
	
	public Moto(String modelo, double preco, int ano) {
		super(modelo, preco);
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public double getPreco() {
		return preco;
	}

	
	   public void insertData() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o modelo da moto: ");
	        modelo = sc.nextLine();
	        System.out.print("Digite o preço da moto: ");
	        preco = sc.nextDouble();
	        System.out.print("Digite o ano da moto: ");
	        ano = sc.nextInt();
	        sc.nextLine(); // limpar buffer
	    }
	
	@Override
	public void printDados() {
		super.printDados();
		System.out.println("O ano é: "+ ano);
	}
}
