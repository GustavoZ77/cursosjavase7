
package sesion2.Mi_Casa_ProtectedDefault;
/**
 * Esta clase prentende modelar en un sentido abstracto a 
 * una persona con diferentes atributos, los cuales 
 * estan definidos con diferentes modificadores de acceso 
 * simulando que estos atributos pueden ser accedidos por
 * diferentes entidades de su vida cotidiana
 * 
 * Para declarar un clase en java se usa la palabra reservada 
 * class y NO se puede delarar un clase con modificador de acceso 
 * private o protected ya que la definición de estos no concuerda 
 * con la de una clase, una clase tiene como sentido ser usada 
 * en instanciadad y la definición de los modificadores de acceso
 * antes mencionados pretenden ser mas restrictivos
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


/**
 *
 * @author gustavo
 */
public class CasaMain {
    
    /**
    * Variable tipo yo (yo vivo en mi casa)
    * 
    * @Yo yo
    * @access private
    */
    private Yo yo = new Yo();
    
    /**
    * Comunmente los papas tambien viven en la misma casa
    * 
    * @Papa papa
    * @access private
    */
    private Papa papa = new Papa();
    
    /**
    * Como la clase Yo hereda de Papa tambien se 
    * los secretos familiares
    *
    * @access public
    * @return String
    */
    public String dimeSecretosFamiliaresYo(){
        return yo.secretosFamiliares;    
    }
    
    /**
    * Como estamos en en la misma casa (paquete) de papa
    * nos enteramos de los chismes (secretos familiares)
    *
    * @access public
    * @return String
    */
    public String dimeSecretosFamiliares(){
        return papa.secretosFamiliares;   
    }
    
    /**
    * Como estamos en en la misma casa (paquete) de
    * podemos acceder los atributos default
    *
    * @access public
    * @return String
    */
    public String DimeComportamientoCasa(){
       return yo.comportamientoCasa; 
    }
    
}
