package exercicios;

public class exercicio2 {
    public static void main(String[] args) {

        Aluno jose = new Aluno();

        jose.nome = "José";
        jose.nota1 = 8;
        jose.nota2 = 8;
        jose.trabalho = 8;

        System.out.println(jose.media());
        System.out.println("Nota final " + jose.notaFinal());
        System.out.println("E ai passou " + jose.resultadoFinal(8));
    }
}
