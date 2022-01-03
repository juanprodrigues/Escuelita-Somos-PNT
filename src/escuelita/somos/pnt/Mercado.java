/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelita.somos.pnt;

 
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author JuanPC
 */
public class Mercado {
	
	private List<Productos> listaDeProductos;
	
	public Mercado() {
		this.listaDeProductos=new LinkedList<>();
	}
	
	public void agregarProducto(Productos prod){
		this.listaDeProductos.add(prod);
	}

	//Crea la lista
	public void Productos() {
		Productos p1=new CocaCola("Coca-Cola Zero", 20,1.5);
		Productos p2=new CocaCola("Coca-Cola", 18,1.5);
		Productos p3=new Shampoo("Shampoo Sedal", 19, 500);
		Productos p4=new Frutillas("Frutillas",64,"kilo" );
		//Los agrega a la lista
		this.agregarProducto(p1);
		this.agregarProducto(p2);
		this.agregarProducto(p3);
		this.agregarProducto(p4);
	}
	
	//Metodo que muestra todos los productos y sus propiedades
	public void imprimeProductos() {
		for ( Productos producto : listaDeProductos) {
			producto.detalles();
		}
		System.out.println("=============================");
	}
	
	//Metodo que recorre la listas e imprime el producto mas barato y mas caro
	public void maxYmin(){
		Productos min, max;
		max=this.listaDeProductos.get(0);
		min=this.listaDeProductos.get(0);
		for(Productos producto: listaDeProductos){
			if(producto.compareTo(max)>0){
				max=producto;
			}
			if(producto.compareTo(min)<0){
				min=producto;
			}
		}
		System.out.println("Producto mas caro: "+max.getNombre()+"\n"+""
				+ "Producto mas barato: "+min.getNombre());
	}
}
