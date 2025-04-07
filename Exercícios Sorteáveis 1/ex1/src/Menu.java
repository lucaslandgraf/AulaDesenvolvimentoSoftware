import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rendimento rendimento = new Rendimento();
        int opcao;

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar venda");
            System.out.println("2 - Consultar imposto a pagar no mês");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor da venda do dia: R$ ");
                    float valor = scan.nextFloat();
                    rendimento.adicionarVenda(valor);
                    break;

                case 2:
                    float excesso = rendimento.getExcessoTotal();
                    float multa = rendimento.getMultaTotal();
                    System.out.printf("Total de excesso no mês: R$ %.2f\n", excesso);
                    System.out.printf("Total de multa a pagar: R$ %.2f\n", multa);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scan.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
