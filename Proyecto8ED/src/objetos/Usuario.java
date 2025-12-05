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

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(String.format("DNI: %s\nNombre: %s\nFecha de Nacimiento: %s\nTeléfono: %d\nReservas: %d", dni, nom,
				fechNac, telf, getReservas().toString()));
		return s.toString();
	}
}
