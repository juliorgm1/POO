package conta;

public class TestaConta {
    public static void main(String[] args) {
       ContaCorrente cc = new ContaCorrente(new Cliente(), 500);
       ContaPoupanca cp = new ContaPoupanca(0);


        System.out.println("Antes das operações");
        cc.imprimeDados();
        cp.imprimeDados();

       cc.transferePara(cp,300);

        System.out.println("Depois da transferencia");
        System.out.println("CC: "+ cc.getSaldo());
        System.out.println("CP: "+ cp.getSaldo());


       cp.rendimento(0.01);
        System.out.println("Depois do rendimento");
        System.out.println("CC: "+ cc.getSaldo());
        System.out.println("CP: "+ cp.getSaldo());

    }
}
