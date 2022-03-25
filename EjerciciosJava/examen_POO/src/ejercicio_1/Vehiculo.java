package ejercicio_1;

public class Vehiculo{
	private String marca;
	private String matricula;
	private int num_km;
	private Fecha fecha_matriculacion;
	private String descripcion;
	private double precio;
	private String nombre_propietario;
	private String dni;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getNum_km() {
		return num_km;
	}
	public void setNum_km(int num_km) {
		this.num_km = num_km;
	}
	public Fecha getFecha_matriculacion() {
		return fecha_matriculacion;
	}
	public void setFecha_matriculacion(Fecha fecha_matriculacion) {
		this.fecha_matriculacion = fecha_matriculacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre_propietario() {
		return nombre_propietario;
	}
	public void setNombre_propietario(String nombre_propietario) {
		this.nombre_propietario = nombre_propietario;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Vehiculo() {
		super();
	}
	
	public Vehiculo(String marca, String matricula, int num_km, Fecha fecha_matriculacion, String descripcion,
			double precio, String nombre_propietario, String dni) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.num_km = num_km;
		this.fecha_matriculacion = fecha_matriculacion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nombre_propietario = nombre_propietario;
		this.dni = dni;
	}
	
	public Vehiculo(Vehiculo v) {
		super();
		this.marca = v.marca;
		this.matricula = v.matricula;
		this.num_km = v.num_km;
		this.fecha_matriculacion = v.fecha_matriculacion;
		this.descripcion = v.descripcion;
		this.precio = v.precio;
		this.nombre_propietario = v.nombre_propietario;
		this.dni = v.dni;
	}
	public int getAnios() {
		int edadCoche ;
		Fecha fechaActual = new Fecha(18, 03, 2022);
		if(fechaActual.getMes()<= this.fecha_matriculacion.getMes()) {
			edadCoche= fechaActual.getAño()- this.fecha_matriculacion.getAño();
		}else {
			edadCoche= fechaActual.getAño()- this.fecha_matriculacion.getAño() -1;
		}
		return edadCoche;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", matricula=" + matricula + ", num_km=" + num_km + ", fecha_matriculacion="
				+ fecha_matriculacion + ", descripcion=" + descripcion + ", precio=" + precio + ", nombre_propietario="
				+ nombre_propietario + ", dni=" + dni + "]";
	}
	
	
}
