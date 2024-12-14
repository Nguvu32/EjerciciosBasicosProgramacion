public class Ejercicio2 {
    public static void main(String[] args) {
        int[] vector = new int[35];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
            System.out.println("En la posicion numero " + i + " hay un " + vector[i]);
        }
    }
}
