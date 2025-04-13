public class Pessoa {
    private String cpf;
    private int idade;
    private String nome;

    public Pessoa(String nome, String cpf, int idade) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido. Deve ter 11 dígitos.");
            this.cpf = "00000000000";
        }
        this.idade = idade;
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido. Deve ter 11 dígitos.");
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
