package ejercicio_5;

public class Fraccion {
	private int num;
	private int den;
	
	
	public Fraccion() {
	}
	
	public Fraccion(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	public Fraccion(final Fraccion fr) {
		this.num = fr.num;
		this.den = fr.den;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
		//Cálculo del máximo común divisor                                                        
		private int mcd(){
		     int u = Math.abs(num);                                                                                       
		     int v = Math.abs(den);
		     if(v == 0){
		          return u;
		     }
		     int r;
		     while(v != 0){
		          r = u % v;
		          u = v;
		          v = r;
		     }
		     return u;
		}
	    //método para simplificar fracciones
	    private void simplificar() {
	        int n = mcd(); //se calcula el mcd de la fracción
	        num = num / n;
	        den = den / n;
	    }
	
	
		public Fraccion sumar(Fraccion f) {
	        Fraccion aux = new Fraccion();  //fracción para guardar la suma                                           
	        aux.num = this.num * f.den + this.den * f.num;
	        aux.den = this.den * f.den;
	        aux.simplificar();//se simplifica antes de devolverla                                                   
	        return aux;
	}
		public Fraccion restar(Fraccion f) {
	        Fraccion aux = new Fraccion();  //fracción para guardar la suma                                           
	        aux.num = this.num * f.den - this.den * f.num;
	        aux.den = this.den * f.den;
	        aux.simplificar();//se simplifica antes de devolverla                                                   
	        return aux;
	}
		public Fraccion multiplicar(Fraccion f) {
	        Fraccion aux = new Fraccion();  //fracción para guardar la suma                                           
	        aux.num = this.num * f.num;
	        aux.den = this.den * f.den;
	        aux.simplificar();//se simplifica antes de devolverla                                                   
	        return aux;
	}
		public Fraccion dividir(Fraccion f) {
	        Fraccion aux = new Fraccion();  //fracción para guardar la suma                                           
	        aux.num = this.num * f.den;
	        aux.den = this.den * f.num;
	        aux.simplificar();//se simplifica antes de devolverla                                                   
	        return aux;
	}
		

	@Override
	public String toString() {
		return num + "/"+ den;
	}
	
	

}
