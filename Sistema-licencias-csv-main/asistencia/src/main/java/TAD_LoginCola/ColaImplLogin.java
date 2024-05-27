package TAD_LoginCola;

import Entidad.Login;

public class ColaImplLogin implements ColaInterfaceLogin {

	private Login[] elementos;
	private int frente;
	private int fin;

	public ColaImplLogin() {
		this.elementos = new Login[0];
		this.frente = -1;
		this.fin = -1;
	}

	@Override
	public void encolar(Login login) {
		if (estaVacia()) {
			elementos = new Login[1];
			elementos[0] = login;
			frente = 0;
			fin = 0;
		} else {
			Login[] nuevoArreglo = new Login[elementos.length + 1];
			for (int i = 0; i < elementos.length; i++) {
				nuevoArreglo[i] = elementos[i];
			}
			nuevoArreglo[elementos.length] = login;
			elementos = nuevoArreglo;
			fin++;
		}
	}

	@Override
	public Login desencolar() {
		if (estaVacia()) {
			System.out.println("La cola está vacía, no se puede desencolar.");
			return null;
		}
		Login login = elementos[frente];
		if (frente == fin) {
			elementos = new Login[0];
			frente = -1;
			fin = -1;
		} else {
			Login[] nuevoArreglo = new Login[elementos.length - 1];
			for (int i = 1; i < elementos.length; i++) {
				nuevoArreglo[i - 1] = elementos[i];
			}
			elementos = nuevoArreglo;
			fin--;
		}
		return login;
	}

	@Override
	public Login frente() {
		if (estaVacia()) {
			System.out.println("La cola está vacía, no hay frente.");
			return null;
		}
		return elementos[frente];
	}

	@Override
	public boolean estaVacia() {
		return frente == -1 && fin == -1;
	}

	@Override
	public void mostrar() {
		if (estaVacia()) {
			System.out.println("La cola está vacía.");
			return;
		}
		for (int i = frente; i <= fin; i++) {
			System.out.println("ID Usuario: " + elementos[i].getId_Usuario() + ", Contraseña: "
					+ elementos[i].getContra() + ", ID Admin: " + elementos[i].getId_admini());
		}
	}
}
