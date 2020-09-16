package heranca;

public class TestaControleBonificacao {
    public static void main(String[] args) {
        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Funcionario angelica = new Funcionario("Angelica",3000);
        Funcionario fernanda = new Gerente("Fernanda",3000);
        Gerente vitor = new Gerente("Vitor",3000);

        controle.registra(angelica);
        controle.registra(fernanda);
        controle.registra(vitor);
        System.out.println("Bonificação Angelica + Fernanda");

        System.out.println(controle.getTotalBonificacoes());
    }
}
