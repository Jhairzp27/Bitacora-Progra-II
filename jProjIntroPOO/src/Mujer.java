public class Mujer {
        //Atributos de la clase mujer
        private String nombre;
        public int edad;
        private float altura;
    
        // Constructor de la clase mujer
        public Mujer(String nombre){
            this.nombre = nombre;  //Distingue y lo asigna a la variable general
            // this es lo que le pertenece a la clase
            edad = 18;
            altura = 1.70f;      //  1.60              1.60
        }
    
        //metodos
        public void saludar(){
            System.out.println("Hola, soy una mujer y me llamo "+ this.nombre);
        }
    
        public void cantar(){
            System.out.println("Canto con una voz suave y melodiosa " + edad + " años");
        }
    
        public void bailar(){
            System.out.println("Bailo con pasos elegantes y lindos movimientos");
    
        }
    
        public static void main(String[] args) {
            //Creamos un objeto de la clase mujer llamada Maria
            Mujer objMujer1, objMujer2;               // Declaracion
            objMujer1 = new Mujer("Ana");                  // Instancia
            // Esto ayuda a agilitar (optimizacion) el programa (lo hace mas rapido), cuando se necesita crear lo instancia, es decir, bajo demanda
    
            System.out.println("------------------- MUJER 1---------");
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
