import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Boleto boleto1 = new Boleto();

        System.out.print("Digite o valor do boleto: R$ ");
        boleto1.setValor(scan.nextFloat());

        System.out.print("Digite a quantidade de dias de atraso: ");
        boleto1.setDias(scan.nextFloat());

        System.out.printf("Valor da multa (5%%): R$ %.2f\n", boleto1.calcularMulta());
        System.out.printf("Valor total com multa e juros: R$ %.2f\n", boleto1.calcularValorFinal());

        scan.close();
    }
}
