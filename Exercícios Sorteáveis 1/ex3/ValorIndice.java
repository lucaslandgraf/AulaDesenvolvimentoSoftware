import java.util.Scanner;

public class ValorIndice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o índice de poluição: ");
        float valorLido = scan.nextFloat();

        Poluicao poluicao = new Poluicao();  // Cria objeto
        poluicao.setIndice(valorLido);       // Define valor do índice

        String resultado = poluicao.verificarAviso();  // Chama método que analisa
        System.out.println("Resultado: " + resultado);

        scan.close();
    }
}
