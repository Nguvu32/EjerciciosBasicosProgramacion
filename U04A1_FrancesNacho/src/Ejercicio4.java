public class Ejercicio4 {
    public static void main(String[] args) {
        char[] vector = new char[15];
        char letra = 'a';

        for (int i = 0; i < vector.length; i++) {
            vector[i] = letra;
            System.out.print(vector[i] + " ");
            letra++;
        }
    }
}
