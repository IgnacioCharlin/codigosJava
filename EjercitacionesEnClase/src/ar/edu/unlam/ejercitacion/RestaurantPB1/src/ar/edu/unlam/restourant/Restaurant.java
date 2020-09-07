package ar.edu.unlam.ejercitacion.RestaurantPB1.src.ar.edu.unlam.restourant;

public class Restaurant {

	private String nombre;
	private Mesa[][] distribucion;


	public Restaurant(String nombre, int fila, int columna) {
		this.nombre = nombre;
		this.distribucion = new Mesa[fila][columna];

	}

	public void armarSalon(int fila, int columna, Mesa mesa) {

		this.distribucion[fila][columna] = mesa;

	}

	public boolean abrirMesa(int fila, int columna, int cantidadDePersonas, Mozo mozo) {

		if (verificarPosicion(fila, columna, cantidadDePersonas) == true) {
			this.distribucion[fila][columna].setDisponible(false);
			this.distribucion[fila][columna].setCantidadSentados(cantidadDePersonas);
			this.distribucion[fila][columna].setMozo(mozo);
			return true;
		}
		return false;

	}

	private boolean verificarPosicion(int fila, int columna, int cantidadDePersonas) {

		if (distribucion[fila][columna] != null)
			if (cantidadDePersonas <= distribucion[fila][columna].getCantidadDeComensales()
					&& distribucion[fila][columna].isDisponible())
				return true;

		return false;

	}

	public void informarMesaySuCantidad() {

		for (int i = 0; i < distribucion.length; i++)
			for (int j = 0; j < distribucion[i].length; j++)
				if (this.distribucion[i][j] != null)
					if (distribucion[i][j].isDisponible())
						System.out.println("la mesa " + distribucion[i][j].getNumero() + " tiene "
								+ distribucion[i][j].getCantidadDeComensales() + " cantidad de comensales");

	}

	public void mostrarMozoMesa(int fila, int columna) {
		if (this.distribucion[fila][columna] != null)
			System.out.println("el mozo es " + this.distribucion[fila][columna].getMozo().getApellido());
	}

	public Mozo obtenerMozoMesa(int fila, int columna) {
		if (this.distribucion[fila][columna] != null)
			return this.distribucion[fila][columna].getMozo();
		return null;
	}
	
	public double calcularTotalMesa (int fila, int columna) {
		
		double total=0.0;
		
		if (this.distribucion[fila][columna]==null)
			return total;
		
		
		Plato [] listaPedido = this.distribucion[fila][columna].getPlatos();
			
		for (int i = 0; i < listaPedido.length; i++) {
			total+=listaPedido[i].getImporte();
		
		}
		
		return total;
	}
	
	public double cantidadFacturadoEnElDia() {
		double totalEnEldia=0.0;
		for (int i = 0; i < distribucion.length; i++) {
			for (int j = 0; j < distribucion.length; j++) {
				
				totalEnEldia+=calcularTotalMesa(i,j);
			}
			
		}
		return totalEnEldia;
	}
	
	

}
