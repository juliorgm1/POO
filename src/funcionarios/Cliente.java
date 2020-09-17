package funcionarios;

import funcionarios.cargos.Autenticavel;

public class Cliente implements Autenticavel {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean autentica(int senha) {
        return senha == 4321;
    }
}
