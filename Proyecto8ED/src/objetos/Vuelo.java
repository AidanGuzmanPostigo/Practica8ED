package objetos;

public class Vuelo {
	/*
	 * TODO: Hacerlo por versiones:Versión 3 -> Añadir ToString y un método que
	 * devuelva cuantas plazas hay libres
	 */
	private String idVuelo, origen, destino;
	private int capacidadTotal, plazasOcupadas;

	public Vuelo(String idVuelo, String origen, String destino, int capacidadTotal) {
		this.idVuelo = idVuelo;
		this.origen = origen;
		this.destino = destino;
		this.capacidadTotal = capacidadTotal;
	}

	public String getIdVuelo() {
		return idVuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public int getCapacidadTotal() {
		return capacidadTotal;
	}

	public int getPlazasOcupadas() {
		return plazasOcupadas;
	}
}
