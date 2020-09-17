package conta;

public class TestaTributavel {
    public static void executar(Tributavel tributavel){
        System.out.println("Valor a ser pago");
        System.out.println("R$ "+ tributavel.calculaTributos());
    }

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(new Cliente(),500);
        ContaPoupanca cp = new ContaPoupanca(500);
        SeguroVida seguro = new SeguroVida(new Cliente(),20000,123);

        TestaTributavel.executar(cc);
        TestaTributavel.executar(cp);
        TestaTributavel.executar(seguro);

    }
}
