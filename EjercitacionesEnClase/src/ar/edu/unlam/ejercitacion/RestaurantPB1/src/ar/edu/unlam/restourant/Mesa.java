package ar.edu.unlam.ejercitacion.RestaurantPB1.src.ar.edu.unlam.restourant;

public class Mesa {
	
	private int cantidadDeComensales;
	private int cantidadSentados;
	private int numero;
	private Mozo mozo;
	private Plato [] platos;
	private boolean disponible;
	
	
	public Mesa  (int cantidadDecomensales, int numero, Mozo mozo) {
		this.cantidadDeComensales=cantidadDecomensales;
		this.numero=numero;
		this.mozo=mozo;
		this.platos= new Plato [cantidadDecomensales*10];
		this.disponible=true;
		this.cantidadSentados=0;
		
	}


	public int getCantidadSentados() {
		return cantidadSentados;
	}


	public void setCantidadSentados(int cantidadSentados) {
		this.cantidadSentados = cantidadSentados;
	}


	public int getCantidadDeComensales() {
		return cantidadDeComensales;
	}


	public void setCantidadDeComensales(int cantidadDeComensales) {
		this.cantidadDeComensales = cantidadDeComensales;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Mozo getMozo() {
		return mozo;
	}


	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
	}


	public Plato[] getPlatos() {
		return platos;
	}


	public void setPlatos(Plato[] platos) {
		this.platos = platos;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	
	
	

}
