package usuario;

import compraVenta.Producto;

public class Vendedor {
	// Atributos
	private String nombre;
	private Producto[] productosVendidos;

	// Constructor
	public Vendedor(String nombre, Producto[] productosVendidos) {
		setNombre(nombre);
		this.productosVendidos = new Producto[10];
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto[] getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(Producto vendido, int i) {
		this.productosVendidos[i] = vendido;
	}

	// Metodos
	public void addToVendidos(Producto producto) {
		for (int i = 0; i < getProductosVendidos().length; i++) {
			if (this.productosVendidos[i] != null)
				this.productosVendidos[i] = producto;
		}
		throw new IllegalArgumentException("El producto escede nuestro numero maximo de catalogo");

	}

	public boolean validar(boolean aceptar) {
		return aceptar;
	}

	public void quitarTrasCompra(int i) {
		this.productosVendidos[i] = null;

	}
}
