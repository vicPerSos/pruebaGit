package compraVenta;

import compraVenta.enumerados.EstadoProducto;

public class Producto {
	// Atributos
	private int codigo;
	private String nombre;
	private double precio;
	private EstadoProducto estado;

	// Atributos estaticos
	private int contId = 1;

	// Constructor
	public Producto(int codigo, String nombre, double precio, EstadoProducto estado) {
		this.codigo = contId + 1;
		setNombre(nombre);
		setPrecio(precio);
		setEstado(estado);
		contId++;
	}

	// Getters y setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio < 0) {
			throw new IllegalArgumentException("El precio no debe ser menor a 0. ");
		}
		this.precio = precio;
	}

	public EstadoProducto getEstado() {
		return estado;
	}

	public void setEstado(EstadoProducto estado) {
		this.estado = estado;
	}

	public int getContId() {
		return contId;
	}

	public void setContId(int contId) {
		this.contId = contId;
	}

}
