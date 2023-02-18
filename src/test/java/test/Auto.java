package test;

public class Auto {
	
	public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public int cantidadCreados;
    
    int obtenerRegistro() {
    	return registro;
    }
    
    public int cantidadAsientos() {
    	int count = 0;
    	for (int i = 0; i < asientos.length; i++) {
    	    if (asientos[i] != null) {
    	    	count++;
    	    }
    	}
    	return count;
    }
	public String verificarIntegridad() {
		if (this.registro != this.motor.registro) {
	        return "Las piezas no son originales";
	    }
	    for (int i = 0; i < this.asientos.length; i++) {
	        if (this.asientos[i] != null && this.asientos[i].registro != this.registro) {
	            return "Las piezas no son originales";
	        }
	    }
	    return "Auto original";
	}
		
}