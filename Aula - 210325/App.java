import javax.swing.JOptionPane;

public class App {
public static void main(String[] args) throws Exception{

// Aqui vai o código ClasseObjeto.java

Carro c1;

// instanciação do objeto c1 que pertence a classe carro

c1 = new Carro(); 

c1.tipo = "Gol";

c1.cor = "Preto";

c1.placa = "OBP4J41";

c1.num_portas = 5;

c1.ligar();

Carro c2 = new Carro(); // Declaração + instanciação do objeto c2

c2.tipo = JOptionPane.showInputDialog("Digite o modelo do carro");

c2.cor = JOptionPane.showInputDialog("Digite a cor do carro");

c2.placa = JOptionPane.showInputDialog("Digite a placa do carro");

// String n = JOptionPane.showInputDialog("Digite o número de portas do carro");

// c2.num_portas = Integer.parseInt(n);

c2.num_portas = Integer.parseInt(

JOptionPane.showInputDialog("Digite o número de portas"));

JOptionPane.showMessageDialog(null, "--- Carro --- \n" + "Tipo: " + c2.tipo + "\n" + "Cor: " + c2.cor + "\n" + "Placa: " + c2.placa + "\n" + "Número de portas: " + c2.num_portas);

}

}