
package tiposdedatos;

/**
 *
 * @author LOMBEIDA ANA
 */
public class TiposDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         byte a=5;//Se utiliza para almacenar valores numéricos enteros en un rango limitado. 
         short b=200;//Se utiliza para almacenar valores numéricos enteros en un rango limitado. 
         int c=1000000; //Se utiliza para almacenar valores numéricos enteros
         char d= 'A';//Se utiliza para almacenar y representar caracteres individuales
         //como letras o símbolos, en variables y estructuras de datos.
         float e=42.6f;//Se utiliza para representar numeros en coma flotante de precision simple
         long poblacionMundial = 7794798739L;//es útil en situaciones donde se requiere trabajar con números 
         //enteros muy grandes o almacenes de datos que exceden el rango de int
         double pi = 3.141592653589793;
         //Se utiliza para representar números en coma flotante de doble precisión
         String nombre = "Damian";//Es para almacenar texto, como palabras, frases, párrafos, etc.
         boolean estaLloviendo = true;//Se utiliza para representar valores de verdad (verdadero o falso). 
         
         ///IMPRESION DE DATOS DE LAS VARIABLES DECLARADAS
        System.out.println("=========================================== "  );
        System.out.println("La variable definida de tipo byte es: " + a );
        System.out.println("La variable definida de tipo  short es: " + b );
        System.out.println("La variable definida de tipo int es: " + c );
        System.out.println("La variable definida de tipo char es: " + d );
        System.out.println("La variable definida de tipo float es: " + e );
        System.out.println("La poblacion mundial es: " + poblacionMundial);
        System.out.println("El valor de pi es: " + pi);
        System.out.println("Mi nombre es: " + nombre );
        System.out.println("=========================================== "  );
        if (estaLloviendo) {
         System.out.println("Lleva un paraguas contigo.");
        } else {
        System.out.println("Disfruta del dia.");
        }
        System.out.println("======================================== "  );

    }
    
}
