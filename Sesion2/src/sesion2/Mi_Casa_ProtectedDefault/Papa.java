/**
 * Esta clase prentende modelar en un sentido abstracto a
 * mi papá el conoce los secretos familiares y yo por se su hijo
 * los conozco tambien
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
package sesion2.Mi_Casa_ProtectedDefault;

public class Papa {
    
    //ATRIBUTOS
    
    /**
    * protected: este modificador de acceso es usado para obligar a que 
    * solo clases que heredan de esta o que esten en el mismo paquete
    * pueden usar el atributo o método (solo tiene sentido en clases o
    * interfaces internas)
    * 
    * Aquí usamos protected porque puedo saber los secretos
    * de la familia por ser parte de ella (de alguna manera puedo decir 
    * que los heredo =D) ademas si vivo en la misma casa pues 
    * de alguna manera los conozco aunque no sea parte de la familia 
    * (por ejemplo si vivo en casa de algún tio)
    *
    * @String secretosFamiliares
    * @access protected
    */
    protected String secretosFamiliares = "Secreto de Familia";
    
}
