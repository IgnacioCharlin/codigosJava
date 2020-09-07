package ar.edu.unlam.ejercitacion.RestaurantPB1.src.ar.edu.unlam.restourant;

public class Mozo {
	
	private String nombre;
	private String apellido;
	
	public Mozo(String nombre, String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	

}
