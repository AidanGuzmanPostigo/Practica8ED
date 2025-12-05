package objetos;

public class Usuario {
	/*
	 * TODO: Versión 2 -> Añadir getters y setter, Versión 3 -> Añadir ToString.
	 */
	private String dni, nom, fechNac;
	private int telf;
	private String[] reservas;

	public Usuario(String dni, String nom, String fechNac, int telf) {
		this.dni = dni;
		this.nom = nom;
		this.fechNac = fechNac;
		this.telf = telf;
		reservas = new String[20];
	}
}
