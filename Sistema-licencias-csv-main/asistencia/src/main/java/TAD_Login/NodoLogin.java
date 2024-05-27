package TAD_Login;

import Entidad.Login;

public class NodoLogin {
	
	private Login login;
	private NodoLogin siguiente;

	public NodoLogin(Login login) {
		this.login = login;
		this.siguiente = null;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public NodoLogin getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoLogin siguiente) {
		this.siguiente = siguiente;
	}
}
