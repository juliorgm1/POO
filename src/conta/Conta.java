package conta;

public class Conta {
    //Atributos
    private int numero;
    private Cliente titular;
    private double saldo;
    private double limite;
    private static int totalDeContas;

    Conta(){
        Conta.totalDeContas++;
    };

    Conta(int numero, Cliente titular, double saldo, double limite){
       this.numero = numero;
       this.titular = titular;
       this.saldo = saldo;
       this.limite = limite;
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
    boolean saca(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }

        System.out.println("Saldo insuficiente!");
        return false;
    }

    void deposita(double valor){
        this.saldo += valor;
    }

    void transferePara(Conta contaDestino, double valor){
        if(this.saca(valor)){
            contaDestino.deposita(valor);
            System.out.println("Saque realizado com sucesso!");
        }
    }

    void imprimeDados(){
        System.out.println("===========================");
        System.out.println("Número " + this.numero);
        System.out.println("Titular " + this.titular.getNome());
        System.out.println("Saldo " + this.saldo);
        System.out.println("Limite " + this.limite);
        System.out.println("===========================\n\n");
    }
}
