public class EjercicioExtra {
    public static void main(String[] args) {
        //crear 2 arrays y comparar tanto posicion como contenido
        char[] vector1 = new char[]{'a','b','c','d'};
        char[] vector2 = new char[]{'c','b','h','d'};
        String respuesta = "";

        for (int i=0; i< vector1.length ; i++){
            if(vector1[i] == vector2[i]){
                respuesta += " en la posicion " + i + " ambos vectores tienen una " + vector1[i];
            } else {
                for (int j = 0; j < vector1.length; j++){
                    if (vector1[i] == vector2[j]){
                        respuesta += " ambos vectores comparten la letra " + vector2[j];
                    }
                }
            }
        }
        if (respuesta == "" ){
            respuesta = "no comparte letra en ninguna posicion";
        }
        System.out.println(respuesta);
    }
}
