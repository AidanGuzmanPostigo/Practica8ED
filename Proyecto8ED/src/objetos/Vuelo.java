package objetos;

public class Vuelo {
	/*
	 * TODO: Hacerlo por versiones: Versión 2 -> Añadir getters y setter, Versión 3
	 * -> Añadir ToString y un método que devuelva cuantas plazas hay libres
	 */
	private String idVuelo, origen, destino;
	private int capacidadTotal, plazasOcupadas;

	public Vuelo(String idVuelo, String origen, String destino, int capacidadTotal) {
		this.idVuelo = idVuelo;
		this.origen = origen;
		this.destino = destino;
		this.capacidadTotal = capacidadTotal;
	}
}
