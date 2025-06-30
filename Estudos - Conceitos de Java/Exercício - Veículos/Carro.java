import java.util.Scanner;

public class Carro extends Veiculos {
	private double km;
	
	public Carro(String modelo, double preco, double km) {
		super(modelo, preco);
		this.km = km;
	}

	
	
	@Override
	public double getPreco() {
		return preco;
	}
	
	public double getKm() {
		return km;
	}

	
	
	public void setKm(double km) {
		this.km = km;
	}
	
	
    public void insertData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o modelo do carro: ");
        modelo = sc.nextLine();
        System.out.print("Digite o preço do carro: ");
        preco = sc.nextDouble();
        System.out.print("Digite a quilometragem do carro: ");
        km = sc.nextDouble();
        sc.nextLine(); // limpar buffer
    }
	
	@Override
	public void printDados() {
		super.printDados();
		System.out.println("Quilometragem é: "+ km);
	}
	
	
}
