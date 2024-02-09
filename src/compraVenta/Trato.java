package compraVenta;

import java.util.Iterator;

import usuario.Comprador;
import usuario.Vendedor;

public class Trato {
	// Atributos
	private Producto producto;
	private Vendedor vendedor;
	private Comprador comprador;

	// Constructor
	public Trato(Producto producto, Vendedor vendedor, Comprador comprador) {
		setProducto(producto);
		setComprador(comprador);
		setVendedor(vendedor);
	}

	// Getters y Setters
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	// Metodos
	public boolean posibleCompra(Comprador comprador, Producto producto, Vendedor vendedor) {
		for (int i = 0; i < (vendedor.getProductosVendidos().length); i++) {
			if (vendedor.getProductosVendidos()[i].equals(producto)) {
				if (comprador.getSaldo() >= producto.getPrecio()) {
					return true;
				}
			}
		}
		return false;
	}

	public void validarCompra(Producto producto, Vendedor vendedor, Comprador comprador) {
		int indiceArray = -1;

		Producto[] nuevoArrayVentas = {};

		Producto[] nuevoArrayCompras = {};

		Producto[] disponible = vendedor.getProductosVendidos();

		Producto[] vendido = comprador.getProductosComprados();

		if (posibleCompra(comprador, producto, vendedor)) {
			for (int i = 0; i < disponible.length; i++) {
				if (disponible[i].equals(producto)) {
					indiceArray = i;
				}
			}
			if (indiceArray == -1) { 
				throw new IllegalArgumentException("No esta disponible");
			}
			
			vendedor.quitarTrasCompra(indiceArray);
			comprador.addComprados(producto);
			/*
			 * // Cambiamos el array de disponibles
			 * 
			 * System.arraycopy(disponible, 0, nuevoArrayVentas, 0, indiceArray);
			 * System.arraycopy(disponible, indiceArray + 1, nuevoArrayVentas, indiceArray,
			 * disponible.length - 1 - indiceArray);
			 * 
			 * vendedor.setProductosVendidos(nuevoArrayVentas);
			 * 
			 * // Cambiamos el array de vendidos
			 * 
			 * System.arraycopy(vendido, 0, nuevoArrayCompras, 0, vendido.length + 1);
			 * nuevoArrayCompras[vendido.length] = producto;
			 * 
			 * vendedor.setProductosVendidos(nuevoArrayCompras);
			 */
		}

	}

}
