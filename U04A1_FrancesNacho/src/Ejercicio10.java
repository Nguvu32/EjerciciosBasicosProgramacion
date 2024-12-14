public class Ejercicio10 {
    public static void main(String[] args) {
        int[] vector = new int[]{2, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int contadorMayores = 0, contadorMenores = 0, suma = 0;

        for (int i = 0; i < vector.length; i++) {
            if (suma != vector[i]) {
                suma = suma + vector[i];
            }
        }
        int media = (suma / vector.length);
        System.out.println("La media es " + media);
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > media) {
                contadorMayores++;
            } else if (vector[i] < media){
                contadorMenores++;
            }
        }
        int[] vectorMayores = new int[contadorMayores];
        int[] vectorMenores = new int[contadorMenores];
        int posicionMayores = 0;
        int posicionMenores = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > media) {
                vectorMayores[posicionMayores] = vector[i];
                posicionMayores++;
            } else if (vector[i] < media){
                vectorMenores[posicionMenores] = vector[i];
                posicionMenores++;
            }
        }
        System.out.print("|");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "|");
        }
        System.out.println("-->  Vector");
        System.out.print("|");
        for (int i = 0; i < vectorMayores.length; i++) {
            System.out.print(vectorMayores[i] + "|");
        }
        System.out.println("-->  vectorMayores");
        System.out.print("|");
        for (int i = 0; i < vectorMenores.length; i++) {
            System.out.print(vectorMenores[i] + "|");
        }
        System.out.println("-->  vectorMenores");
    }
}

