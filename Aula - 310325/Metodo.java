import javax.swing.JOptionPane;

public class Metodo {
	public static void main(String[] args) {
		
		Calculadora calc1 = new Calculadora();
		String digitado = JOptionPane.showInputDialog("Digite o primeiro número:");
		calc1.setNum1(Integer.parseInt(digitado));
		
		digitado = null;
		digitado = JOptionPane.showInputDialog("Digite outro número:");
		calc1.setNum2(Integer.parseInt(digitado));
		
		JOptionPane.showMessageDialog(null, "-- Cálculos ----- \n" + 
				calc1.getNum1() +" + " + calc1.getNum2() + " = " + calc1.calculaSoma() + "\n"
				+ calc1.getNum1() +" - " + calc1.getNum2() + " = " + calc1.subtracao() + "\n"
				+ calc1.getNum1( )+" * " + calc1.getNum2() + " = " + calc1.multiplicacao() + "\n"
				+ calc1.getNum1( )+" / " + calc1.getNum2() + " = " + calc1.divisao() + "\n");
		
		JOptionPane.showMessageDialog(null, "-- Cálculos ---- \n" + 
									"SOMA: " + calc1.calculaSoma() + "\n" +
									"SUBTRAÇÃO: " + calc1.subtracao() + "\n" +
									"MULTIPLICAÇÃO: " + calc1.multiplicacao() + "\n" +
									"DIVISÃO: " + calc1.divisao() + "\n");
	}
}
