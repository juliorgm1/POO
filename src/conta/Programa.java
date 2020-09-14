package conta;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Criar uma conta na linha 6");
        Conta contaJoao = new Conta(123, new Cliente(), 200, 800);

        System.out.println("Numero " + contaJoao.getNumero());
        System.out.println(contaJoao.getTitular());
        System.out.println(contaJoao.getSaldo());
        System.out.println(contaJoao.getLimite());

        System.out.println("Saque 200");
        contaJoao.saca(200);

        System.out.println("Saque 2500");

//        if (contaJoao.saca(2500)) {
//            System.out.println("Saque realizado com sucesso");
//        } ;

        System.out.println("Deposito 500");
        contaJoao.deposita(500);

        System.out.println("Saldo " + contaJoao.getSaldo());
    }
}
