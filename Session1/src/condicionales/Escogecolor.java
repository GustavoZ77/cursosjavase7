/**
 * Ejemplo de condicionales
 *
 *
 * LICENSE: GNU
 *
 * @category   POO java
 * @package    condicionales
 * @license    http://www.gnu.org/licenses/gpl.txt  GNU GPL 3.0
 * @version    0.1
 * @author     Gustavo Zepeda <gustavo@hightechcoders.com>
 * @link       www.hightechcoders.com/curso
 * @since      File available since Release 0.1
 */


package condicionales;

/**
 *
 * @author gustavo
 */
public class Escogecolor {
    
     /**
     * uso de if else anidados
     *
     * @access public
     * @param  int opcion
     * @return String
     */
    public String useIfElse(int opcion){
        if(opcion == 1){
            return "Verde";
        }
        else if(opcion == 2){
            return "Rojo";
        }
        else if(opcion == 3){
            return "Amarillo";
        }
        else{
            return null;
        }
    }
        
     /**
     * uso de switch
     *
     * @access public
     * @param  int opcion
     * @return String
     */
    public String userSwitch(int opcion){
        String color = null;
        switch(opcion){
            case 1:{color = "Verde";}break;
            case 2:{color = "Rojo";}break;
            case 3:{color = "Amarillo";}break;
        }
    return color;    
    }
    
}
