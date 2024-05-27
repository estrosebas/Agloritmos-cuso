package TAD_Login;

import Entidad.Login;

public interface ListaInterfaceLogin {
	
	public void insertar(Login login);

	public boolean eliminar(String id_Usuario);

	public Login buscar(String id_Usuario);

	public void mostrar();

	public boolean estaVacia();
}
