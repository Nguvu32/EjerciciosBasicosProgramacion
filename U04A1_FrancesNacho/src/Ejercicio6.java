public class Ejercicio6 {
    public static void main(String[] args) {
        double[] array = new double[20];
        double inicio = 4.0, suma = 0.0;

        for (int i = 0; i < array.length; i++) {
            array[i] = inicio;
            System.out.println(array[i]);
            inicio = inicio + 0.5;
            suma += array[i];
        }
        System.out.println("la suma de todos los numeros es --> " + suma);
    }
}
