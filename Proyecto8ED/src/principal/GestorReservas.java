package principal;
import objetos.Usuario;
import objetos.Vuelo;
public class GestorReservas {
	public void principal() {
		
		/*
		Realizar funciones que permitan que el usuario -> función para borrar la reserva (Versión 2) y por último en la versión 3 poder imprimir las reservas con otra función
		*/
	}
	public void setReservas (Usuario u, Vuelo v) {
		int i = 0;
		boolean isRegister = false;
		do {
			if (u.getReservas()[i].isEmpty() || u.getReservas()[i] == "") {
				u.getReservas()[i] = v.getIdVuelo();
				isRegister = true;
			}
			i++;
		} while (i < u.getReservas().length || isRegister == false);
		if (u.getReservas()[u.getReservas().length-1].isBlank() || u.getReservas()[u.getReservas().length-1].isEmpty()) {
			System.out.println("No se le pueden asignar más reservas a este usuario, asegurate de eliminar alguna de las que ya tiene");
		}
	}
	public void borrarReserva(Usuario u, Vuelo v) {
		boolean isDelete=false;
		for (int i = 0; i < u.getReservas().length; i++) {
			if (v.getIdVuelo() == u.getReservas()[i]) {
				u.getReservas()[i] = "";
				isDelete=true;
			}
		}
		if (isDelete == false) {
			System.out.println("Este usuario no tiene ese vuelo reservado");
		}
	}
	public static void main(String[] args) {
		new GestorReservas().principal();
	}
}