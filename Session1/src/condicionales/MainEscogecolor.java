/**
 * Clase de enlace con la clase Escoge color
 *
 *
 * LICENSE: GNU
 *
 * @category POO java
 * @package condicionales
 * @license http://www.gnu.org/licenses/gpl.txt GNU GPL 3.0
 * @version 0.1
 * @author Gustavo Zepeda <gustavo@hightechcoders.com>
 * @link       www.hightechcoders.com/curso
 * @since      File available since Release 0.1
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class MainEscogecolor {

    /**
     * Muestra menú
     *
     * @access public
     * @return String color
     */
    public String mostrarMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        // Usamos el ciclo "do while" para ciclar el menú en caso de que  el 
        // usuario no escoja alguna opción esperada.
        do {
            //mostrarndo menú    
            System.out.println("GRACIAS! =) ESTA EN EL MENÚ DE CONDICIONALES, POR FAVOR SIGA LAS"
                    + " INSTRUCCIONES\n"
                    + "********************************************************\n"
                    + "*  Entre 1 si desea ver el ejemplo ejecutando if else  *\n"
                    + "*  Entre 2 si desea ver el ejemplo ejecutando switch   *\n"
                    + "********************************************************\n");
            // creamos un scanner como listener (aplicación del patron observer)
            // para poder escuchar las entradas del teclado
            opcion = teclado.nextInt();
        } while (opcion > 3 || opcion < 1);
        return this.ejecutar(opcion, teclado);
    }

    /**
     * Evaluamos las opciones y nuevamente hacemos uso del ciclo while para
     * forzar al usuario a que elegia una opción válida
     *
     * @access private
     * @param int opcion
     * @param Scanner teclado
     * @return color
     *
     */
    private String ejecutar(int opcion, Scanner teclado) {
        String color = "";
        int opcionColor = 0;
        String menu = "=) AHORA POR FAVOR ESCOJA UN COLOR \n"
                + "**********************\n"
                + "*  Entre 1 Verde     *\n"
                + "*  Entre 2 Rojo      *\n"
                + "*  Entre 3 Amarillo  *\n"
                + "**********************\n";
        Escogecolor escoge = new Escogecolor();
        if (opcion == 1) {
            do {
                System.out.println(menu);
                opcionColor = teclado.nextInt();
            } while ((color = escoge.useIfElse(opcionColor)) == null);
        } else if (opcion == 2) {
            do {
                System.out.println(menu);
                opcionColor = teclado.nextInt();
            } while ((color = escoge.userSwitch(opcionColor)) == null);
        }
        return color;
    }

}
