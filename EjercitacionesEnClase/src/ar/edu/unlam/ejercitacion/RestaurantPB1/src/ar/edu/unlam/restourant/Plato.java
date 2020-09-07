package ar.edu.unlam.ejercitacion.RestaurantPB1.src.ar.edu.unlam.restourant;

public class Plato {
	private String nombre;
	private String descripcion;
	private double importe;
	public Plato(String nombre, String descripcion, double importe) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.importe=importe;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	

}
