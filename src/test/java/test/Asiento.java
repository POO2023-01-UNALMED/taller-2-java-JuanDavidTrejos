package test;

public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	int obtenerRegistro() {
    	return registro;
    }
	
	public void cambiarColor(String color) {
		if (color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("verde") || color.equalsIgnoreCase("amarillo") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("blanco")) {
			this.color = color;
		}
	}
			
}
	

