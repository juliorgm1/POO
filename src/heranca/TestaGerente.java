package heranca;

public class TestaGerente {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Jorge",789456133123L,6500);

        Gerente gerente = new Gerente("Allan", 13245678912L,
                6500, 1234,28);

        //gerente.imprimeDadosGerente();

//        System.out.println("Funcionário: " + funcionario.getBonificacao());
////        System.out.println("Gerente: " + gerente.getBonificacao());

        System.out.println("Comissão inteiro: " + gerente.comissao(100));
        System.out.println("Comissão double: " + gerente.comissao(100.0));

    }
}
