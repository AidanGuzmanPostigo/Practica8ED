package objetos;

public class Usuario {
	/*
	 * TODO: Versión 3 -> Añadir ToString.
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

	public String getDni() {
		return dni;
	}

	public String getNom() {
		return nom;
	}

	public String getFechNac() {
		return fechNac;
	}

	public int getTelf() {
		return telf;
	}

	public StringBuilder getReservas() {
		StringBuilder s = new StringBuilder();
		if (s.isEmpty()) {
			return s.append("Este usuario no tiene reservas");
		} else {
			for (int i = 0; i < reservas.length; i++) {
				if (reservas[i] != null || reservas[i] != "") {
					s.append(reservas[i] + ", ");
				}
			}
		}
		return s;
	}

	public void setReservas(String s) {
		int i = 0;
		boolean isRegister = false;
		do {
			if (reservas[i].isEmpty() || reservas[i] == "") {
				reservas[i] = s;
				isRegister = true;
			}
			i++;
		} while (i < reservas.length || isRegister == false);
	}
}
