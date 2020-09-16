package banco;

public class Diretor extends Funcionario implements Autenticavel{
    public Diretor(String nome) {
        super(nome);
    }

    @Override
    public void login() {
        System.out.println("Login diretor");
    }
}
