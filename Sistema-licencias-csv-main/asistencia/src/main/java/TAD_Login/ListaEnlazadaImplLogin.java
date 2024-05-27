package TAD_Login;

import Entidad.Login;

public class ListaEnlazadaImplLogin implements ListaInterfaceLogin {
	
	private NodoLogin cabeza;

	public ListaEnlazadaImplLogin() {
		this.cabeza = null;
	}

	@Override
	public void insertar(Login login) {
		NodoLogin nuevoNodo = new NodoLogin(login);
		if (cabeza == null) {
			cabeza = nuevoNodo;
		} else {
			NodoLogin actual = cabeza;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevoNodo);
		}
	}

	@Override
	public boolean eliminar(String id_Usuario) {
		if (cabeza == null) {
			return false;
		}
		if (cabeza.getLogin().getId_Usuario().equals(id_Usuario)) {
			cabeza = cabeza.getSiguiente();
			return true;
		}
		NodoLogin actual = cabeza;
		while (actual.getSiguiente() != null) {
			if (actual.getSiguiente().getLogin().getId_Usuario().equals(id_Usuario)) {
				actual.setSiguiente(actual.getSiguiente().getSiguiente());
				return true;
			}
			actual = actual.getSiguiente();
		}
		return false;
	}

	@Override
	public Login buscar(String id_Usuario) {
		NodoLogin actual = cabeza;
		while (actual != null) {
			if (actual.getLogin().getId_Usuario().equals(id_Usuario)) {
				return actual.getLogin();
			}
			actual = actual.getSiguiente();
		}
		return null;
	}

	@Override
	public void mostrar() {
		NodoLogin actual = cabeza;
		while (actual != null) {
			Login login = actual.getLogin();
			System.out.println("ID Usuario: " + login.getId_Usuario() + ", Contraseña: " + login.getContra()
					+ ", ID Admin: " + login.getId_admini());
			actual = actual.getSiguiente();
		}
	}

	@Override
	public boolean estaVacia() {
		return cabeza == null;
	}
}
