import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Instanciando um triângulo com altura 3.5, largura 5 e nome "Piramide"
        Triangulo triangulo = new Triangulo(3.5, 5, "Piramide");

        // Exibindo as propriedades do triângulo
        System.out.println(triangulo);

        // Calculando e exibindo a área do triângulo
        System.out.println("Área do triângulo: " + triangulo.calculaArea());

        // Exemplo de interação com o usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nova altura do triângulo: ");
        double novaAltura = scanner.nextDouble();
        triangulo.setAltura(novaAltura);
        System.out.println("Novo valor da altura: " + triangulo.getAltura());
        scanner.close();
    }
}
