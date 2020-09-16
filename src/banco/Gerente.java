package banco;

public class Gerente extends Funcionario {
    public Gerente(String nome) {
        super(nome);
    }

    public void login() {
        System.out.println("Diretor");
    }
}
