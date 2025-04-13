public class Pessoa {
    private String cpf;
    private int idade;

    // Construtor sem parâmetros
    public Pessoa() {
        // Objeto criado sem dados
    }

    // Construtor com CPF
    public Pessoa(String cpfInformado) {
        setCpf(cpfInformado); // Usa o método set com validação
    }

    // Construtor com idade
    public Pessoa(int idadeInformada) {
        setIdade(idadeInformada);
    }

    // Construtor com CPF e idade
    public Pessoa(String cpfInformado, int idadeInformada) {
        setCpf(cpfInformado);
        setIdade(idadeInformada);
    }

    // GET do CPF
    public String getCpf() {
        return cpf;
    }

    // SET do CPF com validação simples
    public void setCpf(String novoCpf) {
        if (novoCpf.length() == 11) {
            cpf = novoCpf;
        } else {
            System.out.println("CPF inválido! Deve conter exatamente 11 números.");
            cpf = "CPF INVÁLIDO";
        }
    }

    // GET da idade
    public int getIdade() {
        return idade;
    }

    // SET da idade
    public void setIdade(int novaIdade) {
        idade = novaIdade;
    }
}
