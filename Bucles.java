/**
 * Bucles
 */
public class Bucles {

    //Declaramos las propiedades que vamos a utilizar en el bucle for, while, doWhile
    private int numTerminos;

    public Bucles(int numTerminos){
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
            * Este siempre pregunta antes de ejecutar
            * for ( ; i < numTerminos; ){
                syout("for"+ ++)
                }
            */


            System.out.println(" termino :"+ i);

        }
    }

    public static void main(String[] args) {
        Bucles objBucles = new Bucles(5);
        objBucles.showCicloFor();
    }
}