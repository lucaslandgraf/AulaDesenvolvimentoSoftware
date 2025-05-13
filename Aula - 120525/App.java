import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(3.5, 5, "Sala");
        System.out.println(retangulo);
        System.out.println("Área do retângulo: " + retangulo.calculaArea());

        System.out.println();

        Circulo circulo = new Circulo(2, "Roda");
        System.out.println(circulo);
        System.out.println("Área do círculo: " + circulo.calculaArea());
        // Menu para cadastrar, editar e listar formas
        ArrayList<Forma2D> formas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String menu = "\n---- Formas 2D ---- \n"+ "1 - Cadastrar Formas \n" + "2 - Listar Formas \n" + "3 - Editar Formas \n" + "4 - Excluir Forma \n" + "0 - Sair \n\n Digite a opção";
        
        int option = 0;
        do {
        	System.out.println(menu);
        	option = sc.nextInt();
        	switch(option) {
        	case 1:
        	    System.out.println("Qual forma deseja cadastrar?\n1 - Retângulo \n2 - Círculo");
        	    int forma = sc.nextInt();
        	    
        	    System.out.println("Digite a altura da forma:");
        	    double h = sc.nextDouble();
        	    
        	    System.out.println("Digite a largura da forma:");
        	    double w = sc.nextDouble();
        	    
        	    sc.nextLine(); // limpar buffer
        	    System.out.println("Digite o nome da forma:");
        	    String n = sc.nextLine();
        	    
        	    if (forma == 1) {
        	        formas.add(new Retangulo(h, w, n));
        	    } else if (forma == 2) {
        	        formas.add(new Circulo(w / 2, n)); // usa largura como diâmetro
        	    } else {
        	        System.out.println("Forma inválida.");
        	    }

        		System.out.println(formas.size() + " Formas2D cadastradas!");
        		break;
        	default:
        		System.out.println("Número Inválido");
        	}
        }while(option != 0);
        sc.close();
    }
}
