public class EjercicioExtra3 {
    public static void main(String[] args) {
        //crear 2 arrays y comparar tanto posicion como contenido
        char[] vector1 = new char[]{'a', 'b', 'c', 'd'};
        char[] vector2 = new char[]{'c', 'b', 'h', 'd'};
        int contadorMismaPosicion = 0, contadorDistintaPosicion = 0, contadorSinRelacion = 0;

        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                if (vector1[i] == vector2[j]) {
                    if (j == i) {
                        contadorMismaPosicion++;
                    } else {
                        contadorDistintaPosicion++;
                    }
                }
            }
        }
        contadorSinRelacion = vector1.length + vector2.length - contadorDistintaPosicion - contadorMismaPosicion;
        System.out.println("total de numeros en la misma posicion --> " + contadorMismaPosicion);
        System.out.println("total de letras que coinciden pero no en la misma posicion --> " + contadorDistintaPosicion);
        System.out.println("Letras que no tienen relacion --> " + contadorSinRelacion);
    }
}
