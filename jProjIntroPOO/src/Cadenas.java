public class Cadenas {

    public Cadenas(){
        Conceptualizacion();
    }

    private void Conceptualizacion() {
        // Cadena de caracteres
        String str = "Hola, como estas";
        
        String S0 ; // No ocupa espacio de almacenamiento, solo esta DECLARADA
        String S1 = "TAT"; // Crea un mismo espacio de memoria para los dos INICIALIZACION
        String S2 = "TAT"; // Java lo hace por defecto
        String S3 = new String("TAT"); // instancia + inicializacion
        String S4 = new String("TAT");
        String S5 = new String("");  // Instancia
        String S6 = null;  // Inicializacion

        // MUTABLE
        StringBuilder sb = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer(" hola StringBuffer");
        sb.append(str);
        sb.append(" hoy ");
        sb.append( " martes ");
        System.out.println("StringBuilder =" + stringBuffer);

        String ex = S4;
        ex = "Ahora me perteneces...";
        
        
        System.out.println(" strc = " + str);
    }

}