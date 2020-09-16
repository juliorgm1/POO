package heranca;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroFuncionarios;

    Gerente(String nome, long cpf, double salario, int senha, int numeroFuncionarios) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void imprimeDadosGerente(){
        System.out.println("Gerente: ");
        System.out.println("Nome: " + nome);
    }

    @Override
    public double getBonificacao() {
        return salario * 0.15;
    }

    public double comissao(int valor){
        return salario + valor;
    }

    public double comissao(double valor ){
        return salario + valor * 10;
    }
}
