package conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    boolean saca(double valor) {
        return super.saca(valor + 0.2);
    }
}
