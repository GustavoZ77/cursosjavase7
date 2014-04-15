/**
 * Ejemplo de ciclos y sumatoria
 *
 *
 * LICENSE: GNU
 *
 * @category   POO java
 * @package    ciclos
 * @license    http://www.gnu.org/licenses/gpl.txt  GNU GPL 3.0
 * @version    0.1
 * @author     Gustavo Zepeda <gustavo@hightechcoders.com>
 * @link       www.hightechcoders.com/curso
 * @since      File available since Release 0.1
 */

package ciclos;

/**
 *
 * @author gustavo
 */
public class Sumatoria {

    /**
     * Implementación del ciclo for
     *
     * @access public
     * @int  int numero
     * @return  int sumatoria
     */
    public int usaFor(int numero) {
        //este valor nos sive para realizar la sumatoria
        int sumatoria = 0;
        /*
        * Dentro de la sintaxis de "for" podemos definir nuestro contador
        * el cual nos sirve para contabilizar la veces que tenemos que sumar 
        */
        for (int contador = 0; contador <= numero; contador++) {
            //realizamos la sumatoria
            sumatoria += contador;
        }
        return sumatoria;
    }

    /**
     * Implementación del ciclo while
     *
     * @access public
     * @int  int numero
     * @return  int sumatoria
     */
    public int usaWhile(int numero) {
        //este valor nos sive para realizar la sumatoria
        int sumatoria = 0;
        // en la sintaxis de while la definición del contador va fuera del 
        // bloque "while" 
        int contador = 0;
        //cilco while dentro de "()" ponemos la condición del ciclo
        while (contador <= numero) {
            //realizamos la sumatoria
            sumatoria += contador;
            //incrementamos contador
            contador++;
        }
        return sumatoria;
    }
    
    /**
     * Implementación del ciclo do while
     *
     * @access public
     * @int  int numero
     * @return  int sumatoria
     */
    public int usaDoWhile(int numero) {
        //variable que almacena la sumatoria
        int sumatoria = 0;
        //contador
        int contador = 0;
        //bloque de lógica de el ciclo "do while"
        do {
            //sumarotia
            sumatoria += contador;
        }
        //condición
        while (contador <= numero);
        return sumatoria;
    }

}
