/**
 * En este código se ejemplifican los modificadores de acceso
 * asi como uso en diferentes contextos
 * Además Se aborda una introducción a la programación Orientada
 * a objetos; en como se crea un objeto, como se hace referencia a el 
 * como se crea un clase, como se definen los atributos y como 
 * se aplican los diferentes modificadores de acceso a cada uno de
 * los atributos, los métodos los abordaremos en otra sesion,
 * 
 * para probar el efecto de los modificadores de acceso
 * los invito a modificar el código
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
package sesion2;

import sesion2.Conocidos_Public.ConocidosMain;
import sesion2.La_Sociedad_Static.SociedadMain;
import sesion2.Mi_Casa_ProtectedDefault.CasaMain;

public class Sesion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //objeto tipo sociedad (personas en la calle)
        SociedadMain sociedad = new SociedadMain();
        System.out.println(sociedad.porLaCalle());
        
        //objeto tipo conocidos (Amigos compañeros de clase o de trabajo) 
        ConocidosMain conocidos = new ConocidosMain();
        System.out.println(conocidos.comoTeLLamas());
        
        //objeto tipo casa (los que viven en la misma casa)
        CasaMain casa = new CasaMain();
        System.out.println(casa.DimeComportamientoCasa());
        System.out.println(casa.dimeSecretosFamiliares());
        System.out.println(casa.dimeSecretosFamiliaresYo());
        
    }
    
}
