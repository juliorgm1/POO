package heranca;

public class Funcionario {
    protected String nome;
    protected long cpf;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    Funcionario(String nome, long cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double getBonificacao(){
        return salario * 0.1;
    }
}





