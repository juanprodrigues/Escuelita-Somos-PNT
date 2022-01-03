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
public class Shampoo extends Productos {

    private Integer contenido;

    public Shampoo(String nombre, Integer precio, Integer contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        String prod = "Nombre: " + nombre + " ///" + " Contenido: " + contenido + " ml" + " ///" + " Precio: " + "$" + precio;
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
