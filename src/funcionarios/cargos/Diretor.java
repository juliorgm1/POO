package funcionarios.cargos;

import funcionarios.Funcionario;

public class Diretor extends Funcionario implements Autenticavel {
    public Diretor(String nome, String departamento, double salario, String dataEntrada, String rg) {
        super(nome, departamento, salario, dataEntrada, rg);
    }

    @Override
    public boolean autentica(int senha) {
        return senha == 1234;
    }
}
