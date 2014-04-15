/**
 * En este ejemplo, por facilidad y rapidez se 
 * ocupan clases y objetos, cabe mencionar que 
 * este NO es el objetivo del código aqui expuesto
 * si no el de ilustrar el uso de condionales y ciclos 
 * en java; Además,los programas carecen de validaciones que mas adelante 
 * abordaremos
 * si gustan adentrarse a la POO en java y tienen algunas dudas
 * no duden en contactarme, de cualquier forma en las sesiones posteriores 
 * al curso abordaremos el tema.
 *  
 *
 *
 * LICENSE: GNU
 *
 * @category   POO java
 * @package    sesion1
 * @license    http://www.gnu.org/licenses/gpl.txt  GNU GPL 3.0
 * @version    0.1
 * @author     Gustavo Zepeda <gustavo@hightechcoders.com>
 * @link       www.hightechcoders.com/curso
 * @since      File available since Release 0.1
 */

package session1;

//importamos las clases necesaria para el ejemplo
import ciclos.Mainsumatoria;
import condicionales.MainEscogecolor;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Session1 {


    /**
     * Método principal de java
     *
     * @access public static 
     * @param  String[] args se usa para pasar pametros al método main
     * @return void
     * @throws Exception Si el elemento no es encontrado
     */
    public static void main(String[] args) {
        
        //variable para la opción de usuario
        int opcion = 0;
        // Usamos el ciclo "do while" para ciclar el menú en caso de que  el 
        // usuario no escoja alguna opción esperada.
        do{
        // Mostramos menu al usuario
        System.out.println("POR FAVOR SIGA LAS INTRUCCIONES DEL MENÚ\n"
        + "********************************************************\n"
        + "*  Entre 1 si desea ver el ejemplo de sumatoria        *\n"
        + "*  Entre 2 si desea ver el ejemplo de condicionales    *\n"
        + "********************************************************\n");        
        // creamos un scanner como listener (aplicación del patron observer)
        // para poder escuchar las entradas del teclado
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextInt();
        //creamos lo objetos que nos permiten elegir que ejemplo visualizar        
        }while(opcion > 2 || opcion < 1);        
        // verificamos que opción escogio el usuario con if else por ser nada
        // mas 2 opciones posibles
        if(opcion == 1){
            Mainsumatoria mainsuma = new Mainsumatoria();
            int resultado = mainsuma.mostrarMenu();
             System.out.println("EL RESULTADO ES: **"+resultado+"**\n");
        }else if(opcion == 2){
            MainEscogecolor escogecolor = new MainEscogecolor();
            String resultado = escogecolor.mostrarMenu();
             System.out.println("EL RESULTADO ES: **"+resultado+"**\n");
        }
        
    }
    
}
