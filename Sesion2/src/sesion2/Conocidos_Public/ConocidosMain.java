/**
 * Esta clase simula en contexto a nuestros conocidos
 * en donde algunas caracteristicas nuestra son bien conocidas
 * por ellos
 * 
 *
 * LICENSE: GNU
 *
 * @category   POO java
 * @package    session2
 * @license    http://www.gnu.org/licenses/gpl.txt  GNU GPL 3.0
 * @version    0.1
 * @author     Gustavo Zepeda <gustavo@hightechcoders.com>
 * @link       www.hightechcoders.com/curso
 * @since      File available since Release 0.1
 */

package sesion2.Conocidos_Public;

import sesion2.Mi_Casa_ProtectedDefault.Yo;

public class ConocidosMain {
    
    //------ATRIBUTOS
    
    /**
    * Un objeto tipo yo ellos ya me conocen (instancia) 
    * 
    * @Yo yo
    * @access private
    */
    private Yo yo = new Yo();
    
    /**
    * Accedemos al método dameCarateristicasFisicas 
    * sin necesidad de hacer una instancia
    *
    * @access public
    * @return String
    */
    public String comoTeLLamas(){
        return yo.nombre;
    }
    
}
