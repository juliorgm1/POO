package heranca;

public class Funcionario {
    protected String nome;
    protected long cpf;
    protected double salario;

    Funcionario(String nome, long cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double getBonificacao(){
        return salario * 0.1;
    }
}





