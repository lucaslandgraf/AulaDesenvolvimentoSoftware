import java.util.Scanner;

public class Pesquisa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculos calculos = new Calculos();
        int opcao;

        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1 - Registrar habitante");
            System.out.println("2 - Ver média salarial");
            System.out.println("3 - Ver maior idade");
            System.out.println("4 - Ver menor idade");
            System.out.println("5 - Homens com salário até R$1000");
            System.out.println("6 - Quantidade de mulheres");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine(); // Limpa

            switch (opcao) {
                case 1:
                    System.out.print("Idade: ");
                    int idade = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Gênero (M/F): ");
                    String genero = scan.nextLine();

                    System.out.print("Renda: ");
                    float renda = scan.nextFloat();

                    Pessoa p = new Pessoa(idade, genero, renda);
                    calculos.adicionarPessoa(p);
                    break;
                case 2:
                    System.out.printf("Média salarial: R$ %.2f\n", calculos.mediaSalario());
                    break;
                case 3:
                    System.out.println("Maior idade: " + calculos.maiorIdade());
                    break;
                case 4:
                    System.out.println("Menor idade: " + calculos.menorIdade());
                    break;
                case 5:
                    System.out.println("Homens com salário até R$1000: " + calculos.homensComSalarioAteMil());
                    break;
                case 6:
                    System.out.println("Quantidade de mulheres: " + calculos.quantidadeMulheres());
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scan.close();
    }
}
