import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o modelo do carro");
        String tipo = scan.next();
        System.out.println("Digite a placa do carro");
        String placa = scan.next();
        System.out.println("Digite a cor do carro");
        String cor = scan.next();
        System.out.println("Digite o número de portas do carro");
        int num_portas = scan.nextInt();

        Carro car = new Carro(tipo, placa, cor, num_portas);
        System.out.println(car.toString()); // Imprime o estado do objeto

        Carro car2 = new Carro();
        System.out.println(car2.toString());

		scan.close();
    }
}
