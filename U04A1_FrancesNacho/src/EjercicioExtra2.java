public class EjercicioExtra2 {
    public static void main(String[] args) {
        //crear 2 arrays y comparar tanto posicion como contenido
        char[] vector1 = new char[]{'a', 'j', 'm', 'd'};
        char[] vector2 = new char[]{'c', 'a', 'h', 'd'};
        int contadorMismaPosicion = 0, contadorDistintaPosicion = 0, contadorSinRelacion = 0;
        String respuesta = "";

        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                if (vector1[i] == vector2[j]) {
                    if (j == i) {
                        respuesta += " en la posicion " + i + " ambos vectores tienen una " + vector1[i] + ",";
                    } else {
                        respuesta += " ambos vectores comparten la letra " + vector2[j] + ",";
                    }
                }
            }
        }
        if (respuesta == "") {
            respuesta = "no comparte letra en ninguna posicion";
        }
        System.out.println(respuesta);
    }
}
