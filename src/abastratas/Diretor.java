package abastratas;

public class Diretor extends Funcionario {
    public Diretor(String nome, long cpf) {
        super(nome, cpf);
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}
