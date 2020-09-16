package abastratas;

public abstract class Funcionario {
    protected String nome;
    protected long cpf;
    protected double salario;

    public Funcionario(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    Funcionario(String nome, long cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public abstract double getBonificacao();
}





