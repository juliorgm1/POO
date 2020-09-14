package array;

public class TestaArray {
    public static void main(String[] args) {
       int bilhetes[] = new int[5];

       bilhetes[0] = 65;
       bilhetes[1] = 83;
       bilhetes[2] = 5;
       bilhetes[3] = 7;
       bilhetes[4] = 28;

        System.out.println(bilhetes[1]);
        System.out.println(bilhetes[4]);

        String cars[] = {"Uno", "Ka", "Palio", "Gol" };
        cars[1] = "Ford Ka";

        System.out.println("Quantidade de Carros " + cars.length);

    }
}
