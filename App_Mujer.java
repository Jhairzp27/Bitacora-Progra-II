public class App_Mujer {

    public static void main(String[] args) {
        //Creamos un objeto de la clase mujer llamada Maria
        MujerMain objMujer1, objMujer2;               // Declaracion
        objMujer1 = new MujerMain("Ana");                  // Instancia
        // Esto ayuda a agilitar (optimizacion) el programa (lo hace mas rapido), cuando se necesita crear lo instancia, es decir, bajo demanda
        System.out.println("------------------- MUJER 1---------");
        objMujer1.edad = 20;
        objMujer1.saludar();
        objMujer1.cantar();
        objMujer1.bailar();
        //objMujer.mujer(); No permite debido a que el constructor solo se lo llama una unica vez, arroja error
        
        System.out.println("------------------- MUJER 2--------");
        objMujer2 = new MujerMain("Susana");
        objMujer2.saludar();
        objMujer2.cantar();
        objMujer2.bailar();

    }
}