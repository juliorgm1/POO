package conta;

public abstract class Conta {
    //Atributos
    protected int numero;
    protected Cliente titular;
    protected double saldo;
    protected double limite;
    protected static int totalDeContas;

    Conta(){
        Conta.totalDeContas++;
    }

    public Conta(int numero, Cliente titular, double saldo, double limite){
       this.numero = numero;
       this.titular = titular;
       this.saldo = saldo;
       this.limite = limite;
    }

    public Conta( double saldo){
        this.saldo = saldo;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

//    public void setTitular(conta.Cliente titular) {
//        this.titular = titular;
//    }

    public double getSaldo() {
        return saldo;
    }

//    public void setSaldo(double saldo) {
//        this.saldo = saldo;
//    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //metodos
    public boolean saca(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }

        System.out.println("Saldo insuficiente!");
        return false;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void transferePara(Conta contaDestino, double valor){
        if(this.saca(valor)){
            contaDestino.deposita(valor);
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public abstract void imprimeDados();
}
