package ejercicio_7;

public class Empleado {
	private String nif;
	private String nombre;
	private int sueldoBase;
	private int horasExtras;
	private double irpf;
	private boolean casado;
	private int numHijos;
	private static int importeHoraExtra;
	
	public Empleado() {
	}
	
	public Empleado(String nif) {
		this.nif=nif;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}
	
	public static int getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(int importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}
	
	public int ComplementoHorasExtras() {
		
		return this.horasExtras*this.importeHoraExtra;
	}
	public int sueldoBruto() {
		return this.sueldoBase + ComplementoHorasExtras();
	}
	public double retencionIRPF() {
		double retencion=0;
		if(this.casado==true) {
			this.irpf-=2.0;
			
		}
		this.irpf=this.irpf-numHijos;
			retencion= (this.sueldoBruto()* this.irpf)/100;
		
		return retencion;
	}
}
