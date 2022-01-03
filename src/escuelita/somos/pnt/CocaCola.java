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
public class CocaCola extends Productos {

    private Double litros;

    /**
     *
     * @param nombre
     * @param precio
     * @param litros
     */
    public CocaCola(String nombre, Integer precio, Double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        String prod = "Nombre: " + nombre + " ///" + " Litros: " + litros + " ///" + " Precio: " + "$" + precio;
        return prod;
    }

    /**
     * Sobreescribimos el metodo heredado
     */
    @Override
    public void detalles() {
        System.out.println(this.toString());

    }

}
