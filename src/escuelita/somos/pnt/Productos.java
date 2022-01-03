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
public abstract class Productos implements Comparable<Productos> {

    protected String nombre;
    protected Integer precio;

    /**
     *
     * @param nombre
     * @param precio
     */
    public Productos(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    //Devuelve el nombre que se va a mostrar cuando muestra el mas caro y barato

    public String getNombre() {
        return nombre;
    }

    //Metodo que tiene que ser reemplazado para cargar todos los objetos 
    public abstract void detalles();

    //Metodo para comparar los precios de los productos
    @Override
    public int compareTo(Productos o) {

        return this.precio > o.precio ? 1 : this.precio < o.precio ? -1 : 0;
    }

}
