/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

/**
 *
 * @author gustavo
 */
public class Sumatoria {

    //usa "for" para realizar la sumatoria
    public int useFor(int numero) {
        //este valor nos sive para realizar la sumatoria
        int sumatoria = 0;
        /*
        * Dentro de la sintaxis de "for" podemos definir nuestro contador
        * el cual nos sirve para contabilizar la veces que tenemos que sumar 
        */
        for (int contador = 0; contador <= numero; contador++) {
            //realizamos la sumatoria
            sumatoria += contador;
        }
        return sumatoria;
    }

    //usa el cilco while para realizar la sumatoria
    public int useWhile(int numero) {
        //este valor nos sive para realizar la sumatoria
        int sumatoria = 0;
        // en la sintaxis de while la definición del contador va fuera del 
        // bloque "while" 
        int contador = 0;
        //cilco while dentro de "()" ponemos la condición del ciclo
        while (contador <= numero) {
            //realizamos la sumatoria
            sumatoria += contador;
            //incrementamos contador
            contador++;
        }
        return sumatoria;
    }

    public int useDoWhile(int numero) {
        int sumatoria = 0;
        int contador = 0;
        do {

            sumatoria += contador;
        } while (contador <= numero);
        return sumatoria;
    }

}
