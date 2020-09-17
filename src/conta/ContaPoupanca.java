package conta;

public class ContaPoupanca extends Conta{

    private double ultimoRendimento;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public void rendimento(double percentual){
        if (percentual < 0) return;
        this.ultimoRendimento = this.saldo*percentual;
        this.saldo+= this.ultimoRendimento;
    }

    @Override
    public void imprimeDados() {
        {
            System.out.println("===========================");
            System.out.println("Número " + this.numero);
            System.out.println("Titular " + this.titular.getNome());
            System.out.println("Saldo " + this.saldo);
            System.out.println("Ultimo Rendimento " + this.ultimoRendimento);
            System.out.println("===========================\n\n");
        }
    }
}
