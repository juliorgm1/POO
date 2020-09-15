package funcionarios;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
                "José",
                "Compras",
                3000,
                "12/12/2011",
                "963258"

        );

        funcionario.aumentaSalario(100);
        funcionario.ganhoAnual();
    }
}
