package banco;

public class TestaAutenticacao {
    public static void main(String[] args) {
        SistemaInterno si = new SistemaInterno();

        Diretor diretor = new Diretor("Jerson");
        Gerente gerente = new Gerente("Anderson");

        si.login(diretor);
    }
}
