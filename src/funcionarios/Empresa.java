package funcionarios;

public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario [] listaFuncionarios;
    private int ultimoFuncionario = 0;

    public Empresa(String nome){
        this.nome = nome;
        this.listaFuncionarios = new Funcionario[10];
    }

    public void add(Funcionario funcionario){
        if (this.listaFuncionarios.length > ultimoFuncionario) {
            this.listaFuncionarios[ultimoFuncionario] = funcionario;
            ultimoFuncionario++;
        }else {System.out.println("Não há vagas");}
    }

    public void imprimeFuncionarios(){
        for (Funcionario funcionario: listaFuncionarios) {
            System.out.println(funcionario);
        }
    }
}
