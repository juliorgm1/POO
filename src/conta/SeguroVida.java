package conta;

public class SeguroVida implements Tributavel{
    private Cliente cliente;
    private double premio;
    private int contrato;
    private final int TRIBUTO = 42;

    public SeguroVida(Cliente cliente, double premio, int contrato) {
        this.cliente = cliente;
        this.premio = premio;
        this.contrato = contrato;
    }

    @Override
    public double calculaTributos() {
        return TRIBUTO;
    }
}
