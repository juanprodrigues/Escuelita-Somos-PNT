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
public class Frutillas extends Productos {
	private String uniPeso;
        
        /**
         * Contrustor de la clase
         * @param nombre
         * @param precio
         * @param uniPeso 
         */
	public Frutillas(String nombre, Integer precio, String uniPeso) {
		super(nombre, precio);
		this.uniPeso=uniPeso;
		}
        /**
         *  
         * @return String
         */
	@Override
	public String toString(){
		String prod="Nombre: "+nombre+" ///"+ "Precio: "+"$"+precio+" ///"+" Unidad de venta: "+uniPeso;
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
