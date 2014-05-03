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

//Declaración de paquete
package sesion2.Mi_Casa_ProtectedDefault;


//declaración de clase
public class Yo extends Papa {
    
    //------ATRIBUTOS
    
    /**
    * private: modificador de acceso el cual restrinje
    * el acceso a solo la clase (solo tiene sentido en clases o
    * interfaces internas)
    * 
    * Este atributo es privado ya que solo puede 
    * ser accedido por la misma clase, en este caso
    * solo yo se mis secretos
    * 
    * @String secretosPersonales
    * @access private
    */
    private String secretosPersonales = "Este es un secreto muy personal";
    
       
    /**
    * Cuando no definimos un modificador de acceso 
    * de forma específica java ocupa un modificador 
    * de acceso Default, es modificador de acceso obliga 
    * a que los atributos o métodos declarados con el
    * solo puedan ser accedidos si las clases que la usan
    * estan en el mismo paquete
    * 
    * En el ejemplo que se plantea solo se pueden saber 
    * mi comportamiento en casa las personas que viven en la misma 
    * casa que yo.
    * 
    * @String comportamientoCasa
    * @access default
    */
    String comportamientoCasa = "";  
    
    
    /**
    * El modificador de acceso public 
    * hace que el método o atributo declarado
    * pueder ser accedido por cualquier clase y desde
    * cualquier lugar
    * 
    * En el ejemplo podemos decir que cualquiera que necesite 
    * saber mi nombre necesita conocerme o tener alguna instancia
    * de mi o, pedirle a alguien que me conoce (que ya tiene una
    * instancia) que se lo proporcione
    * 
    * @String nombre
    * @access public
    */
    public String nombre = "";
    
    
    /**
    * Este modificador sirve para definir métodos o atributos
    * en los cuales NO se necesita tener una instancia para acceder
    * a ellos
    * No se puede generar un objeto  y mandar a llamar un static desde el
    * Todos los elementos que esten dentro de un modificador contexto stati
    * deberán de ser static
    * 
    * En este caso no necesitan conocerme (hacer una instancia de la clase yo)
    * para poder determinar mis características físicas
    * 
    * @String caracterirticasFisicas
    * @access static
    */
    public static String caracterirticasFisicas = "";
    
    
    /**
    * Si quiere saber mis secretos deben pedirmelos a mi mismo
    *
    * @access public
    * @return String
    * @throws Exception Si el elemento no es encontrado
    */
    public String dimeTusSecretosPersonale(){
        return this.secretosPersonales;
    }
    
}
