package array;

public class PercorrerArray {
    public static void main(String[] args) {
        String[] alunos = {"João", "Breno", "Jarbas", "Júnior", "Moisés", "Caio", "Hiago"};

        //Exemplo 1 - Laço for
        for (int i = 0; i < alunos.length; i++){
            System.out.println("Aluno: " + alunos[i]);
        }

        for (String aluno: alunos) {
            System.out.println("Aluno: "+ aluno);
        }
    }
}
