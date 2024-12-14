public class Ejercicio7 {
    public static void main(String[] args) {
        int[] pares = new int[20];
        int inicio = 0, suma = 0;


        for (int i = 0; i < pares.length; i++) {
            pares[i] = i * 2;
            System.out.println(pares[i]);
            suma += pares[i];
        }
        System.out.println(suma);
        System.out.println("La media de los " + pares.length + " primeros numeros pares es de " + (suma / pares.length));
    }
}
