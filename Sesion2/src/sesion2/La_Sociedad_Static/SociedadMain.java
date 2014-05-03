/**
 * Esta clase simula en contexto a las personas que topamos por la calle
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

package sesion2.La_Sociedad_Static;

import sesion2.Mi_Casa_ProtectedDefault.Yo;

public class SociedadMain {
    
    //ATRIBUTOS
    
    /**
    * Accedemos al método dameCarateristicasFisicas 
    * sin necesidad de hacer una instancia
    *
    * @access public
    * @return String
    */
    public String porLaCalle(){
        return Yo.dameCarateristicasFisicas();
    }
    
}
