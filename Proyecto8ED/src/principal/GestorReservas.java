package principal;
import objetos.Usuario;
import objetos.Vuelo;
public class GestorReservas {
	public void principal() {
		Usuario u = new Usuario ("111a", "user1", "1-1-2000", 666111222);
		Vuelo v = new Vuelo ("V-1", "Málaga", "Madrid", 200);
		System.out.println(v.getCapacidadTotal());
		System.out.println(v.getPlazasOcupadas());
		System.out.println(v.plazasDisponibles());
		System.out.println(v.toString());
		setReservas (u, v);
		System.out.println(u.toString());
		borrarReserva (u, v);
		borrarReserva (u, v);
		System.out.println(u.toString());
	}
	public void setReservas (Usuario u, Vuelo v) {
		int i = 0;
		boolean isRegister = false;
		do {
			if (u.getReservas()[i] == null || u.getReservas()[i] == "") {
				u.getReservas()[i] = v.getIdVuelo();
				isRegister = true;
				v.setPlazasOcupadas();
			}
			i++;
		} while (i < u.getReservas().length && isRegister == false);
		if (u.getReservas()[u.getReservas().length-1] != null) {
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