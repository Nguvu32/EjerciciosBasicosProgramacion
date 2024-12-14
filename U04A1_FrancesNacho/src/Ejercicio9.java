public class Ejercicio9 {
    public static void main(String[] args) {
        int[] vector = new int[]{2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int contadorPares = 0, contadorImpares = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        int[] vectorPares = new int[contadorPares];
        int[] vectorImpares = new int[contadorImpares];
        contadorPares = 0;
        contadorImpares = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                vectorPares[contadorPares] = vector[i];
                contadorPares++;
            } else {
                vectorImpares[contadorImpares] = vector[i];
                contadorImpares++;
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "|");
        }
        System.out.println("-->  Vector");
        for (int i = 0; i < vectorPares.length; i++) {
            System.out.print(vectorPares[i] + "|");
        }
        System.out.println("-->  vectorPares");
        for (int i = 0; i < vectorImpares.length; i++) {
            System.out.print(vectorImpares[i] + "|");
        }
        System.out.println("-->  vectorImpares");
    }
}
