
public class Calculadora {
	private int num1;
	private int num2;
	
	// Construtores
	
	public Calculadora() { // Sem parâmetros
		
	}
	
	public Calculadora(int n1, int n2) { // com parâmetros
		this.num1 = n1; 
		this.num2 = n2;
	}
	
	
	// Getters e Setters
	public int getNum1() {
		return this.num1;
	}
	
	public void setNum1(int num1){
		this.num1 = num1;
	}
	
	public int getNum2() {
		return this.num2;
	}
	
	public void setNum2(int num2){
		this.num2 = num2;
	}
	
	// Métodos da classe
	
	public int calculaSoma() {
		return this.num1 + this.num2;
	}
	
	public int subtracao() {
		return this.num1 - this.num2;
	}
	
	public int multiplicacao() {
		return this.num1 * num2;
	}
	
	public float divisao() {
		return (float) this.num1 / this.num2;
	}
	
	
}
