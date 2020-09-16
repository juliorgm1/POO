package conta;

public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(300);

        cc.saca(100);

        System.out.println(cc.getSaldo());
    }
}
