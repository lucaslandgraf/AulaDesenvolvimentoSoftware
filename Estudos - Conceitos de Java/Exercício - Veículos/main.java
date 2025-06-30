import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculos> cadastro = new ArrayList<>();

        while (true) {
            System.out.println("\nEscolha o tipo de veiculo");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Listar veículos");
            System.out.println("4 - Levantamento de valores");
            System.out.println("5 - Sair");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    Carro carro = new Carro("", 0, 0);
                    carro.insertData();
                    cadastro.add(carro);
                    break;

                case 2:
                    Moto moto = new Moto("", 0, 0);
                    moto.insertData();
                    cadastro.add(moto);
                    break;

                case 3:
                    for (Veiculos v : cadastro) {
                        v.printDados();
                        System.out.println();
                    }
                    break;

                case 4:
                    double totalAntes = 0;
                    double totalDepois = 0;

                    // Soma os valores antes dos ajustes
                    for (Veiculos v : cadastro) {
                        totalAntes += v.getPreco();
                    }

                    // Aplica os ajustes
                    for (Veiculos v : cadastro) {
                        if (v instanceof Moto) {
                            Moto m = (Moto) v;
                            if (m.getAno() >= 2008) {
                                double precoAntigo = m.getPreco();
                                double novoPreco = precoAntigo * 1.10;
                                m.setPreco(novoPreco);
                                System.out.printf("Moto %s: R$ %.2f → R$ %.2f (ajustada)\n", m.getModelo(), precoAntigo, novoPreco);
                            }
                        } else if (v instanceof Carro) {
                            Carro c = (Carro) v;
                            if (c.getKm() > 100000) {
                                double precoAntigo = c.getPreco();
                                double novoPreco = precoAntigo * 0.92;
                                c.setPreco(novoPreco);
                                System.out.printf("Carro %s: R$ %.2f → R$ %.2f (ajustado)\n", c.getModelo(), precoAntigo, novoPreco);
                            }
                        }
                    }

                    // Soma os valores depois dos ajustes
                    for (Veiculos v : cadastro) {
                        totalDepois += v.getPreco();
                    }

                    System.out.printf("Total antes dos ajustes: R$ %.2f\n", totalAntes);
                    System.out.printf("Total depois dos ajustes: R$ %.2f\n", totalDepois);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
