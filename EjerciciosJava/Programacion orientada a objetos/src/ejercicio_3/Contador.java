package ejercicio_3;

public class Contador {
	
	private int cont;

	public Contador() {
		
	}

	public Contador(int cont) {
		this.cont = cont;
		if(cont<0) {
			cont=0;
		}
	}
	public  Contador(Contador contador) {
		this.cont=contador.cont;
	}
	

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	public int incrementa() {
		this.cont=cont+1;
		return cont;
	}
	public int decrementar () {
		this.cont=cont-1;
		if(cont<0) {
			cont=0;
			return cont;
		}
		
		return cont;
	}

	@Override
	public String toString() {
		return "Contador [cont=" + cont + "]";
	}
	
	
	
	

}
