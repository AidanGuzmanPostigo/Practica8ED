package objetos;

public class Usuario {
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

	public String[] getReservas() {
		return reservas;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < reservas.length; i++) {
			if (reservas[i] != null && reservas[i] != "") {
				s.append(reservas[i] + ", ");
			}
		}
		if (s.isEmpty()) {
			s.append("Este usuario no tiene reservas");
		}
		return String.format("DNI: %s\nNombre: %s\nFecha de Nacimiento: %s\nTeléfono: %d\nReservas: %s", dni, nom,
				fechNac, telf, s.toString());
	}
}