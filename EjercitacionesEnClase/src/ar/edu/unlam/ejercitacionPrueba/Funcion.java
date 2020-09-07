package ar.edu.unlam.ejercitacionPrueba;

public class Funcion {
	private String diaYHora;
	private String pelicula;
	private int aptaParaMayoresDe;
	private Sala sala;
	private Espectador reservas[];
	
	public Funcion(String diaYHora, String pelicula, int aptaParaMayoresDe, Sala sala) {
		this.diaYHora= diaYHora;
		this.pelicula = pelicula;
		this.aptaParaMayoresDe= aptaParaMayoresDe;
		this.sala=sala;
		reservas = new Espectador[500];
	}
	
	public boolean reservar(Espectador nuevo) {
		boolean sePudo = false;
		if (nuevo.getEdad()>aptaParaMayoresDe) {
			for (int i = 0; i < reservas.length; i++) {
				if(reservas[i]== null) {
					reservas[i] = nuevo;
					sePudo = true;
				}
			}
		}
		return sePudo;
		
		/*
		 * Realiza una reserva para la funci�n (siempre que el espectador est� habilitado por su edad)
		 * 
		 */		
		
	}
	
	public Espectador buscarReserva(int dni) {
		/*
		 * A partir de un DNI busca un espectador en la lista de reservas de la funci�n
		 */
		for (int i = 0; i < reservas.length; i++) {
			if (reservas[i]!= null) {
				if(reservas[i].getDni() == dni) {
					return reservas[i];
				}
			}
		}
		return null;
	}
	
	public Espectador[] getReservas() {
		return reservas;
		/*
		 * Devuelve la lista de reservas realizadas
		 */
	}	
}
