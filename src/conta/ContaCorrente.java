package conta;

public class ContaCorrente extends Conta implements Tributavel{
    private final double TAXA_SAQUE = 0.2;

    public ContaCorrente( Cliente titular, double saldo) {
        super(saldo);
        this.titular = titular;
    }

    @Override
    public boolean saca(double valor) {
        valor += TAXA_SAQUE;
        return super.saca(valor);
    }

    @Override
    public void imprimeDados() {
        {
            System.out.println("===========================");
            System.out.println("Número " + this.numero);
            System.out.println("Titular " + this.titular.getNome());
            System.out.println("Saldo " + this.saldo);
            System.out.println("Limite " + this.limite);
            System.out.println("===========================\n\n");
        }
    }

    @Override
    public double calculaTributos() {
        return getSaldo() * 0.01;
    }
}
