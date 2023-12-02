
public class Bucles_Variables {

    //Declaramos las propiedades que vamos a utilizar en el bucle for, while, doWhile
    private int numTerminos;

    public Bucles_Variables(int numTerminos){
        this.numTerminos = numTerminos;
    }

    public void showCicloFor(){

        // Se puede tener un i=0 fuera del ciclo for y funcionara
        System.out.println("Ejecutando ciclo For");
        for(int i = 0; i<this.numTerminos;i++){
            // Se puede tener un i++ dentro del for y no tenerlo dentro de las condiciones
            // for( ; ; ); -> Es un ciclo infinito (linea fantasma)
            // for ( ; true/false; )  en el centro se evalua y aroja un boolean
            
            /*
            * Este siempre pregunta antes de ejecutarN
            * for ( ; i < numTerminos; ){
                syout("for"+ ++)
                }
            */
            System.out.println(" termino :"+ i);
        }

        // Este ciclo se ejecuta al menos una vez, ya que evalúa al final
        System.out.println("\n\nEjecutando ciclo DoWhile");
        int contadorWoWhile = 100;
        do {
            System.out.println("doWhile "+ contadorWoWhile);
        } while (contadorWoWhile < numTerminos);

        //El doWhile puede crear un ciclo infinito
        // do { } while (true);

        //Evalua antes de entrar en el ciclo
        int contadorWhile = 100;
        while (contadorWhile < numTerminos) {
            
        }


    }

    public static void main(String[] args) {
        Bucles_Variables objBucles = new Bucles_Variables(5);
        objBucles.showCicloFor();

        // Tipos de datos primitivos = VARIABLES
            byte bin = 0;
            boolean bandera = true;
            char c = 'a';
            c =  54;

            short edad = 32760;
            int num = 10;
            // cast implicito
            long l = 10L;
            float f = 10.00000f;
            double d = 10.0000d;

        // Tipos de dato de referencia = PROPIEDADES
            String cad = "dss..";
            long ll = 21L;
            Integer n = 23;
            Double dbl = 23.000000;
            Boolean b = true;
            Character ch = 'c';
            String [] arr = {"uno", "dos", "tres"};
            
            // cast explicito
        
    }
}