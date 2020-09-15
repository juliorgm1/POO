package funcionarios;

public class TestaEmpresa {
    public static void main(String[] args) {

        Empresa senac = new Empresa("SENAC");

        Funcionario novoFuncionario = new Funcionario("José","TI",3000,"12/12/2011","963258");

        senac.add(novoFuncionario);
        senac.add(novoFuncionario);
        senac.add(novoFuncionario);
        senac.add(novoFuncionario);
        senac.add(novoFuncionario);
        senac.add(novoFuncionario);
        senac.add(novoFuncionario);
        senac.add(novoFuncionario);
        senac.add(novoFuncionario);
        senac.add(novoFuncionario);
        senac.add(novoFuncionario);
        senac.add(novoFuncionario);

        senac.imprimeFuncionarios();

    }

    private static Funcionario[] createFuncionarios(){
        Funcionario []listaFuncionario = new Funcionario[10];
        listaFuncionario[0] = new Funcionario("José","TI",3000,"12/12/2011","963258");
        listaFuncionario[1] = new Funcionario("Maria","Compras",2000,"12/12/2011","963258");
        listaFuncionario[2] = new Funcionario("Ivo","Compras",3000,"12/12/2011","963258");
        listaFuncionario[3] = new Funcionario("Joaquim","TI",2500,"12/12/2011","963258");
        listaFuncionario[4] = new Funcionario("Rosana","Compras",4500,"12/12/2011","963258");
        listaFuncionario[5] = new Funcionario("Guilherme","Marketing",3500,"12/12/2011","963258");
        listaFuncionario[6] = new Funcionario("Ana","Compras",2745,"12/12/2011","963258");
        listaFuncionario[7] = new Funcionario("Patrícia","Compras",5600,"12/12/2011","963258");
        listaFuncionario[8] = new Funcionario("Nilce","Marketing",5400,"12/12/2011","963258");
        listaFuncionario[9] = new Funcionario("Adão","Marketing",3600,"12/12/2011","963258");

        return  listaFuncionario;
    }
}
