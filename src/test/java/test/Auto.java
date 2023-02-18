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
		return asientos.length;
	}
	public String verifyIntegrity() {
        for (Asiento asiento : asientos) {
            if (asiento.obtenerRegistro() != registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
		
}