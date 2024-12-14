public class Ejercicio5 {
    public static void main(String[] args) {
        boolean[] vector = new boolean[20];

        for (int i = 0; i < vector.length; i++) {
            if (i % 2 == 0) {
                vector[i] = true;
            } else {
                vector[i] = false;
            }
            System.out.println(vector[i]);
        }
    }
}
