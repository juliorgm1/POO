package funcionarios;

import funcionarios.cargos.Autenticavel;
import funcionarios.cargos.Gerente;

public class Sistema {
    public static void logar(Autenticavel usuario){
        boolean resultado = usuario.autentica(1234);
        if (resultado)  System.out.println("Logado...");
        else System.out.println("Senha está errada...");
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Giberto","TI",
                18500,"11/11/2017","45613");
        Cliente cliente = new Cliente("Juvenal");

        Sistema.logar(gerente);
        Sistema.logar(cliente);

    }
}
