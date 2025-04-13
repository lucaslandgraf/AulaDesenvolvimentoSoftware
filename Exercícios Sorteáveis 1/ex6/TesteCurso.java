import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Instrutor
        System.out.println("Informe os dados do Instrutor:");
        System.out.print("Nome: ");
        String nomeInstrutor = scan.nextLine();

        System.out.print("CPF (11 dígitos): ");
        String cpfInstrutor = scan.nextLine();

        System.out.print("Idade: ");
        int idadeInstrutor = scan.nextInt();
        scan.nextLine(); // limpar quebra de linha

        Instrutor instrutor = new Instrutor(nomeInstrutor, cpfInstrutor, idadeInstrutor);

        // Aluno 1
        System.out.println("\nInforme os dados do Aluno 1:");
        System.out.print("Nome: ");
        String nomeAluno1 = scan.nextLine();

        System.out.print("CPF (11 dígitos): ");
        String cpfAluno1 = scan.nextLine();

        System.out.print("Idade: ");
        int idadeAluno1 = scan.nextInt();
        scan.nextLine();

        Aluno aluno1 = new Aluno(nomeAluno1, cpfAluno1, idadeAluno1);

        // Aluno 2
        System.out.println("\nInforme os dados do Aluno 2:");
        System.out.print("Nome: ");
        String nomeAluno2 = scan.nextLine();

        System.out.print("CPF (11 dígitos): ");
        String cpfAluno2 = scan.nextLine();

        System.out.print("Idade: ");
        int idadeAluno2 = scan.nextInt();
        scan.nextLine();

        Aluno aluno2 = new Aluno(nomeAluno2, cpfAluno2, idadeAluno2);

        // Curso
        System.out.print("\nDigite o nome do curso: ");
        String nomeCurso = scan.nextLine();

        Curso curso = new Curso(nomeCurso, instrutor);
        curso.setAlunos(aluno1, aluno2);

        // Exibir tudo
        System.out.println("\n--- Dados do Curso ---");
        curso.mostrarCurso();

        scan.close();
    }
}
