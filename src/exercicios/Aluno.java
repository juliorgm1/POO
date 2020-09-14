package exercicios;

public class Aluno {
    int matricula;
    String nome;
    double nota1;
    double nota2;
    double trabalho;

    final double PESO_NOTAS = 2.5;
    final double PESO_TRABALHO = 2;
    final int PESOS_AVALIATIVOS = 7;
    final int PESO_AVA_FINAL = 3;
    final int PONTUACAO_PARA_PASSAR = 80;
final
    double media(){
        double media = (this.nota1 * PESO_NOTAS
                + this.nota2 * PESO_NOTAS
                + this.trabalho * PESO_TRABALHO)/PESOS_AVALIATIVOS;

        return media;
    }

    double notaFinal(){
        double totalDePontos = (this.nota1 * PESO_NOTAS
                + this.nota2 * PESO_NOTAS
                + this.trabalho * PESO_TRABALHO);

        double totalParaPassar = PONTUACAO_PARA_PASSAR - totalDePontos;

        return totalParaPassar / PESO_AVA_FINAL;
    }

    String resultadoFinal(double provaFinal){
        double totalDePontos = (this.nota1 * PESO_NOTAS
                + this.nota2 * PESO_NOTAS
                + this.trabalho * PESO_TRABALHO + provaFinal * PESO_AVA_FINAL);

        if (totalDePontos >= PONTUACAO_PARA_PASSAR) {
            return "Aprovado";
        }

        return "Reprovado";

    }


}
