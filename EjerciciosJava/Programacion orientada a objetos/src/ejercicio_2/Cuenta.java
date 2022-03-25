package ejercicio_2;

public class Cuenta {

	private String nombre;
	private String num_cuenta;
	private double tipo_interes;
	private double saldo;
	
	//constructor por defecto
	public Cuenta() {
		
	}
	// Constructor por parametros
	public Cuenta(String nombre, String num_cuenta, double tipo_interes, double saldo) {
		this.nombre = nombre;
		this.num_cuenta = num_cuenta;
		this.tipo_interes = tipo_interes;
		this.saldo = saldo;
	}
	// Constructor copìa
	public Cuenta(Cuenta cuentaBanco) {
		this.nombre = cuentaBanco.nombre;
		this.num_cuenta = cuentaBanco.num_cuenta;
		this.tipo_interes = cuentaBanco.tipo_interes;
		this.saldo = cuentaBanco.saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNum_cuenta() {
		return num_cuenta;
	}
	public void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
	}
	public double getTipo_interes() {
		return tipo_interes;
	}
	public void setTipo_interes(double tipo_interes) {
		this.tipo_interes = tipo_interes;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	} 
	public  boolean ingreso(double dineroIngreso) {
		boolean resultado =true;
		
		if(dineroIngreso < 0) {
			resultado= false;
		}else {
			saldo = saldo+ dineroIngreso;
		}
		
		return resultado;
	}
	
	public boolean reintegro( double operacion) {
		 boolean resultado= true;
		 if(operacion < 0 && saldo < operacion) {
			 resultado= false;
		 }else {
			 saldo -= operacion;
		 }
		return resultado;
	}
	
	public boolean transferencia(Cuenta destino,double cantidad) {
		boolean resultado = true;
		if(saldo < 0) {
			resultado = false;
		}else {
			destino.saldo += cantidad;
		}
		return resultado;
	}
	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", num_cuenta=" + num_cuenta + ", tipo_interes=" + tipo_interes + ", saldo="
				+ saldo + "]";
	}

  
	
	
}
