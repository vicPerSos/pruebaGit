package usuario;

import compraVenta.Producto;

public class Comprador {
	// Atributos
	private String nombre;
	private Producto[] productosComprados;
	private double saldo;

	// Constructor
	public Comprador(String nombre) {
		setNombre(nombre);
		setSaldo(0.0);
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto[] getProductosComprados() {
		return productosComprados;
	}

	public void setProductosComprados(Producto[] productosComprados) {
		this.productosComprados = productosComprados;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//Metodos
	public void addComprados(Producto producto) {
		Producto p[] = null;
			this.productosComprados[this.productosComprados.length-1]=producto;
			System.arraycopy(productosComprados, 0, p, 0, productosComprados.length+1);

	}

	public boolean validar(boolean aceptar) {
		return aceptar;
	}
	

}
