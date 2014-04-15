
/**
 * Clase que sirve de enlace a la clase sumatoria
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

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Mainsumatoria {

     /**
     * Muestra menú principal y evalua las opciones
     *
     * @access public
     * @return  int sumatoria
     * @throws Exception Si el elemento no es encontrado
     */
    public int  mostrarMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        // Usamos el ciclo "do while" para ciclar el menú en caso de que  el 
        // usuario no escoja alguna opción esperada.
        do{
        //mostrarndo menú    
                 System.out.println("GRACIAS! =) ESTA EN EL MENÚ DE SUMATORIA, POR FAVOR SIGA LAS"
                + " INSTRUCCIONES\n"
                + "********************************************************\n"
                + "*  Entre 1 si desea ver el ejemplo ejecutando for      *\n"
                + "*  Entre 2 si desea ver el ejemplo ejecutando while    *\n"
                + "*  Entre 3 si desea ver el ejemplo ejecutando do while *\n"
                + "********************************************************\n");
        // creamos un scanner como listener (aplicación del patron observer)
        // para poder escuchar las entradas del teclado
        opcion = teclado.nextInt();
        }
        while(opcion > 3 || opcion < 1);
        // retornamos el valor que nos devuelve la funcion ejecutar 
        // la palabra reservada this la veremos en las siguientes sesiones
        // esto ilsutra el uso de el modificador de acceso private
        return this.ejecutar(opcion, teclado);
    }

     /**
     * Ejecuta y evalua las opciones para implementar
     * los ciclos
     * @access private
     * @param  int opcion
     * @param  Scanner teclado
     * @return sumatoria 
     */
    private int ejecutar(int opcion, Scanner teclado) {
        //creamos nuestro objeto (este tema será aboradado en las siguientes sesiones)
        Sumatoria suma = new Sumatoria();
        //alamcena el valor devuelto por los métodos de la clase sumatoria
        int sumatoria = 0;    
        // Usamos switch por tener mas de dos opciones (esto no es un estandar)
        System.out.println("****Por favor entre un número...****");
        switch (opcion) {
            case 1: {
                int numero = teclado.nextInt();
                sumatoria = suma.usaFor(numero);
            }
            break;
            case 2: {
                int numero = teclado.nextInt();
                sumatoria = suma.usaWhile(numero);
            }
            break;
            case 3: {
                int numero = teclado.nextInt();
                sumatoria = suma.usaDoWhile(numero);
            }
            break;
        }
        return sumatoria;
    }
    
}
