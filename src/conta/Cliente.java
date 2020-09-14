package conta;

public class Cliente {
    private String nome;
    private long cpf;
    private String dataNascimento;
    private String endereco;

    public Cliente(){}

    public Cliente(String nome, long cpf, String dataNascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }
}
