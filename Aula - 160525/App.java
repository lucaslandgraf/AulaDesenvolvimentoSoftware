import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	
    	Pessoa p1 = new Pessoa("João");
    	Pessoa p2 = new Pessoa();
    	Pessoa p3 = new Pessoa("Peterson");
    	
    	System.out.println(p1.toString());
    	System.out.println(p2.toString());
    	System.out.println(p3.toString());
    	
        /* Criando uma instância de Triangulo com altura 3.5, largura 5 e nome "Piramide"
        Triangulo triangulo = new Triangulo(3.5, 5, "Piramide");

        // Exibindo as propriedades do triângulo
        System.out.println(triangulo);

        // Calculando e exibindo a área do triângulo
        System.out.println("Área do triângulo: " + triangulo.calculaArea());
        
     	*/
    }
}