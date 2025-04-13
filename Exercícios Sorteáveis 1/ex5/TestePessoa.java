import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o CPF (apenas números, 11 dígitos): ");
        String cpf = scan.nextLine();

        System.out.println("Informe a idade: ");
        int idade = scan.nextInt();

        // Cria a pessoa com os dados informados
        Pessoa pessoaInformada = new Pessoa(cpf, idade);

        // Mostra os dados
        System.out.println("Pessoa criada:");
        System.out.println("CPF: " + pessoaInformada.getCpf());
        System.out.println("Idade: " + pessoaInformada.getIdade());

        scan.close();
    }
}
