public class Ejercicio8 {
    public static void main(String[] args) {
        double[] notasClase = new double[]{0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        double  suma = 0.0, mediaClase = 0.0;

        for (int i = 0; i < notasClase.length; i++) {
            suma += notasClase[i];
        }
        mediaClase = suma / notasClase.length;
        System.out.println("La media del grupo es " + mediaClase);
        for (int i = 0; i < notasClase.length; i++) {
            if (notasClase[i] > mediaClase) {
                System.out.println("El/la alumn@ " + (i + 1) + " supera a la nota media de la clase con una nota de " + notasClase[i]);
            }
        }
    }
}
