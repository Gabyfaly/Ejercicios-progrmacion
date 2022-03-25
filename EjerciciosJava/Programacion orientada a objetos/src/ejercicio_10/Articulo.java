package ejercicio_10;

public class Articulo {
	private String codigo = "LIBRE";
	private String descripcion;
	private double precio_compra;
	private double precio_venta;
	private int stock;
	
	
	
	
	public Articulo() {
	}
	public Articulo(String codigo, String descripcion, double precio_compra, double precio_venta, int stock) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
		this.stock = stock;
	}
	public Articulo(Articulo art) {
		this.codigo=art.codigo;
		this.descripcion = art.descripcion;
		this.precio_compra = art.precio_compra;
		this.precio_venta = art.precio_venta;
		this.stock = art.stock;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String toString() {
	    String cadena = "------------------------------------------";
	    cadena += "\nCódigo: " + this.codigo;
	    cadena += "\nDescripción: " + this.descripcion;
	    cadena += "\nPrecio de compra: " + this.precio_compra;
	    cadena += "\nPrecio de venta: " + this.precio_venta;
	    cadena += "\nStock: " + this.stock + " unidades";
	    cadena += "\n------------------------------------------";
	    return cadena;
	  }
	
}
