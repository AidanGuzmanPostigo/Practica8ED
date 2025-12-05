package objetos;

public class Vuelo {

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

	public int plazasDisponibles() {
		return capacidadTotal - plazasOcupadas;
	}

	public String toString() {
		return String.format(
				"El id de vuelo es %s, el origen es %s, el destino es %s, su capacidad total es de %d	 y tiene %d plazas ocupadas",
				idVuelo, origen, destino, capacidadTotal, plazasOcupadas);
	}
}
