package funcionarios;

public class Funcionario {
    public static final int MESES = 12;
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;

    public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
    }

    public void aumentaSalario(double valor){
        if (valor > 0) this.salario += valor;
    }

    public double ganhoAnual(){
        return this.salario * MESES;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }


}
