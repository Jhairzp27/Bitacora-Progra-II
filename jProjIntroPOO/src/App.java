public class App {
    public static void main(String[] args) throws Exception {
        
        //Creamos un objeto de la clase mujer llamada Maria
        Mujer objMujer1, objMujer2;               // Declaracion
        objMujer1 = new Mujer("Ana");                  // Instancia
        // Esto ayuda a agilitar (optimizacion) el programa (lo hace mas rapido), cuando se necesita crear lo instancia, es decir, bajo demanda
        System.out.println("------------------- MUJER 1---------");
        objMujer1.edad = 20;
        objMujer1.saludar();
        objMujer1.cantar();
        objMujer1.bailar();
        //objMujer.mujer(); No permite debido a que el constructor solo se lo llama una unica vez, arroja error
        
        System.out.println("------------------- MUJER 2--------");
     objMujer2 = new Mujer("Susana");
        objMujer2.saludar();
        objMujer2.cantar();
        objMujer2.bailar();

    }
}

