package ejercicio_6;


public class Fecha {
	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha() {
	}
	
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}
	
	public Fecha(Fecha f) {
		this.dia = f.dia;
		this.mes = f.mes;
		this.anyo = f.anyo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getanyo() {
		return anyo;
	}

	public void setanyo(int anyo) {
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		if(dia<10 && mes<10) {
			return "0"+dia+"-0"+mes+"-"+anyo;
		}
		return dia+"-"+mes+"-"+anyo;
	}
	
	public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = anyo > 0;
        mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (esBisiesto(anyo)) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
                
            case 4,6,9,11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }
	public  int diaSiguiente() {
		switch (mes) {
        case 2:
            if (esBisiesto(anyo)&& (dia==29)) {
                dia=1;
            } else {
               dia++;
            }
            break;
            
        case 4,6,9,11:
            if(dia==30) {
            	dia=1;
            }else {
            	dia++;
            }
            break;
        default:
        	if(dia==31) {
            	dia=1;
            }else {
            	dia++;
            }
    }
		return dia;
	}

	private boolean esBisiesto(int anyo) {
		
		return (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0);
	}
	
	
}
