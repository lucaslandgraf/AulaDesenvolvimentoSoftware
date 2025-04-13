public class Curso {
    private String nomeCurso;
    private Instrutor instrutor;
    private Aluno aluno1;
    private Aluno aluno2;

    public Curso(String nomeCurso, Instrutor instrutor) {
        this.nomeCurso = nomeCurso;
        this.instrutor = instrutor;
    }

    public void setAlunos(Aluno aluno1, Aluno aluno2) {
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
    }

    public void mostrarCurso() {
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Instrutor: " + instrutor.getNome());
        System.out.println("Aluno 1: " + aluno1.getNome());
        System.out.println("Aluno 2: " + aluno2.getNome());
    }
}
