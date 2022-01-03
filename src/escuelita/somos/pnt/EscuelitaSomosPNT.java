/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelita.somos.pnt;

/**
 *
 * @author JuanPC
 */
public class EscuelitaSomosPNT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mercado mercado = new Mercado();

        //Crea la lista con productos
        mercado.Productos();

        //Imprime lista de productos
        mercado.imprimeProductos();

        //Muestra el producto mas barato y el mas caro
        mercado.maxYmin();
    }

}
