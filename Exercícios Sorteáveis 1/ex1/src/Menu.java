/* 1 Imposto a pagar
Um trabalhador autônomo deseja controlar suas finanças, comprou um microcomputador
para controlar o rendimento diário de seu trabalho.
• Toda vez que ele vende um valor maior que o estabelecido pelo regulamento de MEI do
estado onde vive (500,00 R$ dia) deve pagar um multa de R$ 0,10 a cada Real excedente.
• Este trabalhador precisa que você faça um programa em Java que leia o valor de todas
as vendas do mês e verifique se há excesso (vendeu mais de 500,00 por dia).
• Se houver excesso, gravar na variável E (Excesso) e na variável M o valor da multa que
o Trabalhador deverá pagar.
• Caso contrário mostrar tais variáveis com o conteúdo ZERO.
Desenvolva uma aplicação Java Orientada a Objetos e as classes necessárias para resolver o
problema.
O sistema deve conter um menu com no mínimo as seguintes opções
1 - cadastro de vendas
2 - consulta de imposto a pagar no mês (com base no mês e no ano das vendas).
0 - Sair */

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
